/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.mapper;

import com.expoapp.dto.ClienteDto;
import com.expoapp.dto.EmpresaDto;
import com.expoapp.dto.UsuarioDto;
import com.expoapp.entity.*;
import org.springframework.stereotype.Component;

/**
 *
 * @author yagoz
 */
@Component
public class UsuarioMapper {

    public Usuario mapDtoToEntity(UsuarioDto usuarioDto) {
        if (usuarioDto instanceof ClienteDto) {

            Cliente cliente = new Cliente();

            if (null != usuarioDto.getId()) {
                cliente.setId(usuarioDto.getId());
            }
            if (null != usuarioDto.getLogin()) {
                cliente.setLogin(usuarioDto.getLogin());
            }
            if (null != usuarioDto.getSenha()) {
                cliente.setSenha(usuarioDto.getSenha());
            }
            if (null != usuarioDto.getEmail()) {
                cliente.setEmail(usuarioDto.getEmail());
            }
            if (null != usuarioDto.getDt_cadastro()) {
                cliente.setDt_cadastro(usuarioDto.getDt_cadastro());
            }
            if (null != usuarioDto.getNome()) {
                cliente.setNome(usuarioDto.getNome());
            }
            if (null != usuarioDto.getLogradouro()) {
                cliente.setLogradouro(usuarioDto.getLogradouro());
            }
            if (null != usuarioDto.getCep()) {
                cliente.setCep(usuarioDto.getCep());
            }
            if (null != usuarioDto.getEndereco()) {
                cliente.setEndereco(usuarioDto.getEndereco());
            }

            if (null != ((ClienteDto) usuarioDto).getCpf()) {
                cliente.setCpf(((ClienteDto) usuarioDto).getCpf());
            }
            if (null != ((ClienteDto) usuarioDto).getDataNascimento()) {
                cliente.setDataNascimento(((ClienteDto) usuarioDto).getDataNascimento());
            }
            if ('\0' != ((ClienteDto) usuarioDto).getSexo()) {
                cliente.setSexo(((ClienteDto) usuarioDto).getSexo());
            }

            return cliente;

        } else if (usuarioDto instanceof EmpresaDto) {

            Empresa empresa = new Empresa();

            if (null != usuarioDto.getId()) {
                empresa.setId(usuarioDto.getId());
            }
            if (null != usuarioDto.getLogin()) {
                empresa.setLogin(usuarioDto.getLogin());
            }
            if (null != usuarioDto.getSenha()) {
                empresa.setSenha(usuarioDto.getSenha());
            }
            if (null != usuarioDto.getEmail()) {
                empresa.setEmail(usuarioDto.getEmail());
            }
            if (null != usuarioDto.getDt_cadastro()) {
                empresa.setDt_cadastro(usuarioDto.getDt_cadastro());
            }
            if (null != usuarioDto.getNome()) {
                empresa.setNome(usuarioDto.getNome());
            }
            if (null != usuarioDto.getLogradouro()) {
                empresa.setLogradouro(usuarioDto.getLogradouro());
            }
            if (null != usuarioDto.getCep()) {
                empresa.setCep(usuarioDto.getCep());
            }
            if (null != usuarioDto.getEndereco()) {
                empresa.setEndereco(usuarioDto.getEndereco());
            }

            if (null != ((EmpresaDto) usuarioDto).getCnpj()) {
                empresa.setCnpj(((EmpresaDto) usuarioDto).getCnpj());
            }
            
            if (null != ((EmpresaDto) usuarioDto).getDtAbertura()) {
                empresa.setDtAbertura(((EmpresaDto) usuarioDto).getDtAbertura());
            }
            
            if (null != ((EmpresaDto) usuarioDto).getSobre()) {
                empresa.setSobre(((EmpresaDto) usuarioDto).getSobre());
            }

            return empresa;

        }

        return null;

    }

    public UsuarioDto mapEntityToDto(Usuario usuario) {

        if (usuario instanceof Cliente) {

            ClienteDto clienteDto = new ClienteDto();

            if (null != usuario.getId()) {
                clienteDto.setId(usuario.getId());
            }
            if (null != usuario.getLogin()) {
                clienteDto.setLogin(usuario.getLogin());
            }
            if (null != usuario.getSenha()) {
                clienteDto.setSenha(usuario.getSenha());
            }
            if (null != usuario.getEmail()) {
                clienteDto.setEmail(usuario.getEmail());
            }
            if (null != usuario.getDt_cadastro()) {
                clienteDto.setDt_cadastro(usuario.getDt_cadastro());
            }
            if (null != usuario.getNome()) {
                clienteDto.setNome(usuario.getNome());
            }
            if (null != usuario.getLogradouro()) {
                clienteDto.setLogradouro(usuario.getLogradouro());
            }
            if (null != usuario.getCep()) {
                clienteDto.setCep(usuario.getCep());
            }
            if (null != usuario.getEndereco()) {
                clienteDto.setEndereco(usuario.getEndereco());
            }
            
            if(null != usuario.getBairro()){
                clienteDto.setBairroid(usuario.getBairro().getId());
            }

            if (null != ((Cliente) usuario).getCpf()) {
                clienteDto.setCpf(((Cliente) usuario).getCpf());
            }
            if (null != ((Cliente) usuario).getDataNascimento()) {
                clienteDto.setDataNascimento(((Cliente) usuario).getDataNascimento());
            }
            if ('\0' != ((Cliente) usuario).getSexo()) {
                clienteDto.setSexo(((Cliente) usuario).getSexo());
            }

            return clienteDto;

        } else if (usuario instanceof Empresa) {

            EmpresaDto empresaDto = new EmpresaDto();

            if (null != usuario.getId()) {
                empresaDto.setId(usuario.getId());
            }
            if (null != usuario.getLogin()) {
                empresaDto.setLogin(usuario.getLogin());
            }
            if (null != usuario.getSenha()) {
                empresaDto.setSenha(usuario.getSenha());
            }
            if (null != usuario.getEmail()) {
                empresaDto.setEmail(usuario.getEmail());
            }
            if (null != usuario.getDt_cadastro()) {
                empresaDto.setDt_cadastro(usuario.getDt_cadastro());
            }
            if (null != usuario.getNome()) {
                empresaDto.setNome(usuario.getNome());
            }
            if (null != usuario.getLogradouro()) {
                empresaDto.setLogradouro(usuario.getLogradouro());
            }
            if (null != usuario.getCep()) {
                empresaDto.setCep(usuario.getCep());
            }
            if (null != usuario.getEndereco()) {
                empresaDto.setEndereco(usuario.getEndereco());
            }
            if(null != usuario.getBairro()){
                empresaDto.setBairroid(usuario.getBairro().getId());
            }

            if (null != ((Empresa) usuario).getCnpj()) {
                empresaDto.setCnpj(((Empresa) usuario).getCnpj());
            }
            
            if (null != ((Empresa) usuario).getDtAbertura()) {
                empresaDto.setDtAbertura(((Empresa) usuario).getDtAbertura());
            }
            
            if (null != ((Empresa) usuario).getSobre()) {
                empresaDto.setSobre(((Empresa) usuario).getSobre());
            }

            return empresaDto;

        }

        return null;

    }
}
