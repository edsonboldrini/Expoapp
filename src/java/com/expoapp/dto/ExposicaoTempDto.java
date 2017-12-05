/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 *
 * @author baumi
 */
public class ExposicaoTempDto extends ExposicaoDto{
    @JsonProperty("dtFinal")
    private LocalDate dtFinal; 

    /**
     * @return the dtFinal
     */
    public LocalDate getDtFinal(){
        return dtFinal;
    }

    /**
     * @param dtFinal the dtFinal to set
     */
    public void setDtFinal(LocalDate dtFinal) {
        this.dtFinal = dtFinal;
    }
}
