package next.datavisboard.dao;


import next.datavisboard.entities.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VendaDao extends JpaRepository<Venda,Long> {


    @Query(value = "SELECT * FROM VENDAS WHERE MONTH(DATA_DA_VENDA) = MONTH(CURRENT_DATE()) AND YEAR(DATA_DA_VENDA) = YEAR(CURRENT_DATE())", nativeQuery = true)
    List<Venda> FindVendaById();

}