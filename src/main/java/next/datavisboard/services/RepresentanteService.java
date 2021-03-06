package next.datavisboard.services;


import next.datavisboard.dao.RepresentanteDao;
import next.datavisboard.entities.Representante;
import next.datavisboard.entities.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepresentanteService {

    @Autowired
    private RepresentanteDao representanteDao;

    public void save (Representante representante){
        representanteDao.save(representante);
    }

}
