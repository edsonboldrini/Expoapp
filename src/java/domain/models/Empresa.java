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
@Table (name = "EMPRESA")
public class Empresa extends Usuario{
    private String sobre;
    private String cnpj;
    private Date dt_abertura;
    private int fk_bairro_id;
    private int fk_usuario_id;
    
    public Empresa(){
        
    }
    
    public Empresa(String sobre, String cnpj, Date dt_abertura,int fk_bairro_id, int fk_usuario_id)
    {
       
        this.cnpj = cnpj;
        this.sobre = sobre;
        this.fk_bairro_id = fk_bairro_id;
        this.fk_usuario_id = fk_usuario_id;
        
    }     
    
}
