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
public class Cliente extends Usuario{
    
    private Date data_nascimento;
    private char sexo;
    private String cpf;
    private int fk_bairro_id;
    private int fk_usuario_id;
    
    
    public Cliente(){
        
    }
    
    public Cliente(Date data_nascimento, char sexo, String cpf, int fk_bairro_id, int fk_usuario_id)
    {
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.cpf = cpf;                                                                                                             
        this.fk_bairro_id = fk_bairro_id;
        this.fk_usuario_id = fk_usuario_id;
    }        
}
