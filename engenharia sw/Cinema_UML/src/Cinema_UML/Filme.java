package Cinema_UML;

public class Filme {
	private String nome;
	private Especificacao espec;
		
	public Filme(String nome, Especificacao espec) {
		this.nome = nome;
		this.espec = espec;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	public Especificacao getEspec() {
		return espec;
	}
	public void setEspec(Especificacao espec) {
		this.espec = espec;
	}
}
