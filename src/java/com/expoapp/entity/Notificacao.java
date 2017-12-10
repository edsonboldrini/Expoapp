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
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "NOTIFICACAO")
public class Notificacao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDateTime data_cadastro;
    private String descricao;
    private Integer tipo;
    
    @ManyToOne(optional = true)
    @JoinColumn(name="exposicaoid", nullable=true)
    private Exposicao exposicao;
    
    @ManyToOne
    @JoinColumn(name="empresaid", nullable=false)
    private Empresa empresa;
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "notificacoes")
    private Set<Cliente> clientes = new HashSet<Cliente>();

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


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

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public Exposicao getExposicao() {
        return exposicao;
    }

    public void setExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
    }
}
