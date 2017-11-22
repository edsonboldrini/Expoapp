/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.controller;

import domain.DAO.ClienteDAOImpl;
import domain.models.Cliente;
import java.util.List;

/**
 *
 * @author yagoz
 */
public class ClienteController {
    ClienteDAOImpl clienteDao = new ClienteDAOImpl();
    
    public void inserirCliente(Cliente cliente) throws Exception{
        
        clienteDao.inserir(cliente);
    }
    
    public void deletarCliente(Cliente cliente){
        clienteDao.remove(cliente);
    }
    
    public void deletarClientePorCpf(String cpf){
        clienteDao.removeByCpf(cpf);
    }
    
    public List<Cliente> listar(){
        return clienteDao.listar(Cliente.class);
    }
}
