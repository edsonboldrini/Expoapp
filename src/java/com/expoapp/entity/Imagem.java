/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.entity;

import javax.persistence.*;
/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "IMAGEM")
public class Imagem {
    @Id
    private Integer id;
    private String link_imagem;
    private Integer tipo;
    private Integer fk_empresa_id;
    private Integer fk_peca_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink_imagem() {
        return link_imagem;
    }

    public void setLink_imagem(String link_imagem) {
        this.link_imagem = link_imagem;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getFk_empresa_id() {
        return fk_empresa_id;
    }

    public void setFk_empresa_id(Integer fk_empresa_id) {
        this.fk_empresa_id = fk_empresa_id;
    }

    public Integer getFk_peca_id() {
        return fk_peca_id;
    }

    public void setFk_peca_id(Integer fk_peca_id) {
        this.fk_peca_id = fk_peca_id;
    }
    
        
}


