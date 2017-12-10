/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.PecaDao;
import com.expoapp.entity.Peca;
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
public class PecaDaoImpl extends GenericDAOImpl<Peca> implements PecaDao{

    @Override
    public List<Peca> listar() {
        return sessionFactory.getCurrentSession().createQuery("select peca from Peca peca order by peca.id").list();
    }

    @Override
    public List<Peca> buscaPorExposicao(Integer exposicaoId) {
        String qry = "select pc from Peca pc join pc.exposicao exp where exp.id=:exposicaoid order by pc.id desc";
        Query q= sessionFactory.getCurrentSession().createQuery(qry);
        q.setParameter("exposicaoid", exposicaoId);
        return q.list();
    }
    
}
