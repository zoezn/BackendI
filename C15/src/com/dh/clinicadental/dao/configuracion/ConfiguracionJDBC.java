package com.dh.clinicadental.dao.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracionJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String nombreUsuario;
    private String contrasenaUsuario;
    private Connection connection;

    public ConfiguracionJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:clinica;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nombreUsuario = "sa";
        this.contrasenaUsuario = "";
    }

    public Connection conectarConBaseDeDatos() {
        try {
            connection = DriverManager.getConnection(dbUrl, nombreUsuario, contrasenaUsuario);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
}
