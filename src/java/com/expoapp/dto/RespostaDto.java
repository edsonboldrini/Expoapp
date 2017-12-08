/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dto;

/**
 *
 * @author baumi
 */
public class RespostaDto {
    private Integer id;
    private Boolean curtida;
    private String descricao;

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
     * @return the curtida
     */
    public Boolean isCurtida() {
        return curtida;
    }

    /**
     * @param curtida the curtida to set
     */
    public void setCurtida(Boolean curtida) {
        this.curtida = curtida;
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
