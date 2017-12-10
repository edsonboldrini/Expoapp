/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.mapper;

import com.expoapp.dto.ExposicaoDto;
import com.expoapp.dto.ExposicaoTempDto;
import com.expoapp.entity.Exposicao;
import com.expoapp.entity.ExposicaoTemp;
import com.expoapp.entity.Peca;
import com.expoapp.service.ClienteNotificacaoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author yagoz
 */
@Component
public class ExposicaoMapper {

    @Autowired
    private ClienteNotificacaoService clienteNotificacaoService;

    public Exposicao mapDtoToEntity(ExposicaoDto exposicaoDto) {

        if (exposicaoDto instanceof ExposicaoTempDto) {
            ExposicaoTemp exposicaoTemp = new ExposicaoTemp();
            exposicaoTemp.addObserver(clienteNotificacaoService);

            if (null != exposicaoDto.getDescricao()) {
                exposicaoTemp.setDescricao(exposicaoDto.getDescricao());
            }
            if (null != ((ExposicaoTempDto) exposicaoDto).getDtFinal()) {
                exposicaoTemp.setDtFinal(((ExposicaoTempDto) exposicaoDto).getDtFinal());
            }
            if (null != exposicaoDto.getDtInicio()) {
                exposicaoTemp.setDtInicio(exposicaoDto.getDtInicio());
            }
            if (null != exposicaoDto.getEndereco()) {
                exposicaoTemp.setEndereco(exposicaoDto.getEndereco());
            }
            if (null != exposicaoDto.getHrFinal()) {
                exposicaoTemp.setHrFinal(exposicaoDto.getHrFinal());
            }
            if (null != exposicaoDto.getHrInicio()) {
                exposicaoTemp.setHrInicio(exposicaoDto.getHrInicio());
            }
            if (null != exposicaoDto.getLogradouro()) {
                exposicaoTemp.setLogradouro(exposicaoDto.getLogradouro());
            }

            return exposicaoTemp;
        } else {
            Exposicao exposicao = new Exposicao();
            exposicao.addObserver(clienteNotificacaoService);

            if (null != exposicaoDto.getDescricao()) {
                exposicao.setDescricao(exposicaoDto.getDescricao());
            }
            if (null != exposicaoDto.getDtInicio()) {
                exposicao.setDtInicio(exposicaoDto.getDtInicio());
            }
            if (null != exposicaoDto.getEndereco()) {
                exposicao.setEndereco(exposicaoDto.getEndereco());
            }
            if (null != exposicaoDto.getHrFinal()) {
                exposicao.setHrFinal(exposicaoDto.getHrFinal());
            }
            if (null != exposicaoDto.getHrInicio()) {
                exposicao.setHrInicio(exposicaoDto.getHrInicio());
            }
            if (null != exposicaoDto.getLogradouro()) {
                exposicao.setLogradouro(exposicaoDto.getLogradouro());
            }

            return exposicao;
        }
    }

    public ExposicaoDto mapEntityToDto(Exposicao exposicao) {
        if (exposicao instanceof ExposicaoTemp) {
            ExposicaoTempDto exposicaoTempDto = new ExposicaoTempDto();

            if (null != exposicao.getDescricao()) {
                exposicaoTempDto.setDescricao(exposicao.getDescricao());
            }
            if (null != ((ExposicaoTemp) exposicao).getDtFinal()) {
                exposicaoTempDto.setDtFinal(((ExposicaoTemp) exposicao).getDtFinal());
            }
            if (null != exposicao.getDtInicio()) {
                exposicaoTempDto.setDtInicio(exposicao.getDtInicio());
            }
            if (null != exposicao.getEndereco()) {
                exposicaoTempDto.setEndereco(exposicao.getEndereco());
            }
            if (null != exposicao.getHrFinal()) {
                exposicaoTempDto.setHrFinal(exposicao.getHrFinal());
            }
            if (null != exposicao.getHrInicio()) {
                exposicaoTempDto.setHrInicio(exposicao.getHrInicio());
            }
            if (null != exposicao.getLogradouro()) {
                exposicaoTempDto.setLogradouro(exposicao.getLogradouro());
            }
            if (null != exposicao.getEmpresa()) {
                exposicaoTempDto.setEmpresaid(exposicao.getEmpresa().getId());
            }
            if (null != exposicao.getBairro()) {
                exposicaoTempDto.setBairroid(exposicao.getBairro().getId());
            }
            if (null != exposicao.getPecas() && exposicao.getPecas().size() > 0) {
                List<String> pecas = new ArrayList<String>();
                for (Peca peca : exposicao.getPecas()) {
                    pecas.add(peca.getNome());
                }
                exposicaoTempDto.setPecas(pecas);
            }

            return exposicaoTempDto;
        } else {
            ExposicaoDto exposicaoDto = new ExposicaoDto();

            if (null != exposicao.getDescricao()) {
                exposicaoDto.setDescricao(exposicao.getDescricao());
            }
            if (null != exposicao.getDtInicio()) {
                exposicaoDto.setDtInicio(exposicao.getDtInicio());
            }
            if (null != exposicao.getEndereco()) {
                exposicaoDto.setEndereco(exposicao.getEndereco());
            }
            if (null != exposicao.getHrFinal()) {
                exposicaoDto.setHrFinal(exposicao.getHrFinal());
            }
            if (null != exposicao.getHrInicio()) {
                exposicaoDto.setHrInicio(exposicao.getHrInicio());
            }
            if (null != exposicao.getLogradouro()) {
                exposicaoDto.setLogradouro(exposicao.getLogradouro());
            }
            if (null != exposicao.getEmpresa()) {
                exposicaoDto.setEmpresaid(exposicao.getEmpresa().getId());
            }
            if (null != exposicao.getBairro()) {
                exposicaoDto.setBairroid(exposicao.getBairro().getId());
            }
            if (null != exposicao.getPecas() && exposicao.getPecas().size() > 0) {
                List<String> pecas = new ArrayList<String>();
                for (Peca peca : exposicao.getPecas()) {
                    pecas.add(peca.getNome());
                }
                exposicaoDto.setPecas(pecas);
            }

            return exposicaoDto;
        }
    }

}
