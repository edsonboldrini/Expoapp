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
@DiscriminatorValue("empresa")
@Table (name = "empresa")
public class Empresa extends Usuario{
    private String sobre;
    private String cnpj;
    private LocalDate dt_abertura;
    
    public Empresa(){
        
    }

    public Empresa(String sobre, String cnpj, LocalDate dt_abertura, String login, String senha, String email, String nome, String logradouro, String endereco, String cep, Bairro bairro) {
        super( login, senha, email, nome,2, logradouro, endereco, cep, bairro);
        this.sobre = sobre;
        this.cnpj = cnpj;
        this.dt_abertura = dt_abertura;
    }

    public Empresa(String sobre, String cnpj, LocalDate dt_abertura) {
        this.sobre = sobre;
        this.cnpj = cnpj;
        this.dt_abertura = dt_abertura;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getDt_abertura() {
        return dt_abertura;
    }

    public void setDt_abertura(LocalDate dt_abertura) {
        this.dt_abertura = dt_abertura;
    }
        
    
}
