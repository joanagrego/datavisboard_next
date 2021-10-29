package next.datavisboard.services;

import next.datavisboard.dao.ProdutoDao;
import next.datavisboard.entities.Produto;
import next.datavisboard.entities.Representante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoDao produtoDao;

    public void save (Produto produto){
        produtoDao.save(produto);
    }

}
