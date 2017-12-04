/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author yagoz
 */
@Entity
@Table(name="Nota_Peca")
public class NotaPeca implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @OneToOne
    @JoinColumn(name="pecaId")
    private Peca peca;
    
    @OneToOne
    @JoinColumn(name="clienteId")
    private Cliente cliente;
    private int nota;

    public int getId() {
        return id;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
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
