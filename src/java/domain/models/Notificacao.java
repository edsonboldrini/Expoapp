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
@Table (name = "NOTIFICACAO")
public class Notificacao {
    private Date data;
    private String descricao;
    private int tipo;
    private int id_origem;
    private int tipo_origem;
}
