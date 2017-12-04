/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import com.expoapp.entity.Imagem;

/**
 *
 * @author edson
 */
public class ImagemDAOImpl extends GenericDAOImpl<Imagem> implements ImagemDAO{

    @Override
    public Imagem getById(int id) {
        return entityManager.find(Imagem.class, id);
    }

}
