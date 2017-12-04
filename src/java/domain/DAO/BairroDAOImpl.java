/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import com.expoapp.entity.Bairro;

/**
 *
 * @author edson
 */
public class BairroDAOImpl extends GenericDAOImpl<Bairro> implements BairroDAO{

    @Override
    public Bairro getById(int id) {
        return entityManager.find(Bairro.class, id);
    }
    
}
