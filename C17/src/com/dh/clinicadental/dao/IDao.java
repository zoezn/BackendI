package com.dh.clinicadental.dao;

import com.dh.clinicadental.model.Odontologo;

import java.util.List;

public interface IDao<T> {

    public T guardar (T t);
    public List<T> listar ();


}
