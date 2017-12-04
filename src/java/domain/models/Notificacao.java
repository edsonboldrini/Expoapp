/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "NOTIFICACAO")
public class Notificacao implements Serializable {
    @Id
    private int id;
    private LocalDateTime data_cadastro;
    private String descricao;
    private int tipo;
    private int id_origem;
    private int tipo_origem;
}
