/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import domain.models.Cliente;

/**
 *
 * @author edson
 */
public interface ClienteDAO extends GenericDAO<Cliente>{
    public void removeByCpf(String cpf);
    
}
