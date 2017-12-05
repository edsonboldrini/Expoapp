/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service.impl;

import com.expoapp.dao.ExposicaoDao;
import com.expoapp.dao.PecaDao;
import com.expoapp.dto.PecaDto;
import com.expoapp.entity.Peca;
import com.expoapp.mapper.PecaMapper;
import com.expoapp.service.PecaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author yagoz
 */
public class PecaServiceImpl implements PecaService{

    @Autowired
    private PecaDao pecaDao;
    @Autowired
    private ExposicaoDao exposicaoDao;
    
    @Autowired
    private PecaMapper pecaMapper;
    @Override
    public void create(PecaDto pecaDto) {
        Peca peca = pecaMapper.mapDtoToEntity(pecaDto);
        if (null != pecaDto.getExposicao()){
            Exposicao exposicao = exposicaoDao.getById(ExposicaoDao.class, pecaDto.getExposicao())
        }
        pecaDao.inserir(pecaMapper.mapDtoToEntity(pecaDto));
    }

    @Override
    public List<PecaDto> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PecaDto findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Integer pecaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(PecaDto pecaDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
