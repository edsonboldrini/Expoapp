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
	if(null != comentarioDto.getDescricao()){comentario.setDescricao(comentarioDto.getDescricao());}
        if(null != comentarioDto.getData_cadastro()){comentario.setData_cadastro(comentarioDto.getData_cadastro());}
        if(null != comentarioDto.getNota()){comentario.setNota(comentarioDto.getNota());}     
        return comentario;
    }    
}
