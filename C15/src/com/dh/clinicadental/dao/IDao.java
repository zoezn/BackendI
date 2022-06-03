package com.dh.clinicadental.dao;

public interface IDao <T> {

    public T guardar(T t);
    public T buscar(Integer id);
    public T eliminar(Integer id);
}
