/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.service.impl;

import com.expoapp.dao.BairroDao;
import com.expoapp.dao.ExposicaoDao;
import com.expoapp.dao.UsuarioDao;
import com.expoapp.dto.ExposicaoDto;
import com.expoapp.entity.Bairro;
import com.expoapp.entity.Empresa;
import com.expoapp.entity.Exposicao;
import com.expoapp.mapper.ExposicaoMapper;
import com.expoapp.mapper.UsuarioMapper;
import com.expoapp.service.ExposicaoService;
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
public class ExposicaoServiceImpl implements ExposicaoService{
    @Autowired
    private ExposicaoDao exposicaoDao;
    @Autowired
    private BairroDao bairroDao;
    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private ExposicaoMapper exposicaoMapper;

    @Override
    public void create(ExposicaoDto exposicaoDto) {
        Exposicao exposicao = exposicaoMapper.mapDtoToEntity(exposicaoDto);
        if (null != exposicaoDto.getEmpresaid()){
            Empresa empresa = (Empresa)usuarioDao.getById(Empresa.class, exposicaoDto.getEmpresaid());
            exposicao.setEmpresa(empresa);
            if(null != empresa.getExposicoes()){
                empresa.getExposicoes().add(exposicao);
            }
            else{
                List<Exposicao> exposicoes = new ArrayList<Exposicao>();
                exposicoes.add(exposicao);
                empresa.setExposicoes(exposicoes);
            }
            //usuarioDao.alterar(empresa);
        }
        if(null != exposicaoDto.getBairroid()){
            Bairro bairro = bairroDao.getById(Bairro.class, exposicaoDto.getBairroid());
            exposicao.setBairro(bairro);
        }
        exposicaoDao.inserir(exposicao);
    }

    @Override
    public List<ExposicaoDto> findAll() {
        List<Exposicao> exposicoes = exposicaoDao.listar();
        List<ExposicaoDto> exposicaoDtos = new ArrayList<ExposicaoDto>();

        for (Exposicao exposicao : exposicoes) {
            exposicaoDtos.add(exposicaoMapper.mapEntityToDto(exposicao));
        }

        return exposicaoDtos;
    }

    @Override
    public ExposicaoDto findById(Integer id) {
        Exposicao exposicao = exposicaoDao.getById(Exposicao.class, id);
        ExposicaoDto exposicaoDto = null;
        if (null != exposicao) {
            exposicaoDto = exposicaoMapper.mapEntityToDto(exposicao);
        }
        return exposicaoDto;
    }

    @Override
    public void remove(Integer exposicaoId) {
        Exposicao exposicao = exposicaoDao.getById(Exposicao.class,exposicaoId);
        exposicaoDao.delete(exposicao);
    }

    @Override
    public void edit(ExposicaoDto exposicaoDto) {
        exposicaoDao.alterar(exposicaoMapper.mapDtoToEntity(exposicaoDto));
    }
    
}
