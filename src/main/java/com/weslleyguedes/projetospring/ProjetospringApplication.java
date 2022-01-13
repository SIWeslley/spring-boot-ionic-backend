package com.weslleyguedes.projetospring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.weslleyguedes.projetospring.domain.Categoria;
import com.weslleyguedes.projetospring.domain.Cidade;
import com.weslleyguedes.projetospring.domain.Cliente;
import com.weslleyguedes.projetospring.domain.Endereco;
import com.weslleyguedes.projetospring.domain.Estado;
import com.weslleyguedes.projetospring.domain.Produto;
import com.weslleyguedes.projetospring.domain.enums.TipoCliente;
import com.weslleyguedes.projetospring.repositories.CategoriaRepository;
import com.weslleyguedes.projetospring.repositories.CidadeRepository;
import com.weslleyguedes.projetospring.repositories.ClienteRepository;
import com.weslleyguedes.projetospring.repositories.EnderecoRepository;
import com.weslleyguedes.projetospring.repositories.EstadoRepository;
import com.weslleyguedes.projetospring.repositories.ProdutoRepository;

@SpringBootApplication
public class ProjetospringApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetospringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto pdt1 = new Produto(null, "Computador", 2000.00);
		Produto pdt2 = new Produto(null, "Impressora", 800.00);
		Produto pdt3 = new Produto(null, "Mouse", 80.00);

		cat1.getProdutos().addAll(Arrays.asList(pdt1, pdt2, pdt3));
		cat2.getProdutos().addAll(Arrays.asList(pdt2));

		pdt1.getCategorias().addAll(Arrays.asList(cat1));
		pdt2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		pdt3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(pdt1, pdt2, pdt3));

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);

		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));

		Endereco e1 = new Endereco(null, "Rua Floras", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);

		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));

		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
	}

}