/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dto;

import com.expoapp.entity.Cidade;

/**
 *
 * @author baumi
 */
public class BairroDto {
    private Integer id;
    private String nome;
    private Integer cidadeid;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCidadeid() {
        return cidadeid;
    }

    public void setCidadeid(Integer cidadeid) {
        this.cidadeid = cidadeid;
    }

    /**
     * @return the cidade
     */
    
}
