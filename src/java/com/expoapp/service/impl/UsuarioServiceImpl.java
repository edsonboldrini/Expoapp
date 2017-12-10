/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service.impl;

import com.expoapp.dao.BairroDao;
import com.expoapp.dao.UsuarioDao;
import com.expoapp.dto.UsuarioDto;
import com.expoapp.entity.Bairro;
import com.expoapp.entity.Usuario;
import com.expoapp.mapper.UsuarioMapper;
import com.expoapp.service.UsuarioService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yagoz
 */
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;
    @Autowired
    private BairroDao bairroDao;

    @Autowired
    private UsuarioMapper usuarioMapper;

    @Override
    public void create(UsuarioDto usuarioDto) {
        Usuario usuario = usuarioMapper.mapDtoToEntity(usuarioDto);
        if(null != usuarioDto.getBairroid()){
            Bairro bairro = bairroDao.getById(Bairro.class,usuarioDto.getBairroid());
            usuario.setBairro(bairro);
        }
        usuarioDao.inserir(usuario);
    }

    @Override
    public List<UsuarioDto> findAll() {
        List<Usuario> usuarios = usuarioDao.listar();

        List<UsuarioDto> usuarioDtos = new ArrayList<UsuarioDto>();

        for (Usuario usuario : usuarios) {
            usuarioDtos.add(usuarioMapper.mapEntityToDto(usuario));
        }

        return usuarioDtos;
    }

    @Override
    public UsuarioDto findById(Integer id) {
        Usuario usuario = usuarioDao.getById(Usuario.class, id);
        UsuarioDto usuarioDto = null;
        if (null != usuario) {
            usuarioDto = usuarioMapper.mapEntityToDto(usuario);
        }
        return usuarioDto;
    }

    @Override
    public void remove(Integer usuarioId) {
        Usuario usuario = usuarioDao.getById(Usuario.class,usuarioId);

        usuarioDao.delete(usuario);
    }

    @Override
    public void edit(UsuarioDto usuarioDto) {
        usuarioDao.alterar(usuarioMapper.mapDtoToEntity(usuarioDto));
    }

    @Override
    public List<UsuarioDto> listar() {
        List<Usuario> usuarios = usuarioDao.listar(Usuario.class);

        List<UsuarioDto> usuarioDtos = new ArrayList<UsuarioDto>();

        for (Usuario usuario : usuarios) {
            usuarioDtos.add(usuarioMapper.mapEntityToDto(usuario));
        }

        return usuarioDtos;
    }

    @Override
    public UsuarioDto buscaPorCpf(String cpf) {
        Usuario usuario = usuarioDao.getByCpf(cpf);
        UsuarioDto usuarioDto = null;
        if (null != usuario) {
            usuarioDto = usuarioMapper.mapEntityToDto(usuario);
        }
        return usuarioDto;
    }

    @Override
    public UsuarioDto buscaPorCnpj(String cnpj) {
        Usuario usuario = usuarioDao.getByCnpj(cnpj);
        UsuarioDto usuarioDto = null;
        if (null != usuario) {
            usuarioDto = usuarioMapper.mapEntityToDto(usuario);
        }
        return usuarioDto;
    }

    @Override
    public UsuarioDto buscaLoginSenha(String login, String senha) {
        Usuario usuario = usuarioDao.login(login,senha);
        UsuarioDto usuarioDto = null;
        if (null != usuario) {
            usuarioDto = usuarioMapper.mapEntityToDto(usuario);
        }
        return usuarioDto;
    }

    @Override
    public List<UsuarioDto> listarClientes() {
        List<Usuario> usuarios = usuarioDao.listarClientes();

        List<UsuarioDto> usuarioDtos = new ArrayList<UsuarioDto>();

        for (Usuario usuario : usuarios) {
            usuarioDtos.add(usuarioMapper.mapEntityToDto(usuario));
        }

        return usuarioDtos;
    }

    @Override
    public List<UsuarioDto> listarEmpresas() {
        List<Usuario> usuarios = usuarioDao.listarEmpresa();

        List<UsuarioDto> usuarioDtos = new ArrayList<UsuarioDto>();

        for (Usuario usuario : usuarios) {
            usuarioDtos.add(usuarioMapper.mapEntityToDto(usuario));
        }

        return usuarioDtos;
    }

}
