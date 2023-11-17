package Cinema_UML;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Teste {

	@Test
	public void test() {
		
		Cinema cinema = new Cinema();
		
		assertEquals(cinema.getFilmes().size(), 0);
		
		cinema.cadastrarFilme(new Filme("Crepúsculo", 
				new Especificacao("Catherine Hardwicke","Summit Entertainment", "Bella")));
		cinema.cadastrarFilme(new Filme("Amanhecer Parte 1", 
				new Especificacao("Bill Condon","Summit Entertainment", "Bella")));
	
		assertEquals(cinema.getFilmes().size(), 2);
		
		Filme filmeEncontrado = cinema.buscarFilmePorNome("Crepúsculo");
		
		assertEquals(filmeEncontrado.getEspec().getDiretor(),"Catherine Hardwicke");
		
		List<Filme> filmesEncontrados = cinema.buscarFilmePorEspecificacao 
				(new Especificacao ("Catherine Hardwicke", "Summit Entertainment","Bella"));
	
		assertEquals(filmesEncontrados.get(0).getEspec().getProdutora(), "Summit Entertainment");
		
		
	}

}
