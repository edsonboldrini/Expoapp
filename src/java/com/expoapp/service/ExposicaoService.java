/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service;

import com.expoapp.dto.ExposicaoDto;
import java.util.List;

/**
 *
 * @author yagoz
 */
public interface ExposicaoService {
    public void create(ExposicaoDto exposicaoDto);
    public List<ExposicaoDto> findAll();
    public ExposicaoDto findById(Integer id);
    public void remove(Integer exposicaoId);
    public void edit(ExposicaoDto exposicaoDto);
}
