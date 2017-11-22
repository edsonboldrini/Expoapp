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
@Table (name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private String senha;
    private String email;
    private Date dt_cadastro;
    private String nome;
    private String logradouro;
    private String endereco;
    private String cep;
    private Date data_nascimento;
    private char sexo;
    private String cpf;
    private int fk_bairro_id;
    
    
    public Cliente(){
        
    }
    
    public Cliente(Date data_nascimento, char sexo, String cpf, int fk_bairro_id, 
            String login, String senha, String email, Date dt_cadastro, String nome, String logradouro, String endereco, String cep)
    {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.dt_cadastro = dt_cadastro;
        this.nome = nome;
        this.logradouro = logradouro;
        this.endereco = endereco;
        this.cep= cep;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.cpf = cpf;                                                                                                             
        this.fk_bairro_id = fk_bairro_id;
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

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
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

    public int getFk_bairro_id() {
        return fk_bairro_id;
    }

    public void setFk_bairro_id(int fk_bairro_id) {
        this.fk_bairro_id = fk_bairro_id;
    }
}
