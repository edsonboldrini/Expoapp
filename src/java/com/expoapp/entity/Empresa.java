/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "empresa")
@AttributeOverrides({
    @AttributeOverride(name="id",column=@Column(name="id")),
    @AttributeOverride(name = "nome",column = @Column(name="nome")),
    @AttributeOverride(name = "login",column = @Column(name="login")),
    @AttributeOverride(name = "email",column = @Column(name="email")),
    @AttributeOverride(name = "senha",column = @Column(name="senha")),
    @AttributeOverride(name = "dtCadastro",column = @Column(name="dtCadastro")),
    @AttributeOverride(name = "logradouro",column = @Column(name="logradouro")),
    @AttributeOverride(name = "endereco",column = @Column(name="endereco")),
    @AttributeOverride(name = "cep",column = @Column(name="cep")),
    @AttributeOverride(name = "cep",column = @Column(name="cep")),
    @AttributeOverride(name = "bairroid",column = @Column(name="bairroid"))
})
public class Empresa extends Usuario{
    @Column(name = "sobre",nullable = false)
    private String sobre;
    @Column(name = "cnpj",nullable = false)
    private String cnpj;
    @Column(name = "dataAbertura",nullable = false)
    private LocalDate dtAbertura;
    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL)
    private List<Exposicao> exposicoes;
    
    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(LocalDate dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public List<Exposicao> getExposicoes() {
        return exposicoes;
    }

    public void setExposicoes(List<Exposicao> exposicoes) {
        this.exposicoes = exposicoes;
    }

            
}
