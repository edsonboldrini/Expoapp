/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "NOTIFICACAO")
public class Notificacao implements Serializable {
    @Id
    private Integer id;
    private LocalDateTime data_cadastro;
    private String descricao;
    private Integer tipo;
    private Integer id_origem;
    private Integer tipo_origem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getId_origem() {
        return id_origem;
    }

    public void setId_origem(Integer id_origem) {
        this.id_origem = id_origem;
    }

    public Integer getTipo_origem() {
        return tipo_origem;
    }

    public void setTipo_origem(Integer tipo_origem) {
        this.tipo_origem = tipo_origem;
    }
    
    
}
