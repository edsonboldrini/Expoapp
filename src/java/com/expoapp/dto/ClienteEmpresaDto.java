/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dto;

/**
 *
 * @author yagoz
 */
public class ClienteEmpresaDto {
    private ClienteDto clienteDto;
    private EmpresaDto empresaDto;

    public ClienteDto getClienteDto() {
        return clienteDto;
    }

    public void setClienteDto(ClienteDto clienteDto) {
        this.clienteDto = clienteDto;
    }

    public EmpresaDto getEmpresaDto() {
        return empresaDto;
    }

    public void setEmpresaDto(EmpresaDto empresaDto) {
        this.empresaDto = empresaDto;
    }
    
    
}
