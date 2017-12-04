/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import com.expoapp.entity.Empresa;

/**
 *
 * @author edson
 */
public class EmpresaDAOImpl extends GenericDAOImpl<Empresa> implements EmpresaDAO{

    @Override
    public Empresa getById(int id) {
        return entityManager.find(Empresa.class, id);
    }
    
}
