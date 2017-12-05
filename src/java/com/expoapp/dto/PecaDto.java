/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dto;

import java.time.LocalDateTime;

/**
 *
 * @author baumi
 */
public class PecaDto {
    private Integer id;
    private String nome;
    private String autor;
    private LocalDateTime dtCriacao;
    private String sobre;
    private String exposicao;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the dtCriacao
     */
    public LocalDateTime getDtCriacao() {
        return dtCriacao;
    }

    /**
     * @param dtCriacao the dtCriacao to set
     */
    public void setDtCriacao(LocalDateTime dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    /**
     * @return the sobre
     */
    public String getSobre() {
        return sobre;
    }

    /**
     * @param sobre the sobre to set
     */
    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    /**
     * @return the exposicao
     */
    public String getExposicao() {
        return exposicao;
    }

    /**
     * @param exposicao the exposicao to set
     */
    public void setExposicao(String exposicao) {
        this.exposicao = exposicao;
    }
}
