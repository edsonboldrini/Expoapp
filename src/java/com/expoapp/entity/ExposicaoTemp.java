/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "EXPOSICAO_TEMP")
@AttributeOverrides({
    @AttributeOverride(name="id",column=@Column(name="id")),
    @AttributeOverride(name = "descricao",column = @Column(name="descricao")),
    @AttributeOverride(name = "hrInicio",column = @Column(name="hrInicio")),
    @AttributeOverride(name = "hrFinal",column = @Column(name="hrFinal")),
    @AttributeOverride(name = "dtInicio",column = @Column(name="dtInicio")),
    @AttributeOverride(name = "empresaid",column = @Column(name="empresaid")),
    @AttributeOverride(name = "bairroid",column = @Column(name="bairroid")),
    @AttributeOverride(name = "logradouro",column = @Column(name="logradouro")),
    @AttributeOverride(name = "pecas",column = @Column(name="pecas")),
})
public class ExposicaoTemp extends Exposicao{
    @Column(name = "dtFinal",nullable = false)
    private LocalDate dtFinal;

    public LocalDate getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(LocalDate dtFinal) {
        this.dtFinal = dtFinal;
    }
    
    
}
