package next.datavisboard.services;


import next.datavisboard.dao.VendaDao;
import next.datavisboard.entities.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    private VendaDao vendaDao;

    public void save (Venda venda){
        vendaDao.save(venda);
    }

}
