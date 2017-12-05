/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.LocalDate;

/**
 *
 * @author baumi
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @Type(value = ExposicaoTempDto.class, name = "exposicaotemp")})
public class ExposicaoDto {
    private Integer id;
    private String descricao;
    private LocalDate dtInicio;
    private LocalTime hrInicio;
    private LocalTime hrFinal;
    private String logradouro;
    private String endereco;
    private Integer empresaid;
    private Integer bairroid;
    private List<String> pecas;


    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dtInicio
     */
    public LocalDate getDtInicio() {
        return dtInicio;
    }

    /**
     * @param dtInicio the dtInicio to set
     */
    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    /**
     * @return the hrInicio
     */
    public LocalTime getHrInicio() {
        return hrInicio;
    }

    /**
     * @param hrInicio the hrInicio to set
     */
    public void setHrInicio(LocalTime hrInicio) {
        this.hrInicio = hrInicio;
    }

    /**
     * @return the hrFinal
     */
    public LocalTime getHrFinal() {
        return hrFinal;
    }

    /**
     * @param hrFinal the hrFinal to set
     */
    public void setHrFinal(LocalTime hrFinal) {
        this.hrFinal = hrFinal;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    /**
     * @return the pecas
     */
    public List<String> getPecas() {
        return pecas;
    }

    /**
     * @param pecas the pecas to set
     */
    public void setPecas(List<String> pecas) {
        this.pecas = pecas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getEmpresaid() {
        return empresaid;
    }

    public void setEmpresaid(Integer empresaid) {
        this.empresaid = empresaid;
    }

    public Integer getBairroid() {
        return bairroid;
    }

    public void setBairroid(Integer bairroid) {
        this.bairroid = bairroid;
    }
    
    
}
