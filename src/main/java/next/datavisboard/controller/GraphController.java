package next.datavisboard.controller;

import next.datavisboard.entities.Cliente;
import next.datavisboard.services.ClienteService;
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

        model.addAttribute("beltrano",39.5);
        model.addAttribute("mevio",20.5);
        model.addAttribute("ticio",29.1);

        model.addAttribute("pass", 90);
        model.addAttribute("fail", 10);



        return "datavis";
    }
}
