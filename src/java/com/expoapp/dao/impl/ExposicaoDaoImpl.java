/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.ExposicaoDao;
import com.expoapp.entity.Exposicao;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yagoz
 */
@Repository
@Transactional
public class ExposicaoDaoImpl extends GenericDAOImpl<Exposicao> implements ExposicaoDao{

    @Override
    public List<Exposicao> listar(Class clazz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Exposicao> listar() {
        return sessionFactory.getCurrentSession().createQuery("select exposicao from Exposicao exposicao order by exposicao.id desc").list();
    }
    
}
