/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.mapper;


import org.springframework.stereotype.Component;
import com.expoapp.entity.Comentario;
import com.expoapp.dto.ComentarioDto;
/**
 *
 * @author baumi
 */
public class ComentarioMapper {
    public Comentario mapDtoToEntity(ComentarioDto comentarioDto){
	Comentario comentario = new Comentario();
	if(null != comentarioDto.getId()){comentario.setId(comentarioDto.getId());}
	if(null != pecaDto.getNome()){peca.setNome(pecaDto.getNome());}
        if(null != pecaDto.getAutor()){peca.setAutor(pecaDto.getAutor());}
        if(null != pecaDto.getDtCriacao()){peca.setDtCriacao(pecaDto.getDtCriacao());}      
    return peca;    
    }
}
