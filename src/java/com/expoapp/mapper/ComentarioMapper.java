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
@Component
public class ComentarioMapper {
    public Comentario mapDtoToEntity(ComentarioDto comentarioDto){
	Comentario comentario = new Comentario();
	if(null != comentarioDto.getId()){comentario.setId(comentarioDto.getId());}
	if(null != comentarioDto.getDescricao()){comentario.setDescricao(comentarioDto.getDescricao());}
        if(null != comentarioDto.getData_cadastro()){comentario.setData_cadastro(comentarioDto.getData_cadastro());}
        if(null != comentarioDto.getNota()){comentario.setNota(comentarioDto.getNota());}     
        return comentario;
    }
    
    public ComentarioDto mapEntityToDto (Comentario comentario){
	ComentarioDto comentarioDto = new ComentarioDto();
	if(null != comentario.getId()){comentarioDto.setId(comentario.getId());}
	if(null != comentario.getDescricao()){comentarioDto.setDescricao(comentario.getDescricao());}
        if(null != comentario.getData_cadastro()){comentarioDto.setData_cadastro(comentario.getData_cadastro());}
        if(null != comentario.getNota()){comentarioDto.setNota(comentario.getNota());}   
        return comentarioDto;    
    }
}
