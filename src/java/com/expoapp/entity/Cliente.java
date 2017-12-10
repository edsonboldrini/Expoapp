/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "cliente")
@AttributeOverrides({
    @AttributeOverride(name="id",column=@Column(name="id")),
    @AttributeOverride(name = "nome",column = @Column(name="nome")),
    @AttributeOverride(name = "login",column = @Column(name="login")),
    @AttributeOverride(name = "email",column = @Column(name="email")),
    @AttributeOverride(name = "senha",column = @Column(name="senha")),
    @AttributeOverride(name = "dtCadastro",column = @Column(name="dtCadastro")),
    @AttributeOverride(name = "logradouro",column = @Column(name="logradouro")),
    @AttributeOverride(name = "endereco",column = @Column(name="endereco")),
    @AttributeOverride(name = "cep",column = @Column(name="cep")),
    @AttributeOverride(name = "cep",column = @Column(name="cep")),
    @AttributeOverride(name = "bairroid",column = @Column(name="bairroid"))
})
public class Cliente extends Usuario{
    @Column(name = "dataNascimento",nullable = false)
    private LocalDate dataNascimento;
    @Column(name = "sexo",nullable = false,length = 1)
    private char sexo;
    @Column(name = "cpf",nullable = false,length = 11)
    private String cpf;
    
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "cliente_notificacao", 
				joinColumns = @JoinColumn(name = "cliente_id", referencedColumnName="ID"), 
				inverseJoinColumns = @JoinColumn(name = "notificacao_id", referencedColumnName="ID"))
    private Set<Notificacao> notificacoes = new HashSet<Notificacao>();
    
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "cliente_empresa", 
				joinColumns = @JoinColumn(name = "cliente_id", referencedColumnName="ID"), 
				inverseJoinColumns = @JoinColumn(name = "empresa_id", referencedColumnName="ID"))
    private Set<Empresa> empresasSeguindo = new HashSet<Empresa>();

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(Set<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    public Set<Empresa> getEmpresasSeguindo() {
        return empresasSeguindo;
    }

    public void setEmpresasSeguindo(Set<Empresa> empresasSeguindo) {
        this.empresasSeguindo = empresasSeguindo;
    }
    
    
    
}
