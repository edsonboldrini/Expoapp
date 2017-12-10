/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoo.entity;

import com.expoapp.dao.BairroDao;
import com.expoapp.dao.UsuarioDao;
import com.expoapp.dto.ClienteDto;
import com.expoapp.dto.ClienteNotificacaoDto;
import com.expoapp.dto.EmpresaDto;
import com.expoapp.dto.ExposicaoDto;
import com.expoapp.dto.NotificacaoDto;
import com.expoapp.dto.PecaDto;
import com.expoapp.dto.UsuarioDto;
import com.expoapp.entity.Bairro;
import com.expoapp.entity.Cidade;
import com.expoapp.entity.Cliente;
import com.expoapp.entity.Empresa;
import com.expoapp.entity.Estado;
import com.expoapp.entity.Usuario;
import com.expoapp.service.ClienteNotificacaoService;
import com.expoapp.service.ExposicaoService;
import com.expoapp.service.PecaService;
import com.expoapp.service.UsuarioService;
import com.expoapp.service.impl.ClienteNotificacaoServiceImpl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
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
    @Autowired
    private UsuarioDao usuarioDao;
    @Autowired
    private BairroDao bairroDao;
    
    @Autowired
    private ExposicaoService exposicaoService;
    
    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private ClienteNotificacaoService clNtService;
    
    @Autowired
    private PecaService pecaService;
    
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
        
        Cliente usuario = new Cliente();
        usuario.setBairro(bairro);
        usuario.setCep("111");
        usuario.setDt_cadastro(LocalDateTime.now());
        usuario.setEmail("email");
        usuario.setEndereco("endereco");
        usuario.setLogin("login");
        usuario.setLogradouro("casa");
        usuario.setNome("yago");
        usuario.setSenha("senha");
        usuario.setCpf("14166907786");
        usuario.setDataNascimento(LocalDate.of(1994, Month.MARCH, 22));
        usuario.setSexo('M');
        
        Cliente user = new Cliente();
        
        
        
        usuarioDao.inserir(usuario);
        
        user = (Cliente)usuarioDao.getById(Usuario.class, 1);
        
        Assert.assertEquals(usuario.getCpf(), user.getCpf());
        
        Assert.assertEquals(1L, usuarioDao.listar().size());
        
//        @SuppressWarnings("unchecked")
//        List<Estado> estados = sessionFactory.getCurrentSession().createQuery("select estado from Estado estado order by estado.id desc").list();
//        List<Cidade> cidadesTest = sessionFactory.getCurrentSession().createQuery("select cidade from Cidade cidade order by cidade.id desc").list();
//        List<Bairro> bairrosTest = sessionFactory.getCurrentSession().createQuery("select bairro from Bairro bairro order by bairro.id desc").list();   
//        Assert.assertEquals(1L,estados.size());
//        Assert.assertEquals(1L,cidadesTest.size());
//        Assert.assertEquals(1L,bairrosTest.size());
    }
    @Test
    public void Test2(){
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
        Bairro bar = bairroDao.listar().get(0);
        
        UsuarioDto usuario = new ClienteDto();
        usuario.setBairroid(bar.getId());
        usuario.setCep("111");
        usuario.setDt_cadastro(LocalDateTime.now());
        usuario.setEmail("email");
        usuario.setEndereco("endereco");
        usuario.setLogin("login");
        usuario.setLogradouro("casa");
        usuario.setNome("yago");
        usuario.setSenha("senha");
        ((ClienteDto)usuario).setCpf("14166907786");
        ((ClienteDto)usuario).setDataNascimento(LocalDate.of(1994, Month.MARCH, 22));
        ((ClienteDto)usuario).setSexo('M');
        
        usuarioService.create(usuario);
        
        UsuarioDto empresa = new EmpresaDto();
        empresa.setBairroid(bar.getId());
        empresa.setCep("111");
        empresa.setDt_cadastro(LocalDateTime.now());
        empresa.setEmail("email");
        empresa.setEndereco("endereco");
        empresa.setLogin("loginempresa");
        empresa.setLogradouro("casa");
        empresa.setNome("empresa");
        empresa.setSenha("senha");
        ((EmpresaDto)empresa).setCnpj("1111111111111");
        ((EmpresaDto)empresa).setDtAbertura(LocalDate.of(1994, Month.MARCH, 22));
        ((EmpresaDto)empresa).setSobre("Nada");
        
        usuarioService.create(empresa);
        UsuarioDto teste = usuarioService.buscaLoginSenha("login","senha");
        
        Assert.assertEquals("yago", teste.getNome());
        //Assert.assertEquals(2L, usuarioDao.listar().size());
    }
    
    @Test
    public void Test3(){
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
        Bairro bar = bairroDao.listar().get(0);
        
        UsuarioDto empresa = new EmpresaDto();
        empresa.setBairroid(bar.getId());
        empresa.setCep("111");
        empresa.setDt_cadastro(LocalDateTime.now());
        empresa.setEmail("email");
        empresa.setEndereco("endereco");
        empresa.setLogin("login");
        empresa.setLogradouro("casa");
        empresa.setNome("yago");
        empresa.setSenha("senha");
        ((EmpresaDto)empresa).setCnpj("1111111111111");
        ((EmpresaDto)empresa).setDtAbertura(LocalDate.of(1994, Month.MARCH, 22));
        ((EmpresaDto)empresa).setSobre("Nada");
        
        usuarioService.create(empresa);
        
        Empresa emp = (Empresa)usuarioDao.listar().get(0);
        
        ExposicaoDto exposicao = new ExposicaoDto();
        exposicao.setBairroid(bar.getId());;
        exposicao.setDescricao("descricao");
        exposicao.setDtInicio(LocalDate.of(2017, Month.MARCH, 22));
        exposicao.setEmpresaid(emp.getId());
        exposicao.setEndereco("Endereco");
        exposicao.setHrFinal(LocalTime.of(12, 0));
        exposicao.setHrInicio(LocalTime.of(9, 0));
        exposicao.setLogradouro("logradouro");
        
        exposicaoService.create(exposicao);
        Empresa emp2 = (Empresa)usuarioDao.listar().get(0);
        Assert.assertEquals(1L, emp2.getExposicoes().size());
    }
    
    @Test
    public void Test4(){
        List<ClienteNotificacaoDto> ClNts = new ArrayList<ClienteNotificacaoDto>();
        ClNts = clNtService.findAll();
        Assert.assertEquals(0L, ClNts.size());
    }
    
    @Test
    public void Test5(){
        List<ExposicaoDto> exposicoes = new ArrayList<ExposicaoDto>();
        exposicoes = exposicaoService.buscarPorEmpresa(1);
        Assert.assertEquals(0L, exposicoes.size());
        
    }
    
    @Test
    public void Test6(){
        List<PecaDto> pecaDtos = new ArrayList<PecaDto>();
        pecaDtos = pecaService.buscarPorExposicao(1);
        Assert.assertEquals(0L, pecaDtos.size());
    }
    
}
