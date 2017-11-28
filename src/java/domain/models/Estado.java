/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "ESTADO")
public class Estado implements Serializable {
    @Id
     private int id;
    @Column
    private String sigla;
    @Column
    private String nome;
}
