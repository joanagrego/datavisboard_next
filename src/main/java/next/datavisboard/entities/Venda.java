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
@Table(name = "VENDA")
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA", nullable = false, unique = false)
    Date publicationDate;

    @OneToOne
    @JoinColumn(name = "CLIENTE")
    private Cliente clientes;

    @OneToOne
    @JoinColumn(name = "REPRESENTANTE")
    private Representante representantes;

    @Column(name = "QUANTIDADE", nullable = false, unique = false)
    private Integer quantidade;

    @OneToOne
    @JoinColumn(name = "PRODUTO")
    private Produto produtos;






}
