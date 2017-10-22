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
@Table (name = "PECA")
public class Peca {
    private String nome;
    private String autor;
    private Date dt_criacao;
    private String sobre;
    private int fk_exposicao_id;
}
