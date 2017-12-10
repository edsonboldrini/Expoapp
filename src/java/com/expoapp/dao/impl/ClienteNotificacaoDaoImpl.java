/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.ClienteNotificacaoDao;
import com.expoapp.entity.Cliente;
import com.expoapp.entity.Notificacao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yagoz
 */
@Repository
@Transactional
public class ClienteNotificacaoDaoImpl implements ClienteNotificacaoDao {

    @Autowired
    protected SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Override
    public List<Notificacao> notificacoes(Integer clienteid) {
        return sessionFactory.getCurrentSession().createQuery("select distinct n from Notificacao n join n.clientes c where c.id = " + clienteid).list();
    }

    @Override
    public List<Cliente> isPresent(Integer clienteId, Integer notificacaoId) {
        String hql = "select distinct n from Notificacao n join n.clientes c where n.id=:clienteid and c.id=:notificacaoid";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("clienteid", clienteId);
        query.setParameter("notificacaoid", notificacaoId);
        return query.list();
    }

    @Override
    public List<Cliente> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select distinct n from Notificacao n join n.clientes c").list();
    }

}
