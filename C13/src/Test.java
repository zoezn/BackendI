import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.sql.*;

public class Test {
    private final static Logger logger = Logger.getLogger(Test.class);
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/Clase13", "sa", "");
    }

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS ODONTOLOGOS; CREATE TABLE ODONTOLOGOS "
            + "("
            + " id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,"
            + " apellido VARCHAR(100), "
            + " nombre VARCHAR(100), "
            + " matricula VARCHAR(100) "
            + " )";


    private static final String SQL_INSERT =  "INSERT INTO ODONTOLOGOS (APELLIDO, NOMBRE, MATRICULA) VALUES (?,?,?)";

    private static final String SQL_UPDATE =  "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE APELLIDO=?";


    public static void main(String[] args) throws Exception {
        File log4jfile = new File("./src/logging/config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        Connection connection = null;

        Odontologo odontologo1= new Odontologo("Lopez", "Juan", "asd");

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            PreparedStatement insert = connection.prepareStatement(SQL_INSERT);

            insert.setString(1, odontologo1.getApellido());
            insert.setString(2, odontologo1.getNombre());
            insert.setString(3, odontologo1.getMatricula());

            insert.execute();

            String sql = "SELECT * FROM ODONTOLOGOS";
            Statement sqlSmt = connection.createStatement();
            ResultSet rs = sqlSmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + ", "+rs.getString(2) + ", "+rs.getString(3) +", "+ rs.getString(4));
            }


            connection.setAutoCommit(false);


            PreparedStatement update = connection.prepareStatement(SQL_UPDATE);
            update.setString(1, "123");
            update.setString(2, "Lopez");
            update.execute();

            connection.commit();
            connection.setAutoCommit(true);
        } catch (Exception e){
            logger.error(e);
            connection.rollback();
        } finally {
            connection.close();
        }

        Connection connection2= getConnection();
        String sql1 = "SELECT * FROM ODONTOLOGOS";
        Statement sqlSmt2 = connection2.createStatement();
        ResultSet rs1 = sqlSmt2.executeQuery(sql1);
        while (rs1.next()) {
            System.out.println(rs1.getInt(1) + ", "+rs1.getString(2) + ", "+rs1.getString(3) +", "+ rs1.getString(4));
        }
    }

}
