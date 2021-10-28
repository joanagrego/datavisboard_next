package next.datavisboard.dao;


import next.datavisboard.entities.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VendaDao extends JpaRepository<Venda,Long> {

    @Query(value = "SELECT * FROM vendas WHERE MONTH(data_da_venda) = MONTH(CURRENT_DATE()) AND YEAR(data_da_venda) = YEAR(CURRENT_DATE())", nativeQuery = true)
    List<Venda> findByCurrentMonthYear();

    @Query(value = "SELECT REPRESENTANTE_ID, SUM(QUANTIDADE_VENDA) as quantidade_venda FROM vendas GROUP BY REPRESENTANTE_ID", nativeQuery = true)
    Integer vendas_volume();

}