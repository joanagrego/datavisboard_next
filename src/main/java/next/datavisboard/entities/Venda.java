package next.datavisboard.entities;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "VENDAS")
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_VENDA", nullable = false, unique = true)
    private Long idVenda;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_DA_VENDA", nullable = false)
    private Date dataVenda;

    @Column(name = "QUANTIDADE_VENDA", nullable = false)
    private Integer quantidadeVenda;

    @OneToOne
    @JoinColumn(name = "CLIENTE_ID", referencedColumnName = "ID_CLIENTE")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "REPRESENTANTE_ID", referencedColumnName = "ID_REPRESENTANTE")
    private Representante representante;

    @OneToOne
    @JoinColumn(name = "PRODUTO_ID", referencedColumnName = "ID_PRODUTO")
    private Produto produto;

}
