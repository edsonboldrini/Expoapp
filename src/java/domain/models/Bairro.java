/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import javax.persistence.*;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "BAIRRO")
public class Bairro {
    @Id
    private int id;

    
    private String nome;
    @ManyToOne
    @JoinColumn(name = "cidadeId")
    private Cidade cidade;
    
    public Bairro(int id, String nome, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Bairro(int id) {
        this.id = id;
    }
}
