/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dto;

import java.util.List;

/**
 *
 * @author baumi
 */
public class CidadeDto {
    private Integer id;
    private String nome;
    private String estado;
    private List<String> bairros;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the bairros
     */
    public List<String> getBairros() {
        return bairros;
    }

    /**
     * @param bairros the bairros to set
     */
    public void setBairros(List<String> bairros) {
        this.bairros = bairros;
    }
    
    
    
}
