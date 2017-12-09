/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service.impl;

import com.expoapp.dao.ClienteNotificacaoDao;
import com.expoapp.dao.NotificacaoDao;
import com.expoapp.dao.UsuarioDao;
import com.expoapp.dto.ClienteDto;
import com.expoapp.dto.ClienteNotificacaoDto;
import com.expoapp.dto.NotificacaoDto;
import com.expoapp.dto.UsuarioDto;
import com.expoapp.entity.Cliente;
import com.expoapp.entity.Notificacao;
import com.expoapp.entity.Usuario;
import com.expoapp.mapper.NotificacaoMapper;
import com.expoapp.mapper.UsuarioMapper;
import com.expoapp.service.ClienteNotificacaoService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yagoz
 */
@Service
@Transactional
public class ClienteNotificacaoServiceImpl implements ClienteNotificacaoService {

    @Autowired
    private UsuarioDao clienteDao;

    @Autowired
    private UsuarioMapper clienteMapper;

    @Autowired
    private NotificacaoDao notificacaoDao;

    @Autowired
    private NotificacaoMapper notificacaoMapper;

    @Autowired
    private ClienteNotificacaoDao clienteNotificacaoDao;

    @Override
    public boolean isPresent(ClienteNotificacaoDto clienteNotificacaoDto) {
        boolean status = false;

        List<Cliente> clienteList = clienteNotificacaoDao.isPresent(clienteNotificacaoDto.getCliente().getId(), clienteNotificacaoDto.getNotificacao().getId());

        if (null != clienteList) {
            if (clienteList.size() > 0) {
                status = true;
            }
        }
        return status;
    }

    @Override
    public List<ClienteNotificacaoDto> findAll() {
        List<ClienteNotificacaoDto> clienteNotificacaoDtos = new ArrayList<ClienteNotificacaoDto>();

        List<Cliente> clientList = clienteNotificacaoDao.getAll();

        for (Cliente client : clientList) {

            UsuarioDto clientDto = clienteMapper.mapEntityToDto(client);
            Set<Notificacao> notificacoes = client.getNotificacoes();

            for (Notificacao notificacao : notificacoes) {
                ClienteNotificacaoDto clienteNotificacaoDto = new ClienteNotificacaoDto();
                clienteNotificacaoDto.setCliente((ClienteDto) clientDto);
                NotificacaoDto accountDto = notificacaoMapper.mapEntityToDto(notificacao);
                clienteNotificacaoDto.setNotificacao(accountDto);
                clienteNotificacaoDtos.add(clienteNotificacaoDto);
            }
        }
        return clienteNotificacaoDtos;
    }

    @Override
    public void create(ClienteNotificacaoDto clienteNotificacaoDto) {
        Integer clienteid = clienteNotificacaoDto.getCliente().getId();

        Integer notificacaoid = clienteNotificacaoDto.getNotificacao().getId();

        Cliente cliente = (Cliente)clienteDao.getById(Usuario.class,clienteid);

        Notificacao notificacao = notificacaoDao.getById(Notificacao.class,notificacaoid);

        cliente.getNotificacoes().add(notificacao);

        clienteDao.alterar(cliente);
    }

    @Override
    public void remove(ClienteNotificacaoDto clienteNotificacaoDto) {
        Integer clienteid = clienteNotificacaoDto.getCliente().getId();

        Integer notificacaoid = clienteNotificacaoDto.getNotificacao().getId();

        Cliente cliente = (Cliente)clienteDao.getById(Usuario.class,clienteid);

        Notificacao notificacao = notificacaoDao.getById(Notificacao.class,notificacaoid);

        cliente.getNotificacoes().remove(notificacao);

        clienteDao.alterar(cliente);
    }

}
