package next.datavisboard.controller;

import next.datavisboard.entities.Cliente;
import next.datavisboard.entities.Venda;
import next.datavisboard.services.ClienteService;
import next.datavisboard.services.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/datavis")
    public String datavis(Model model){

        List<Cliente> totalClientes = clienteService.findAll();
        Integer clientesAtivos = clienteService.quantidadeClientesAtivos();;
        Integer clientesInativos = clienteService.findAll().size() - clientesAtivos;

        //Highchart1 - Atividade Mensal dos Clientes da Carteira
        Map<Integer, Integer> clientes = new LinkedHashMap<Integer, Integer>();
        clientes.put(clientesAtivos,clientesInativos);

        model.addAttribute("clientesAtivos",clientes.keySet());
        model.addAttribute("clientesInativos",clientes.values());


        Map<String, Integer> data = new LinkedHashMap<String, Integer>();

        data.put("Thaynam", 11);
        data.put("Joana", 21);
        data.put("Carlos", 31);
        data.put("Cadu", 41);
        model.addAttribute("keySet", data.keySet());
        model.addAttribute("values",data.values());


        List<Venda> Vendas = vendaService.findAll();
        Integer vendas_volume = vendaService.vendas_volume();

        Map<Integer, Integer> vendas = new LinkedHashMap<~>();
        vendas.put();

        model.addAttribute("keyset",vendas.keySet());
        model.addAttribute("values",vendas.values());


        model.addAttribute("pass", 90);
        model.addAttribute("fail", 10);



        return "datavis";
    }
}
