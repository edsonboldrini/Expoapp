/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service.impl;

import com.expoapp.dao.ClienteEmpresaDao;
import com.expoapp.dao.UsuarioDao;
import com.expoapp.dto.ClienteDto;
import com.expoapp.dto.ClienteEmpresaDto;
import com.expoapp.dto.EmpresaDto;
import com.expoapp.entity.Cliente;
import com.expoapp.entity.Empresa;
import com.expoapp.entity.Usuario;
import com.expoapp.mapper.UsuarioMapper;
import com.expoapp.service.ClienteEmpresaService;
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
public class ClienteEmpresaServiceImpl implements ClienteEmpresaService {

    @Autowired
    private ClienteEmpresaDao clienteEmpresaDao;

    @Autowired
    private UsuarioMapper usuarioMapper;

    @Autowired

    private UsuarioDao usuarioDao;

    @Override
    public boolean isPresent(ClienteEmpresaDto clienteEmpresaDto) {
        boolean status = false;

        List<Cliente> clientList = clienteEmpresaDao.isPresent(clienteEmpresaDto.getClienteDto().getId(), clienteEmpresaDto.getEmpresaDto().getId());

        if (null != clientList) {
            if (clientList.size() > 0) {
                status = true;
            }
        }

        return status;
    }

    @Override
    public List<ClienteEmpresaDto> findAll() {
        List<ClienteEmpresaDto> clienteEmpresaDtos = new ArrayList<ClienteEmpresaDto>();

        List<Cliente> clientList = clienteEmpresaDao.getAll();

        for (Cliente client : clientList) {
            ClienteDto clientDto = (ClienteDto) usuarioMapper.mapEntityToDto(client);
            Set<Empresa> empresas = client.getEmpresasSeguindo();

            for (Empresa empresa : empresas) {
                ClienteEmpresaDto clienteEmpresaDto = new ClienteEmpresaDto();
                clienteEmpresaDto.setClienteDto(clientDto);
                EmpresaDto empresaDto = (EmpresaDto) usuarioMapper.mapEntityToDto(empresa);
                clienteEmpresaDto.setEmpresaDto(empresaDto);
                clienteEmpresaDtos.add(clienteEmpresaDto);
            }
        }
        return clienteEmpresaDtos;
    }

    @Override
    public void create(ClienteEmpresaDto clienteEmpresaDto) {
        Integer clienteid = clienteEmpresaDto.getClienteDto().getId();

        Integer empresaid = clienteEmpresaDto.getEmpresaDto().getId();

        Cliente cliente = (Cliente) usuarioDao.getById(Usuario.class, clienteid);

        Empresa empresa = (Empresa) usuarioDao.getById(Usuario.class, empresaid);
        cliente.getEmpresasSeguindo().add(empresa);

        usuarioDao.alterar(cliente);
    }

    @Override
    public void remove(ClienteEmpresaDto clienteEmpresaDto) {
        Integer clienteid = clienteEmpresaDto.getClienteDto().getId();
        Integer empresaid = clienteEmpresaDto.getEmpresaDto().getId();
        
        Cliente cliente = (Cliente)usuarioDao.getById(Usuario.class,clienteid);
        Empresa empresa = (Empresa)usuarioDao.getById(Usuario.class,empresaid);
        
        cliente.getEmpresasSeguindo().remove(empresa);

        usuarioDao.alterar(cliente);
    }

}
