/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao;

import com.expoapp.entity.Cliente;
import com.expoapp.entity.Notificacao;
import java.util.List;


/**
 *
 * @author yagoz
 */

public interface ClienteNotificacaoDao {
    public List<Notificacao> notificacoes(Integer clienteId);
    public List<Cliente> isPresent(Integer clienteId, Integer notificacaoId);
    public List<Cliente> getAll();
}
