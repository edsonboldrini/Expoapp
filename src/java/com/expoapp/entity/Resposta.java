
package com.expoapp.entity;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table (name = "RESPOSTA")
public class Resposta implements Serializable {
    @Id
    private Integer id;
    private Boolean curtida;
    private String descricao;
    private Integer fk_comentario_id_origem;
    private Integer fk_comentario_id_destino;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean isCurtida() {
        return curtida;
    }

    public void setCurtida(Boolean curtida) {
        this.curtida = curtida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getFk_comentario_id_origem() {
        return fk_comentario_id_origem;
    }

    public void setFk_comentario_id_origem(Integer fk_comentario_id_origem) {
        this.fk_comentario_id_origem = fk_comentario_id_origem;
    }

    public Integer getFk_comentario_id_destino() {
        return fk_comentario_id_destino;
    }

    public void setFk_comentario_id_destino(Integer fk_comentario_id_destino) {
        this.fk_comentario_id_destino = fk_comentario_id_destino;
    }
    
    
}
