/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.ExposicaoDao;
import com.expoapp.entity.Exposicao;
import java.util.List;
import org.hibernate.Query;
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

    @Override
    public List<Exposicao> buscarExposicoesEmpresa(Integer empresaId) {
        String hql = "select e from Exposicao e join e.empresa emp where emp.id=:empresaid order by e.id desc";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("empresaid", empresaId);
        return query.list();
    }
    
}
