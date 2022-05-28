package logging;

import org.apache.log4j.Logger;

public class Leon {
    private String nombre;
    private Integer edad;
    private Boolean esAlfa;
    private static final Logger logger = Logger.getLogger(Leon.class);

    public Leon(String nombre, Integer edad, Boolean esAlfa) {
        this.nombre = nombre;
        this.edad = edad;
        this.esAlfa = esAlfa;
    }

    public void correr(){
        logger.info("El leon " + nombre + " esta corriendo.");
    }

    public void esMayorA10() throws Exception{
        if (esAlfa && edad > 10){
            logger.info("El leon " + nombre + " es mayor a 10 y es alfa.");
        } else if (edad < 0){
            logger.info("La edad del leon " + nombre + " es incorrecta.");
            throw new Exception();
        } else if (edad > 10){
            logger.info("El leon " + nombre + " es mayor a 10.");
        } else {
            logger.info("El leon " + nombre + " NO es mayor a 10.");

        }
    }
}
