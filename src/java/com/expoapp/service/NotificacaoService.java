/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service;

import com.expoapp.dto.NotificacaoDto;
import com.expoapp.util.Observer;
import java.util.List;

/**
 *
 * @author yagoz
 */
public interface NotificacaoService {
    public void create(NotificacaoDto exposicaoDto);
    public List<NotificacaoDto> findAll();
    public NotificacaoDto findById(Integer id);
    public void remove(Integer exposicaoId);
    public void edit(NotificacaoDto exposicaoDto);
}
