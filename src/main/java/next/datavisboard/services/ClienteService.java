package next.datavisboard.services;


import next.datavisboard.dao.ClienteDao;
import next.datavisboard.entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    public void save (Cliente cliente){
        clienteDao.save(cliente);
    }
}
