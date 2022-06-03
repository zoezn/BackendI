package com.dh.clinicadental.dao.impl;

import com.dh.clinicadental.dao.IDao;
import com.dh.clinicadental.dao.configuracion.ConfiguracionJDBC;
import com.dh.clinicadental.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PacienteDaoH2 implements IDao<Paciente> {
    private ConfiguracionJDBC configuracionJDBC;
    final static Logger logger = Logger.getLogger(PacienteDaoH2.class);

    //constructor de conexion a db
    public PacienteDaoH2(){
        this.configuracionJDBC = new ConfiguracionJDBC();
    }

    @Override
    public Paciente guardar(Paciente paciente) {
        logger.debug("Guardando un nuevo domicilio: " + paciente.toString());
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        PreparedStatement preparedStatement = null;
        String query = String.format("INSERT INTO pacientes (apellido, nombre, dni, fechaDeIngreso, domicilio) VALUES ('%s','%s','%s','%s','%s')", paciente.getApellido(), paciente.getNombre(), paciente.getDni(), paciente.getFechaDeIngreso(), paciente.getDomicilio().getId());

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error(e);
        }
        return paciente;
    }

    @Override
    public Paciente buscar(Integer id) {
        return null;
    }

    @Override
    public Paciente eliminar(Integer id) {
        return null;
    }


}
