/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao.impl;

import com.expoapp.dao.ComentarioDao;
import com.expoapp.entity.Comentario;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yagoz
 */
@Repository
@Transactional
public class ComentarioDaoImpl extends GenericDAOImpl<Comentario> implements ComentarioDao{ 

    @Override
    public List<Comentario> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
