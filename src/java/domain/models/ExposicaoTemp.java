/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author 20151bsi0223
 */
@Entity
@Table (name = "EXPOSICAO_TEMP")
public class ExposicaoTemp extends Exposicao implements Serializable{
    private Date dt_fim;
    private int fk_exposicao_id;
}
