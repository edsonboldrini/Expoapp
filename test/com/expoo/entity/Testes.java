/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoo.entity;

import com.expoapp.entity.Bairro;
import com.expoapp.entity.Cidade;
import com.expoapp.entity.Estado;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 *
 * @author yagoz
 */
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = { "classpath:context.xml" } )
@TransactionConfiguration( defaultRollback = true )
@Transactional
public class Testes {
    @Autowired
    private SessionFactory sessionFactory;
    @Test
    public void Testes() {
        Estado estado = new Estado();
        List<Bairro> bairros = new ArrayList<Bairro>();
        List<Cidade> cidades = new ArrayList<Cidade>();
        estado.setNome("Espirito Santo");
        estado.setSigla("ES");
        
        Cidade cidade = new Cidade();
        cidade.setEstado(estado);
        cidade.setNome("Serra");
        
        cidades.add(cidade);
        
        Bairro bairro = new Bairro();
        bairro.setNome("Jacaraipe");
        bairro.setCidade(cidade);
        
        bairros.add(bairro);
        
        estado.setCidades(cidades);
        cidade.setBairros(bairros);
        
        sessionFactory.getCurrentSession().save(estado);
        
        @SuppressWarnings("unchecked")
        List<Estado> estados = sessionFactory.getCurrentSession().createQuery("select estado from Estado estado order by estado.id desc").list();
        List<Cidade> cidadesTest = sessionFactory.getCurrentSession().createQuery("select cidade from Cidade cidade order by cidade.id desc").list();
        List<Bairro> bairrosTest = sessionFactory.getCurrentSession().createQuery("select bairro from Bairro bairro order by bairro.id desc").list();   
        Assert.assertEquals(1L,estados.size());
        Assert.assertEquals(1L,cidadesTest.size());
        Assert.assertEquals(1L,bairrosTest.size());
    }
    
}
