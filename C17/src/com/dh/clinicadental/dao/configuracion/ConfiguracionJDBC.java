package com.dh.clinicadental.dao.configuracion;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracionJDBC {
    private String DB_JDBC_DRIVER;
    private String DB_URL;
    private String DB_USER;
    private String DB_PASSWORD;
    private Connection connection;
    final static Logger logger = Logger.getLogger(ConfiguracionJDBC.class);

    public ConfiguracionJDBC() {
        this.DB_JDBC_DRIVER = "org.h2.Driver";
        this.DB_URL = "jdbc:h2:~/test;INIT=RUNSCRIPT FROM 'src/create.sql'";
        this.DB_USER = "sa";
        this.DB_PASSWORD = "";
    }

    public Connection conectarConBaseDeDatos() {
        try {
            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

        } catch (SQLException e) {
            logger.error(e);
        }
        return connection;
    }
}
