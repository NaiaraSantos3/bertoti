package Cinema_UML;

import java.util.LinkedList;
import java.util.List;

public class Cinema {
	
	private List<Filme> filmes = new LinkedList<Filme>(); 

	public void cadastrarFilme(Filme filme) {
		filmes.add(filme);
	}
	public List<Filme> buscarFilmePorEspecificacao(Especificacao espec){
		List<Filme> filmesEncontrados = new LinkedList<Filme>();
		for(Filme filme:filmes) {
			if(filme.getEspec().comparar(espec)) filmesEncontrados.add(filme);
		}
		return filmesEncontrados;		
	}
	public Filme buscarFilmePorNome(String nome){
		for(Filme filme:filmes) {
			if(filme.getNome().equals(nome)) {
				return filme;
			}
						
		}
		return null;
	}
	
	public List<Filme> getFilmes(){
		return this.filmes;
	}
}
	

