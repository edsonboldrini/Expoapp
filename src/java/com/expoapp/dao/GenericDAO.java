/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao;

import java.util.List;

/**
 *
 * @author 20151bsi0223
 */
public interface GenericDAO<T> {
    
    public void inserir( T obj);
    public void alterar( T obj);
    public T getById(Class clazz,Integer id);
    public List<T> listar(Class clazz);
    public List<T> listar();
    public void delete(T obj);
}
