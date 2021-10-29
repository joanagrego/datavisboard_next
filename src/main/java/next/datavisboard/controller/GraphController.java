package next.datavisboard.controller;

import next.datavisboard.entities.Cliente;
import next.datavisboard.entities.Representante;
import next.datavisboard.entities.Venda;
import next.datavisboard.services.ClienteService;
import next.datavisboard.services.RepresentanteService;
import next.datavisboard.services.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GraphController {
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private VendaService vendaService;
    @Autowired
    private RepresentanteService representanteService;

    @GetMapping("/datavis")
    public String datavis(Model model){
        //TODO - PASSAR CÓDIGOS DE NEGÓCIOS PARA SEUS RESPECTIVOS SERVICES


        //Highchart1 - Atividade Mensal dos Clientes da Carteira
        Integer clientesAtivos = clienteService.quantidadeClientesAtivos();;
        Integer clientesInativos = clienteService.quantidadeTotalClientes() - clientesAtivos;

        Map<Integer, Integer> clientes = new LinkedHashMap<Integer, Integer>();
        clientes.put(clientesAtivos,clientesInativos);

        model.addAttribute("clientesAtivos",clientes.keySet());
        model.addAttribute("clientesInativos",clientes.values());

        //Highchart2 - Produção dos Representantes por Valor
        //TODO - FAZER MAPA DE OBJETOS PARA GERAR GRÁFICO PIZZA EM HTML COM DADOS DO DATABASE
        Map<String, Integer> data = new LinkedHashMap<String, Integer>();

        model.addAttribute("joana", 10);
        model.addAttribute("thaynam", 20);
        model.addAttribute("tamyris", 30);

        //Highchart3 - Produção dos Representantes por Volume de Venda
        Map<String, BigDecimal> representantes = new LinkedHashMap<String, BigDecimal>();
        List<Object[]> mylist = vendaService.findByQuantities();
        for (Object[] obj: mylist) {
            String nomeRepresentante = (String) obj[0];
            BigDecimal quantidadeCX = (BigDecimal) obj[1];
            representantes.put(nomeRepresentante, quantidadeCX);
        }
        model.addAttribute("nomesRep",representantes.keySet());
        model.addAttribute("qntVendida",representantes.values());

        //Highchart4 - Atendimento de Clientes na Carteira por Representante
        //TODO - FAZER MAPA DE OBJETOS PARA GERAR GRÁFICO BARRAS DUPLAS EM HTML COM DADOS DO DATABASE
        data.put("Thaynam Lázaro", 15);
        data.put("Joana Grego", 10);
        data.put("Tamyris Torres", 12);
        model.addAttribute("keySet", data.keySet());
        model.addAttribute("values",data.values());

        return "datavis";
    }
}
