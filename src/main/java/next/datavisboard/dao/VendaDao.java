package next.datavisboard.dao;


import next.datavisboard.entities.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VendaDao extends JpaRepository<Venda,Long> {
}
