package next.datavisboard.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "REPRESENTANTES")
public class Representante implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "NOME", nullable = false,unique = false)
    private String nome;

    @Column(name = "Área", nullable = false, unique = false)
    private String area;

    @OneToMany(targetEntity = Cliente.class)
    private List clientes;
}
