/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service;

import com.expoapp.dto.UsuarioDto;
import java.util.List;

/**
 *
 * @author yagoz
 */
public interface UsuarioService {

    public void create(UsuarioDto usuarioDto);
    public List<UsuarioDto> findAll();
    public UsuarioDto findById(Integer id);
    public void remove(Integer usuarioId);
    public void edit(UsuarioDto usuarioDto);
}
