package com.weslleyguedes.projetospring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.weslleyguedes.projetospring.domain.Categoria;
import com.weslleyguedes.projetospring.domain.Produto;
import com.weslleyguedes.projetospring.repositories.CategoriaRepository;
import com.weslleyguedes.projetospring.repositories.ProdutoRepository;

@SpringBootApplication
public class ProjetospringApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository CategoriaRepository;

	@Autowired
	private ProdutoRepository ProdutoRepository;

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

		CategoriaRepository.saveAll(Arrays.asList(cat1, cat2));

		ProdutoRepository.saveAll(Arrays.asList(pdt1, pdt2, pdt3));

	}

}
