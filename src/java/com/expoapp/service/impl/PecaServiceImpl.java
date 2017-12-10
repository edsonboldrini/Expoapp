/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service.impl;

import com.expoapp.dao.ExposicaoDao;
import com.expoapp.dao.PecaDao;
import com.expoapp.dto.PecaDto;
import com.expoapp.entity.Exposicao;
import com.expoapp.entity.Peca;
import com.expoapp.mapper.PecaMapper;
import com.expoapp.service.PecaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yagoz
 */
@Service
@Transactional
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
            Exposicao exposicao = exposicaoDao.getById(ExposicaoDao.class, pecaDto.getExposicao());
            if(null != exposicao.getPecas()){
                exposicao.getPecas().add(peca);
            }
            else
            {
                List<Peca> pecas = new ArrayList<Peca>();
                pecas.add(peca);
                exposicao.setPecas(pecas);
            }
        }
        pecaDao.inserir(peca);
    }

    @Override
    public List<PecaDto> findAll() {
        List<Peca> pecas = pecaDao.listar();
        List<PecaDto> pecaDtos = new ArrayList<PecaDto>();

        for (Peca peca : pecas) {
            pecaDtos.add(pecaMapper.mapEntityToDto(peca));
        }

        return pecaDtos;
    }

    @Override
    public PecaDto findById(Integer id) {
        Peca peca= pecaDao.getById(Peca.class, id);
        PecaDto pecaDto = new PecaDto();
        pecaDto = pecaMapper.mapEntityToDto(peca);
        if(null != peca.getExposicao()){
            Exposicao expo = exposicaoDao.getById(Exposicao.class, peca.getExposicao().getId());
            pecaDto.setExposicao(expo.getId());
        }
        return pecaDto;
    }

    @Override
    public void remove(Integer pecaId) {
        Peca peca = pecaDao.getById(Peca.class, pecaId);
        pecaDao.delete(peca);
    }

    @Override
    public void edit(PecaDto pecaDto) {
        pecaDao.alterar(pecaMapper.mapDtoToEntity(pecaDto));
    }

    @Override
    public List<PecaDto> buscarPorExposicao(Integer exposicaoId) {
        List<Peca> pecas = pecaDao.buscaPorExposicao(exposicaoId);
        List<PecaDto> pecaDtos = new ArrayList<PecaDto>();
        for (Peca p: pecas)
            pecaDtos.add(pecaMapper.mapEntityToDto(p));
        return pecaDtos;
    }
    
}
