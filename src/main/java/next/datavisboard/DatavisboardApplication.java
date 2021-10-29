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
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDate;
import java.util.*;

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
        //CommandLineRunner is an interface used to indicate that a bean should run when it is
        //contained within a SpringApplication.

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
                //Utilizado para inserir os dados no banco.
                //TODO - CRIAR CONTROLLER POST PARA FAZER ESTE TRABALHO

				Representante representante1 = new Representante(null,"Joana Grego");
                Representante representante2 = new Representante(null,"Thaynam Lázaro");
                Representante representante3 = new Representante(null,"Tamyris Torres");

                Cliente cliente1 = new Cliente(null, "Mercadonho do Cadu");
			    Cliente cliente2 = new Cliente(null,"Mercadinho do Dennis");
                Cliente cliente3 = new Cliente(null,"Supermercado da Joana");
                Cliente cliente4 = new Cliente(null,"Supermercado do Samuel");
                Cliente cliente5 = new Cliente(null,"Supermercado do Carlos");
                Cliente cliente6 = new Cliente(null,"Supermercado do Pedro");


                Produto produto1 = new Produto(null,"Vinagre Delicioso 900ml cx/12",25.34);
                Produto produto2 = new Produto(null,"Vinagre Baratinho 400ml cx/12",5.34);
                Produto produto3 = new Produto(null,"Vinagre MaisOuMenos 700ml cx/12",15.34);


				Venda venda1 = new Venda(null,new Date(),2,cliente1,representante1,produto1) ;
                Venda venda2 = new Venda(null,new Date(),2,cliente2,representante2,produto2) ;
                Venda venda3 = new Venda(null, new Date(121, Calendar.SEPTEMBER,20),2,cliente2,representante2,produto2) ;
                Venda venda4 = new Venda(null, new Date(121, Calendar.AUGUST,20),2,cliente3,representante3,produto1) ;


                clienteService.save(cliente1);
                clienteService.save(cliente2);
                clienteService.save(cliente3);
                clienteService.save(cliente4);
                clienteService.save(cliente5);
                clienteService.save(cliente6);

                representanteService.save(representante1);
                representanteService.save(representante2);
                representanteService.save(representante3);

                produtoService.save(produto1);
                produtoService.save(produto2);
                produtoService.save(produto3);

                vendaservice.save(venda1);
                vendaservice.save(venda2);
                vendaservice.save(venda3);
                vendaservice.save(venda4);

            }
		}
	}
