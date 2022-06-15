import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.swing.plaf.nimbus.State;
import java.io.File;
import java.sql.*;

public class Test {

    private final static Logger logger = Logger.getLogger(Test.class);


    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS EMPLEADOS; CREATE TABLE EMPLEADOS "
            + "("
            + " id INT PRIMARY KEY NOT NULL,"
            + " nombre VARCHAR(100), "
            + " apellido VARCHAR(100), "
            + "  edad INT, "
            + "  mail VARCHAR(100) "
            + " )";

    private static final String SQL_INSERT1 = "INSERT INTO EMPLEADOS (id, nombre) VALUES (1, 'Zoe')";
    private static final String SQL_INSERT2 = "INSERT INTO EMPLEADOS (id, nombre) VALUES (2, 'Juan')";
    private static final String SQL_INSERT3 = "INSERT INTO EMPLEADOS (id, nombre) VALUES (1, 'Santi')";

    private static final String SQL_UPDATE1 = "UPDATE EMPLEADOS SET apellido = 'Jimenez' WHERE id = 1";

    private static final String SQL_DELETE1 = "DELETE FROM EMPLEADOS WHERE id = 2";
    private static final String SQL_DELETE2 = "DELETE FROM EMPLEADOS WHERE nombre = 'Zoe'";


    public static void main(String[] args) throws SQLException {
        File log4jfile = new File("./src/logging/config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        Connection connection = null;


        try {
            connection = getConnection();

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement statement1 = connection.createStatement();
            statement1.execute(SQL_INSERT1);

            Statement statement2 = connection.createStatement();
            statement2.execute(SQL_INSERT2);

            Statement statement3 = connection.createStatement();
            statement3.execute(SQL_INSERT3);

            String sql = "SELECT * FROM EMPLEADOS";
            Statement sqlSmt = connection.createStatement();
            ResultSet rs = sqlSmt.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getInt(1));
            }
        } catch (Exception e){
            logger.error("Hubo un error: ", e);

        } finally {
            connection.close();
        }


        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_UPDATE1);
            String sql = "SELECT * FROM EMPLEADOS WHERE id = 1";
            Statement sqlSmt = connection.createStatement();
            ResultSet rs = sqlSmt.executeQuery(sql);
            logger.debug(rs);
            System.out.println(rs);
        } catch (Exception e) {
            logger.error("Hubo un error: ", e);
        } finally {
            connection.close();
        }

        try {
            connection = getConnection();
            String sql = "SELECT * FROM EMPLEADOS WHERE id = 2";
            Statement sqlSmt = connection.createStatement();
            ResultSet rs = sqlSmt.executeQuery(sql);
            Statement statement = connection.createStatement();
            statement.execute(SQL_DELETE1);
            logger.info("Empleado eliminado");
            logger.info(rs);
        } catch (Exception e) {
            logger.error("Hubo un error: ", e);
        } finally {
            connection.close();
        }

        try {
            connection = getConnection();
            String sql = "SELECT * FROM EMPLEADOS WHERE nombre = 'Zoe'";
            Statement sqlSmt = connection.createStatement();
            ResultSet rs = sqlSmt.executeQuery(sql);
            Statement statement = connection.createStatement();
            statement.execute(SQL_DELETE2);
            logger.info("Empleado eliminado");
            logger.info(rs);
        } catch (Exception e) {
            logger.error("Hubo un error: ", e);
        } finally {
            connection.close();
        }

    }

}
