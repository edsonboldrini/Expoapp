/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="tipoUsuario", discriminatorType=DiscriminatorType.STRING )
@Table (name = "USUARIO")
public class Usuario implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String login;
    private String senha;
    private String email;
    private LocalDateTime dt_cadastro;
//    @Column(nullable=false,insertable = false,updatable = false)
    private int tipoUsuario;
    private String nome;
    private String logradouro;
    private String endereco;
    private String cep;
    @ManyToOne
    @JoinColumn(name = "bairroId")
    private Bairro bairro;


    public Usuario(int id, String login, String senha, String email, String nome, String logradouro, String endereco, String cep, Bairro bairro) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.dt_cadastro = LocalDateTime.now();
        this.nome = nome;
        this.logradouro = logradouro;
        this.endereco = endereco;
        this.cep = cep;
        this.bairro = bairro;
    }
    public Usuario(String login, String senha, String email, String nome,int tipo, String logradouro, String endereco, String cep, Bairro bairro) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.tipoUsuario = tipo;
        this.dt_cadastro = LocalDateTime.now();
        this.logradouro = logradouro;
        this.endereco = endereco;
        this.cep = cep;
        this.bairro = bairro;
    }
    public Usuario(){}

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
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

    public LocalDateTime getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(LocalDateTime dt_cadastro) {
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

    