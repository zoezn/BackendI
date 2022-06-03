package com.dh.clinicadental.dao.impl;

import com.dh.clinicadental.dao.IDao;
import com.dh.clinicadental.dao.configuracion.ConfiguracionJDBC;
import com.dh.clinicadental.model.Domicilio;
import org.apache.log4j.Logger;

import java.sql.*;


public class DomicilioDaoH2 implements IDao<Domicilio> {
    private ConfiguracionJDBC configuracionJDBC;
    final static Logger logger = Logger.getLogger(DomicilioDaoH2.class);

    //constructor de conexion a db
    public DomicilioDaoH2(){
        this.configuracionJDBC = new ConfiguracionJDBC();
    }


    @Override
    public Domicilio guardar(Domicilio domicilio) {
        logger.debug("Guardando un nuevo domicilio: " + domicilio.toString());
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        PreparedStatement preparedStatement = null;
        String query = String.format("INSERT INTO domicilios (calle,numero,localidad,provincia) VALUES ('%s','%s','%s','%s')", domicilio.getCalle(), domicilio.getNumero(), domicilio.getLocalidad(), domicilio.getProvincia());

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error(e);
        }
        return domicilio;
    }

    @Override
    public Domicilio buscar(Integer id) {
        logger.info("Buscando un domicilio con id " + id + ": ");
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        PreparedStatement preparedStatement = null;
        Domicilio domicilio = null;
        String query = String.format("SELECT * FROM domicilios WHERE id = ?");

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()){
                int idM = result.getInt("id");
                String calle = result.getString("calle");
                int numero = result.getInt("numero");
                String localidad = result.getString("localidad");
                String provincia = result.getString("provincia");
                domicilio = new Domicilio(idM, calle, numero, localidad, provincia);
            }

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error(e);
        }
        return domicilio;
    }

    @Override
    public Domicilio eliminar(Integer id) {
        logger.debug("Eliminando un domicilio con id " + id + ": ");
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        PreparedStatement preparedStatement = null;
        Domicilio domicilio = null;
        String query = String.format("DELETE FROM domicilios WHERE id = ?");
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()){
                int idM = result.getInt("id");
                String calle = result.getString("calle");
                int numero = result.getInt("numero");
                String localidad = result.getString("localidad");
                String provincia = result.getString("provincia");
                domicilio = new Domicilio(idM, calle, numero, localidad, provincia);
            }

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error(e);
        }
        return domicilio;
    }
}
