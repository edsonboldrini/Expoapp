/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.GenericDAO;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author 20151bsi0223
 */
@Repository
@Transactional
public abstract class GenericDAOImpl<T> implements GenericDAO<T> 
{
    @Autowired
    protected SessionFactory sessionFactory ;
 
    @Override
    public void inserir(T obj)
    {
        sessionFactory.getCurrentSession().save(obj);
    }
    
    @Override
    public void alterar (T obj)
    {
        sessionFactory.getCurrentSession().merge(obj);
    }
    
    @Override
    public List<T> listar(Class clazz){
        return sessionFactory.getCurrentSession().createCriteria(clazz).list();
    }
    @Override
    public void delete(T obj){
        sessionFactory.getCurrentSession().delete(obj);
    }
    
    @Override
    public T getById(Class clazz,Integer id){
        return (T)sessionFactory.getCurrentSession().get(clazz, id);
    }
}
