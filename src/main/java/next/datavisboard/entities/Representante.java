package next.datavisboard.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "REPRESENTANTES")
public class Representante implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REPRESENTANTE", nullable = false, unique = true)
    private Long idRepresentante;

    @Column(name = "NOME_REPRESENTANTE", nullable = false)
    private String nomeRepresentante;

}
