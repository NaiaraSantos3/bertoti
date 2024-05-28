package com.nsantos.livros;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@SpringBootApplication
public class LivrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrosApplication.class, args);
	}
}

@RestController
@RequestMapping ("/livros")
class RestAPIDemoController{
	private List<Livro> livros = new ArrayList<>();

	public RestAPIDemoController (){
		livros.addAll(List.of(
			new Livro ("A Culpa é das Estrelas"),
			new Livro ("A Cinco Passos de Você"),
			new Livro ("Tartarugas até lá embaixo"),
			new Livro ("As vantagens de ser invisível"),
			new Livro ("A menina que Roubava Livros"),
			new Livro ("Como eu era antes de você"),
			new Livro ("As coisas que fazemos por amor")
		));
	}

	@GetMapping
	List<Livro>getLivro(){
		return livros;
	}

	@GetMapping("/{id}")
	Optional<Livro> getLivroById(@PathVariable String id){
		for(Livro l: livros){
			if(l.getId().equals(id)){
				return Optional.of(l);
			}
		}
		return Optional.empty();
	}

	@PostMapping
	Livro postLivro(@RequestBody Livro livro){
		livros.add(livro);
		return livro;
	}

	@PutMapping("/{id}")
	ResponseEntity<Livro> putLivro(@PathVariable String id, @RequestBody Livro livro){
		int livroIndex = -1;
		for(Livro l: livros){
			if(l.getId().equals(id)){
				livroIndex = livros.indexOf(l);
				livros.set(livroIndex, livro);
			}
		}
		return(livroIndex == 1 )?
		new ResponseEntity<>(postLivro(livro, HttpStatus.CREATED): new ResponseEntity<>(livro, HttpStatus.OK));

	} 

	@DeleteMapping("/{id}")
	void deleteLivro(@PathVariable String id){
		livros.removeIf(l -> l.getId().equals(id));
	}


}

class Livro {
	private final String id;
	private String nome;

	public Livro (String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Livro(String nome){
		this(UUID.randomUUID().toString(), nome);
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
