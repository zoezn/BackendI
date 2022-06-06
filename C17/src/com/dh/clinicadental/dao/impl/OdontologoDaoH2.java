package com.dh.clinicadental.dao.impl;

import com.dh.clinicadental.dao.IDao;
import com.dh.clinicadental.dao.configuracion.ConfiguracionJDBC;
import com.dh.clinicadental.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    private ConfiguracionJDBC configuracionJDBC;
    final static Logger logger = Logger.getLogger(OdontologoDaoH2.class);

    public OdontologoDaoH2(){
        this.configuracionJDBC = new ConfiguracionJDBC();
    }


    @Override
    public Odontologo guardar(Odontologo odontologo) {
        logger.debug("Guardando un nuevo odontologo: " /*+ odontologo.toString()*/);
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        PreparedStatement preparedStatement = null;
        String query = String.format("INSERT INTO odontologos (matricula, nombre, apellido) VALUES ('%s','%s','%s')", Statement.RETURN_GENERATED_KEYS, odontologo.getMatricula(), odontologo.getNombre(), odontologo.getApellido());

        try {

            preparedStatement = connection.prepareStatement("INSERT INTO odontologos (matricula, nombre, apellido) VALUES(?,?,?)",Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, odontologo.getMatricula());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());
            preparedStatement.executeUpdate();

            ResultSet keys = preparedStatement.getGeneratedKeys();

            if(keys.next()) {
                odontologo.setId(keys.getInt(1));
            }
            logger.info(odontologo.toString());
            preparedStatement.close();

        } catch (SQLException e) {
            logger.error(e);
        }

        return odontologo;
    }

    @Override
    public List<Odontologo> listar() {
        logger.debug("Listando todos los odontologos: ");
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        PreparedStatement preparedStatement = null;
        String query = String.format("SELECT * FROM odontologos");
        List<Odontologo> odontologos = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(query);

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                int matricula = result.getInt("matricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");

                Odontologo odontologo = new Odontologo(matricula, nombre, apellido);
                odontologo.setId(id);

                odontologos.add(odontologo);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            logger.error(e);
        }
        return odontologos;
    }
}
