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
@Table (name = "NOTA FISCAL")
public class NotaFiscal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    @Column(name = "DATA", nullable = false, unique = false)
    private Long data;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinTable(name = "TABELA_PEDIDO")
    //private Pedido pedido;

    //VALOR TOTAL?


}