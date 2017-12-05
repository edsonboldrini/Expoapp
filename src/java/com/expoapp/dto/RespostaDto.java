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
    private boolean curtida;
    private String descricao;

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
     * @return the curtida
     */
    public boolean isCurtida() {
        return curtida;
    }

    /**
     * @param curtida the curtida to set
     */
    public void setCurtida(boolean curtida) {
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
