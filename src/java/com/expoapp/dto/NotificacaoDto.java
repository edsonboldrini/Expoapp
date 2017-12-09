/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dto;

import java.time.LocalDateTime;

/**
 *
 * @author baumi
 */
public class NotificacaoDto {
    
    private Integer id;
    private LocalDateTime data_cadastro;
    private String descricao;
    private Integer tipo;
    private Integer exposicaoid;
    private Integer empresaid;

    public Integer getExposicaoid() {
        return exposicaoid;
    }

    public void setExposicaoid(Integer exposicaoid) {
        this.exposicaoid = exposicaoid;
    }

    public Integer getEmpresaid() {
        return empresaid;
    }

    public void setEmpresaid(Integer empresaid) {
        this.empresaid = empresaid;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the data_cadastro
     */
    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
