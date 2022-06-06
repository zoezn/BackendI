package com.dh.clinica.dao;

import com.dh.clinica.model.Odontologo;

import java.util.List;

public interface IDao<T> {

    public T guardar (T t);
    public List<T> listar ();


}
