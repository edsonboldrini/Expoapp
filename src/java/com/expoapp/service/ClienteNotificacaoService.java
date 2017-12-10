/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service;

import com.expoapp.dto.ClienteNotificacaoDto;
import com.expoapp.util.Observer;
import java.util.List;

/**
 *
 * @author yagoz
 */
public interface ClienteNotificacaoService extends Observer {

    public boolean isPresent(ClienteNotificacaoDto clienteNotificacaoDto);

    public List<ClienteNotificacaoDto> findAll();

    public void create(ClienteNotificacaoDto clienteNotificacaoDto);

    public void remove(ClienteNotificacaoDto clienteNotificacaoDto);
}
