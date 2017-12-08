/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author yagoz
 */
@Entity
@Table(name="Nota_exposicao")
public class NotaExposicao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @OneToOne
    @JoinColumn(name="exposicaoId")
    private Exposicao exposicao;
    
    @OneToOne
    @JoinColumn(name="clienteId")
    private Cliente cliente;
    
    private Integer nota;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Exposicao getExposicao() {
        return exposicao;
    }

    public void setPeca(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
