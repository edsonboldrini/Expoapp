/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service;

import com.expoapp.dto.PecaDto;
import java.util.List;

/**
 *
 * @author yagoz
 */
public interface PecaService {
    public void create(PecaDto pecaDto);
    public List<PecaDto> findAll();
    public PecaDto findById(Integer id);
    public void remove(Integer pecaId);
    public void edit(PecaDto pecaDto);
    public List<PecaDto> buscarPorExposicao(Integer exposicaoId);
}
