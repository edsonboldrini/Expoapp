/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.BairroDao;
import com.expoapp.entity.Bairro;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yagoz
 */
@Repository
@Transactional
public class BairroDaoImpl extends GenericDAOImpl<Bairro> implements BairroDao{

    @Override
    public List<Bairro> listar(Class clazz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bairro> listar() {
        return sessionFactory.getCurrentSession().createQuery("select bairro from Bairro bairro order by bairro.id desc").list();
    }
    
}
