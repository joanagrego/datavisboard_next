package next.datavisboard.dao;


import next.datavisboard.entities.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaDao extends JpaRepository<Venda,Long> {

}
