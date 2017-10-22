/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import javax.persistence.*;
/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "IMAGEM")
public class Imagem {
    private String link_imagem;
    private int tipo;
    private int fk_empresa_id;
    private int fk_peca_id;
}


