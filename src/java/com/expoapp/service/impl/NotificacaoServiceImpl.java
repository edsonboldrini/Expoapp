/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service.impl;

import com.expoapp.dao.NotificacaoDao;
import com.expoapp.dto.NotificacaoDto;
import com.expoapp.entity.Exposicao;
import com.expoapp.entity.Notificacao;
import com.expoapp.service.NotificacaoService;
import com.expoapp.util.Observavel;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author yagoz
 */
public class NotificacaoServiceImpl implements NotificacaoService{
    @Autowired
    private NotificacaoDao notificacaoDao;

    @Override
    public void create(NotificacaoDto exposicaoDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NotificacaoDto> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NotificacaoDto findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Integer exposicaoId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(NotificacaoDto exposicaoDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
