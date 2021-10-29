package next.datavisboard.services;


import next.datavisboard.dao.VendaDao;
import next.datavisboard.entities.Cliente;
import next.datavisboard.entities.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VendaService {

    @Autowired
    private VendaDao vendaDao;

    public void save(Venda venda) {
        vendaDao.save(venda);
    }

    public List<Object[]> findByQuantities(){return vendaDao.findByQuantities(); }

}



