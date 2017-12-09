/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.mapper;

import com.expoapp.dto.NotificacaoDto;
import com.expoapp.entity.Notificacao;
import org.springframework.stereotype.Component;

/**
 *
 * @author yagoz
 */
@Component
public class NotificacaoMapper {
    public Notificacao mapDtoToEntity(NotificacaoDto notificacaoDto){
	Notificacao notificacao = new Notificacao();
	if(null != notificacaoDto.getId()){notificacao.setId(notificacaoDto.getId());}
	if(null != notificacaoDto.getData_cadastro()){notificacao.setData_cadastro(notificacaoDto.getData_cadastro());}
        if(null != notificacaoDto.getDescricao()){notificacao.setDescricao(notificacaoDto.getDescricao());}
        if(null != notificacaoDto.getTipo()){notificacao.setTipo(notificacaoDto.getTipo());}      
        return notificacao;    
    }
    
    public NotificacaoDto mapEntityToDto (Notificacao notificacao){
	NotificacaoDto notificacaoDto = new NotificacaoDto();
	if(null != notificacao.getId()){notificacaoDto.setId(notificacao.getId());}
	if(null != notificacao.getData_cadastro()){notificacaoDto.setData_cadastro(notificacao.getData_cadastro());}
        if(null != notificacao.getDescricao()){notificacaoDto.setDescricao(notificacao.getDescricao());}
        if(null != notificacao.getTipo()){notificacaoDto.setTipo(notificacao.getTipo());}   
        if(null != notificacao.getExposicao()){notificacaoDto.setExposicaoid(notificacao.getExposicao().getId());}
        if(null != notificacao.getExposicao()){notificacaoDto.setEmpresaid(notificacao.getEmpresa().getId());}
        return notificacaoDto;    
    }
}
