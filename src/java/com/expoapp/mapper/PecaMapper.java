/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.mapper;

import com.expoapp.entity.Peca;
import com.expoapp.dto.PecaDto;
import org.springframework.stereotype.Component;
/**
 *
 * 
 * @author baumi
 */
public class PecaMapper {
    public Peca mapDtoToEntity(PecaDto pecaDto){
	Peca peca = new Peca();
	if(null != pecaDto.getId()){peca.setId(pecaDto.getId());}
	if(null != pecaDto.getNome()){peca.setNome(pecaDto.getNome());}
        if(null != pecaDto.getAutor()){peca.setAutor(pecaDto.getAutor());}
        if(null != pecaDto.getDtCriacao()){peca.setDtCriacao(pecaDto.getDtCriacao());}      
    return peca;    
    }
    
     public PecaDto mapEntityToDto (Peca peca){
	PecaDto pecaDto = new PecaDto();
	if(null != peca.getId()){pecaDto.setId(peca.getId());}
	if(null != peca.getNome()){pecaDto.setNome(peca.getNome());}
        if(null != peca.getAutor()){pecaDto.setAutor(peca.getAutor());}
        if(null != peca.getDtCriacao()){pecaDto.setDtCriacao(peca.getDtCriacao());}   
        if(null != peca.getExposicao()){pecaDto.setExposicao(peca.getExposicao().getId());}
        return pecaDto;    
        }
}
