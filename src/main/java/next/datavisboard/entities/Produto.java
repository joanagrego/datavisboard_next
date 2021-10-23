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
@Table(name = "PRODUTOS")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    @Column(name = "PRODUTO", nullable = false, unique = false)
    private String produto;

    @Column(name = "VALOR", nullable = false, unique = false)
    private Long valor;

    @ManyToOne(targetEntity = Pedido.class)
    private Pedido pedido;

}
