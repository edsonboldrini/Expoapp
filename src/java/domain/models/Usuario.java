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
}

    