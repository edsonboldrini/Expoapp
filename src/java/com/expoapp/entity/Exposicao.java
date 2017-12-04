/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "EXPOSICAO")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Exposicao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String descricao;
    private LocalDate dtInicio;
    private LocalTime hrInicio;
    private LocalTime hrFinal;
    private String logradouro;
    @ManyToOne
    @JoinColumn(name = "empresaid", nullable = false)
    private Empresa empresa;
    @ManyToOne
    @JoinColumn(name = "bairroid", nullable = false)
    private Bairro bairro;
    @OneToMany(mappedBy = "exposicao",cascade = CascadeType.ALL)
    private List<Peca> pecas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalTime getHrInicio() {
        return hrInicio;
    }

    public void setHrInicio(LocalTime hrInicio) {
        this.hrInicio = hrInicio;
    }

    public LocalTime getHrFinal() {
        return hrFinal;
    }

    public void setHrFinal(LocalTime hrFinal) {
        this.hrFinal = hrFinal;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }
    
    
    
}
