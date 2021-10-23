package next.datavisboard.entities;


import com.sun.tools.javac.comp.Resolve;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PEDIDO")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    @OneToMany
    @JoinColumn(name = "CLIENTE", nullable = false)//ou utilizar um @JoinTable?
    private Cliente cliente;

    @Column(name = "QUANTIDADE", nullable = false, unique = false)
    private Long quantidade;

    @OneToMany
    @JoinColumn(name = "PRODUTO", nullable = false)//ou utilizar um @JoinTable?
    private Produto produto;

    @OneToOne(targetEntity = NotaFiscal.class)
    @JoinColumn(name = "TABELA_PEDIDO", referencedColumnName = "TABELA_PEDIDO" )
    private NotaFiscal notaFiscal;

    //VALOR TOTAL?
}
