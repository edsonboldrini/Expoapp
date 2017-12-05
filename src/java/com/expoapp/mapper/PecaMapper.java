/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.mapper;

import com.expoapp.entity.Peca;
import com.expoapp.dto.PecaDto;
/**
 *
 * @author baumi
 */
public class PecaMapper {
    public Peca mapDtoToEntity(PecaDto pecaDto){
	Peca peca = new Peca();
	if(null != pecaDto.getId()){peca.setId(pecaDto.getId());}
	//if(null != itemDto.getName()){item.setName(itemDto.getName());}
}
