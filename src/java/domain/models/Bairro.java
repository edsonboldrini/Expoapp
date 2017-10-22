/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "BAIRRO")
public class Bairro {
    private String nome;
    private int fk_cidade_id;
}
