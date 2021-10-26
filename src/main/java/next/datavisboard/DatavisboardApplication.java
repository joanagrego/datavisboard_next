package next.datavisboard;

import next.datavisboard.entities.Cliente;
import next.datavisboard.entities.Produto;
import next.datavisboard.entities.Representante;
import next.datavisboard.entities.Venda;
import next.datavisboard.services.ClienteService;
import next.datavisboard.services.ProdutoService;
import next.datavisboard.services.RepresentanteService;
import next.datavisboard.services.VendaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DatavisboardApplication implements WebMvcConfigurer {

	public void addViewController(ViewControllerRegistry registry) {
		registry.addViewController("/datavis").setViewName("datavis");
	}

	public static void main(String[] args) {
		SpringApplication.run(DatavisboardApplication.class, args);
	}

	@Component
	public class MyRunner implements CommandLineRunner {

		@Autowired
		private VendaService vendaservice;
		@Autowired
		private RepresentanteService representanteService;
		@Autowired
		private ProdutoService produtoService;
		@Autowired
		private ClienteService clienteService;

			@Override
			public void run(String... args) throws Exception {
				Representante representante1 = new Representante();
				representante1.setNomeRepresentante("Joana Grego");

				Cliente cliente1 = new Cliente();
				cliente1.setNomeCliente("Mercadinho Cadu");
				//cliente1.setRepresentante(representante1);

				//ArrayList<Cliente> clientes = new ArrayList<Cliente>();
				//clientes.add(cliente1);
				//representante1.setClientes(cliente1);

				Produto produto1 = new Produto();
				produto1.setNomeProduto("Vinagre Delicioso 900ml cx/12");
			    produto1.setValorProduto(25.34);


				Venda venda1 = new Venda();
				venda1.setQuantidadeVenda(2);
				venda1.setDataVenda(new Date());
				//venda1.setClientes(cliente1);
				//venda1.setRepresentantes(representante1);
				//venda1.setProdutos(produto1);
				//produto1.setVenda(venda1);

				clienteService.save(cliente1);
				representanteService.save(representante1);
				produtoService.save(produto1);
				vendaservice.save(venda1);
				System.out.println("Rodando");
			}
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





