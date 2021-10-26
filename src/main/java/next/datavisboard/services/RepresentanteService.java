package next.datavisboard.services;


import next.datavisboard.dao.RepresentanteDao;
import next.datavisboard.entities.Representante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepresentanteService {

    @Autowired
    private RepresentanteDao representanteDao;

    public void save (Representante representante){
        representanteDao.save(representante);
    }
}
