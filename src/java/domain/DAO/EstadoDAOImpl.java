/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import com.expoapp.entity.Estado;

/**
 *
 * @author edson
 */
public class EstadoDAOImpl extends GenericDAOImpl<Estado> implements EstadoDAO{

    @Override
    public Estado getById(int id) {
        return entityManager.find(Estado.class, id);
    }
    
}
