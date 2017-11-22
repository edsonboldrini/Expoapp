/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "USUARIO")
public class Usuario {
    @Id
    private int id;
    private String login;
    private String senha;
    private String email;
    private int tipo;
    private Date dt_cadastro;
    private String nome;
    private String logradouro;
    private String endereco;
    private String cep;
    
    public Usuario()
    {
        
    }
    
    public Usuario(String login, String senha, String email, int tipo, Date dt_cadastro, String nome, String logradouro, String endereco, String cep)
    {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.tipo = tipo;
        this.dt_cadastro = dt_cadastro;
        this.nome = nome;
        this.logradouro = logradouro;
        this.endereco = endereco;
        this.cep= cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Date getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(Date dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}

    