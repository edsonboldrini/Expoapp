/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "PECA")
public class Peca implements Serializable {
    @Id
    private int id;
    private String nome;
    private String autor;
    private LocalDate dt_criacao;
    private String sobre;
    @ManyToOne
    @JoinColumn(name = "statusId")
    private Exposicao exposicao;

    public int getId() {
        return id;
    }

    public Exposicao getExposicao() {
        return exposicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDt_criacao() {
        return dt_criacao;
    }

    public void setDt_criacao(LocalDate dt_criacao) {
        this.dt_criacao = dt_criacao;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
}
