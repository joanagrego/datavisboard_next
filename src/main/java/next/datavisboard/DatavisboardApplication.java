package next.datavisboard;

import next.datavisboard.entities.Cliente;
import next.datavisboard.entities.Produto;
import next.datavisboard.entities.Representante;
import next.datavisboard.entities.Venda;
import next.datavisboard.services.ClienteService;
import next.datavisboard.services.ProdutoService;
import next.datavisboard.services.RepresentanteService;
import next.datavisboard.services.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DatavisboardApplication implements WebMvcConfigurer {

	public void addViewController(ViewControllerRegistry registry) {
		registry.addViewController("/datavis").setViewName("datavis");
	}

	@Autowired
	private VendaService vendaservice;
	@Autowired
	private RepresentanteService representanteService;
	@Autowired
	private ProdutoService produtoService;
	@Autowired
	private ClienteService clienteService;

	public  run(String... args) throws Exception {

		Cliente cliente1 = new Cliente();
		cliente1.setCliente("Thaynam");

		Set<Cliente> clientes = new HashSet<Cliente>();
		clientes.add(cliente1);

		Representante representante1 = new Representante();
		representante1.setNome("Joana Grego");

		representante1.setClientes(clientes);

		Produto produto1 = new Produto();
		produto1.setProduto("Vinagre Delicioso 900ml cx/12");
		produto1.setValor(25);

		Venda venda1 = new Venda();
		venda1.setClientes(cliente1);
		venda1.setRepresentantes(representante1);
		venda1.setProdutos(produto1);
		venda1.setQuantidade(2);


		clienteService.save(cliente1);
		representanteService.save(representante1);
		produtoService.save(produto1);
		vendaservice.save(venda1);

		System.out.println("Rodando");

	}

	public static void main(String[] args) {
		SpringApplication.run(DatavisboardApplication.class, args);



	}



}


		/*cliente.setCliente("João Pedro");
		cliente.setCliente("Miguel Bernardo");
		cliente.setCliente("Dennys Cesar");
		cliente.setCliente("Samuel Cesar");
		cliente.setCliente("Endrigo Cesar");
		cliente.setCliente("Maria José");
		cliente.setCliente("Pedro João");
		cliente.setCliente("Leandro Vinicius");
		cliente.setCliente("Cecilia Marques");
		cliente.setCliente("Vitor Cesar");
		cliente.setCliente("Marina Raquel");
		cliente.setCliente("Myllena Carla");*/


		//representante.setNome("Thaynam Lázaro");
		//representante.setNome("Carlos Eduardo");
		//representante.setNome("Tamyris Torres");
		//representante.setNome("Carlos Roberto");





