package next.datavisboard.dao;

import next.datavisboard.entities.Representante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface RepresentanteDao extends JpaRepository<Representante, Long> {
    @Query(value = "SELECT COUNT(DISTINCT representante_id) FROM vendas GROUP BY representante_id", nativeQuery = true)
    Integer quantidadeCaixasVendidas();

}
