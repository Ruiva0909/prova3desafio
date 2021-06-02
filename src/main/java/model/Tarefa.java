package model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table
@Data
public class Cliente {
    private Long id;
    private String name;
    private String tarefa;
    private Date data;

}
