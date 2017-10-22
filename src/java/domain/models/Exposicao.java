/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "EXPOSICAO")
public class Exposicao {
    @Id
    private int id;
    private int tipo;
    private String descricao;
    private Date dt_inicio;
    private SimpleDateFormat hr_inicio;
    private SimpleDateFormat hr_final;
    private String logradouro;
    private int fk_empresa_id;
    private int fk_bairro_id;

    public int getTipo() {
        return id;
    }

    public void setTipo(int tipo) {
        this.tipo = id;
    }
    
}
