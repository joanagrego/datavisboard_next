package next.datavisboard.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CLIENTES")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    @Column(name = "RAZÃO SOCIAL", nullable = false, unique = true)
    private String cliente;

    @OneToOne(targetEntity = Representante.class)
    private Representante representante;

    @OneToOne(targetEntity = Pedido.class)
    private Pedido pedido;

}