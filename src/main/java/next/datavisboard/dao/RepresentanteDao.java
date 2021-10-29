package next.datavisboard.dao;

import next.datavisboard.entities.Representante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface RepresentanteDao extends JpaRepository<Representante, Long> {

}
