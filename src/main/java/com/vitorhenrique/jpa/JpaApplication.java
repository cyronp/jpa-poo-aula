package com.vitorhenrique.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
//	@Bean
//	CommandLineRunner run(PessoaRepository repo) {
//		return args -> {
//			// Inserções
//			repo.save(new Pessoa("João","Silveira",null));
//			repo.save(new Pessoa("Oliveira", "Maria", null));
//
//			// Select
//			System.out.println("Lista de pessoas:");
//			repo.findAll().forEach(p ->
//					System.out.println(p.getId() + " - " + p.getNome() + " " + p.getSobrenome())
//			);
//		};
//	}
	@Bean
	CommandLineRunner run(ProdutoRepository repo){
		return args -> {
			//repo.save(new Produto(null, 5.50, "Comida Saborosa", "Abola"));
			System.out.println("Lista de produtos ordenada:");
			System.out.println(repo.findBynomeStartingWith("A"));
			//System.out.println("Lista de produtos:");
//			repo.findAll().forEach(p ->
//					System.out.println(p.getId() + " - " + p.getNome() + " " + p.getDescricao() + " " + p.getPreco()));
		};
	}
}
