/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.UsuarioDao;
import com.expoapp.entity.Usuario;
import java.util.List;
import org.hibernate.SessionFactory;
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
    public List<Usuario> listar(Class clazz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
