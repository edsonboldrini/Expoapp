/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import domain.models.ExposicaoTemp;

/**
 *
 * @author edson
 */
public class ExposicaoTempDAOImpl extends GenericDAOImpl<ExposicaoTemp> implements ExposicaoTempDAO{

    @Override
    public ExposicaoTemp getById(int id) {
        return entityManager.find(ExposicaoTemp.class, id);
    }

}
