package next.datavisboard.services;


import next.datavisboard.dao.VendaDao;
import next.datavisboard.entities.Cliente;
import next.datavisboard.entities.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaDao vendaDao;

    public void save (Venda venda){
        vendaDao.save(venda);
    }

    public List<Venda> findAll(){
        return vendaDao.findAll();
    }

   public List<Venda> findVendaById() {return vendaDao.FindVendaById();}




}
