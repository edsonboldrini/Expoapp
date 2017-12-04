/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import com.expoapp.entity.Resposta;

/**
 *
 * @author edson
 */
public class RespostaDAOImpl extends GenericDAOImpl<Resposta>{

    @Override
    public Resposta getById(int id) {
        return entityManager.find(Resposta.class, id);
    }
    
}
