
package domain.models;

import javax.persistence.*;
@Entity
@Table (name = "RESPOSTA")
public class Resposta {
    @Id
    private int id;
    private boolean curtida;
    private String descricao;
    private int fk_comentario_id_origem;
    private int fk_comentario_id_destino;
}
