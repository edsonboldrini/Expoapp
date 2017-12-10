/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dao;

import com.expoapp.entity.Exposicao;
import java.util.List;

/**
 *
 * @author yagoz
 */
public interface ExposicaoDao extends GenericDAO<Exposicao>{
    public List<Exposicao> buscarExposicoesEmpresa(Integer empresaId);
    
}
