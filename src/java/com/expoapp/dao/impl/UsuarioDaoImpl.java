/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.UsuarioDao;
import com.expoapp.entity.Cliente;
import com.expoapp.entity.Empresa;
import com.expoapp.entity.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author edson
 */
@Repository
@Transactional
public class UsuarioDaoImpl extends GenericDAOImpl<Usuario> implements UsuarioDao{

    
    @Override
    public List<Usuario> listar() {
        return sessionFactory.getCurrentSession().createQuery("select usuario from Usuario usuario order by usuario.id desc").list();
    }

    @Override
    public Usuario getByCpf(String cpf) {
        Criteria cr = sessionFactory.getCurrentSession().createCriteria(Cliente.class);
        cr.add(Restrictions.eq("cpf", cpf));
        return (Cliente)cr.uniqueResult();
    }

    @Override
    public Usuario getByCnpj(String cnpj) {
        Criteria cr = sessionFactory.getCurrentSession().createCriteria(Empresa.class);
        cr.add(Restrictions.eq("cnpj", cnpj));
        return (Empresa)cr.uniqueResult();
    }

    @Override
    public Usuario login(String login, String senha) {
        Criteria cr = sessionFactory.getCurrentSession().createCriteria(Usuario.class);
        Criterion log = Restrictions.eq("login", login);
        Criterion sen = Restrictions.eq("senha",senha);
        
        LogicalExpression andExp = Restrictions.and(log, sen);
        cr.add( andExp );
        
        return (Usuario)cr.uniqueResult();
    }

}
