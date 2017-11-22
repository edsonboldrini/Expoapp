/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import domain.models.Comentario;

/**
 *
 * @author edson
 */
public class ComentarioDAOImpl extends GenericDAOImpl<Comentario> implements ComentarioDAO{

    @Override
    public Comentario getById(int id) {
        return entityManager.find(Comentario.class, id);
    }

    
}
