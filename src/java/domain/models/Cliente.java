/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "cliente")
@DiscriminatorValue("cliente")
public class Cliente extends Usuario{
    private LocalDate data_nascimento;
    private char sexo;
    private String cpf;
    
    
    public Cliente(){
        
    }

    public Cliente(LocalDate data_nascimento, char sexo, String cpf, String login, String senha, String email,String nome, String logradouro, String endereco, String cep, Bairro bairro) {
        super(login, senha, email, nome,1, logradouro, endereco, cep, bairro);
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public Cliente(LocalDate data_nascimento, char sexo, String cpf) {
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
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
    
}
