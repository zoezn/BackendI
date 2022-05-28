package logging;

import org.apache.log4j.Logger;

public class Tigre {
    private String nombre;
    private Integer edad;
    private static final Logger logger = Logger.getLogger(Tigre.class);

    public Tigre(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void correr(){
        logger.info("El tigre " + nombre + " esta corriendo.");
    }

    public void esMayorA10() throws Exception{
        if (edad > 10){
            logger.info("El tigre " + nombre + " es mayor a 10.");

        } else if (edad < 0){
            logger.info("La edad del tigre " + nombre + " es incorrecta.");
            throw new Exception();
        } else {
            logger.info("El tigre " + nombre + " NO es mayor a 10.");
    }
}}
