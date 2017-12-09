/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao;

import com.expoapp.dao.GenericDAO;
import com.expoapp.entity.Usuario;

/**
 *
 * @author edson
 */
public interface UsuarioDao extends GenericDAO<Usuario>{
    public Usuario getByCpf(String cpf);
    public Usuario getByCnpj(String cnpj);
    public Usuario login(String login,String senha);
}
