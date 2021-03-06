package com.dh.clinica.service;


import com.dh.clinica.repository.IDao;
import com.dh.clinica.model.Domicilio;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DomicilioService {
    private IDao<Domicilio> domicilioDao;

    public DomicilioService(IDao<Domicilio> domicilioDao) {
        this.domicilioDao = domicilioDao;
    }
    public Domicilio guardar(Domicilio domicilio){
        domicilioDao.guardar(domicilio);
        return domicilio;
    }
    public Domicilio buscar(Integer id){
        return domicilioDao.buscar(id);
    }
    public List<Domicilio> buscarTodos(){
        return domicilioDao.buscarTodos();
    }
    public void eliminar(Integer id){
        domicilioDao.eliminar(id);
    }

}
