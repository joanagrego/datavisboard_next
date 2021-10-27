package next.datavisboard.dao;

import next.datavisboard.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteDao extends JpaRepository<Cliente, Long> {
    @Query(value = "SELECT COUNT(DISTINCT cliente_id) FROM vendas WHERE MONTH(data_da_venda) = MONTH(CURRENT_DATE()) AND YEAR(data_da_venda) = YEAR(CURRENT_DATE())", nativeQuery = true)
    Integer quantidadeClientesAtivos();

}
