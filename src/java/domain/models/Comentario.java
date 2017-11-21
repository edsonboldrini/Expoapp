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
@Table (name = "COMENTARIO")
public class Comentario {
    private Integer id;
    private String descricao;
    private Date data_cadastro;
    private int nota;
    private int tipo;
    private int fk_cliente_id;
}
