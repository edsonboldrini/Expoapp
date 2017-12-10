/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.ClienteEmpresaDao;
import com.expoapp.entity.Cliente;
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
public class ClienteEmpresaDaoImpl implements ClienteEmpresaDao {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Override
    public List<Cliente> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select distinct c from Cliente c join c.empresasSeguindo es").list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Cliente> isPresent(Integer clienteId, Integer empresaId) {
        String hql = "select distinct c from Cliente c join c.empresasSeguindo a where c.id=:clienteid and a.id=:empresaid";

        Query query = sessionFactory.getCurrentSession().createQuery(hql);

        query.setParameter("clienteid", clienteId);
        query.setParameter("empresaid", empresaId);

        return query.list();
    }

}
