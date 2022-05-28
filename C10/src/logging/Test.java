package logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;

public class Test {

    private final static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        File log4jfile = new File("./src/logging/config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        Tigre tigre1 = new Tigre("Juan", 5);
        Tigre tigre2 = new Tigre("Pedro", 11);
        Tigre tigre3 = new Tigre("Maria", -1);
        Leon leon1 = new Leon("Omar", 5, false);
        Leon leon2 = new Leon("Cristian", 11, true);
        Leon leon3 = new Leon("Anibal", 11, false);
        Leon leon4 = new Leon("Julian", -1, false);

        tigre1.correr();
        tigre2.correr();
        tigre3.correr();
        leon1.correr();
        leon2.correr();
        leon3.correr();
        leon4.correr();

        try {
            tigre1.esMayorA10();
            tigre2.esMayorA10();
            tigre3.esMayorA10();
        } catch (Exception e){
            logger.error("Hubo un error con los tigres", e);
        }

        try {
            leon1.esMayorA10();
            leon2.esMayorA10();
            leon3.esMayorA10();
            leon4.esMayorA10();
        } catch (Exception e){
            logger.error("Hubo un error con los leones", e);
        }
    }

}
