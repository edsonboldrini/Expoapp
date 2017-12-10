/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service;

import com.expoapp.dto.ClienteEmpresaDto;
import java.util.List;

/**
 *
 * @author yagoz
 */
public interface ClienteEmpresaService {
    public boolean isPresent(ClienteEmpresaDto clienteEmpresaDto);
	public List<ClienteEmpresaDto> findAll();
	public void create(ClienteEmpresaDto clienteEmpresaDto);
	public void remove(ClienteEmpresaDto clienteEmpresaDto);
}
