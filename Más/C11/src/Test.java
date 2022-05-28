import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

    /* Logger */
    private final static Logger logger = Logger.getLogger(Test.class);


   /* Hago la conexion con la db */
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/MasC11", "sa", "");
    }



    /* CODIGO DB */
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS EMPLEADOS; CREATE TABLE EMPLEADOS "
            + "("
            + " id INT PRIMARY KEY NOT NULL,"
            + " nombre VARCHAR(100), "
            + " edad INT, "
            + " empresa VARCHAR(100), "
            + " fecha VARCHAR(50) "
            + " )";


    private static final String SQL_INSERT1 = "INSERT INTO EMPLEADOS (id, nombre, empresa) VALUES (1, 'Kendrick', 'Digital')";
    private static final String SQL_INSERT2 = "INSERT INTO EMPLEADOS (id, nombre, empresa) VALUES (2, 'Kanye', 'Google')";
    private static final String SQL_INSERT3 = "INSERT INTO EMPLEADOS (id, nombre, empresa) VALUES (3, 'Juan', 'Facebook')";

    /*String sql = "select * from TEST";*/



    public static void main(String[] args) throws Exception{

        /* Logger */
        File log4jfile = new File("./src/logging/config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        /* Inicializo la conexion con al db */
        Connection connection = null;

        /*Statement statement = connection.createStatement();*/


        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            statement.execute(SQL_CREATE_TABLE);

            statement.execute(SQL_INSERT1);
            statement.execute(SQL_INSERT2);
            statement.execute(SQL_INSERT3);

            String sqlQuery = "SELECT * FROM EMPLEADOS";
            ResultSet rs = statement.executeQuery(sqlQuery);

            while (rs.next()){

                System.out.println("Empleado= id: " + rs.getInt(1) +", empresa: "+ rs.getString(4));
                logger.info("Empleado= id: " + rs.getInt(1) +", empresa: "+ rs.getString(4));
            }

        } catch (Exception e){
            logger.error("Hubo un error al ejecutar las querys: " + e);
            e.printStackTrace();

        } finally {
            try{
                connection.close();
            } catch (Exception e){
                logger.error("Hubo un error al cerrar la conexion: " + e);
                e.printStackTrace();
            }

        }

    }
}
