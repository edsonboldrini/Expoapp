/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.PecaDao;
import com.expoapp.entity.Peca;
import java.util.List;

/**
 *
 * @author yagoz
 */
public class PecaDaoImpl extends GenericDAOImpl<Peca> implements PecaDao{

    @Override
    public List<Peca> listar(Class clazz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Peca> listar() {
        return sessionFactory.getCurrentSession().createQuery("select peca from Peca peca order by peca.id").list();
    }
    
}
