package Cinema_UML;

public class Especificacao {
	
	private String diretor;
	private String produtora;
	private String atorFilme;
		
	
	public Especificacao(String diretor, String produtora, String atorFilme) {
		
		this.diretor = diretor;
		this.produtora = produtora;
		this.atorFilme = atorFilme;
	}
	
	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public String getProdutora() {
		return produtora;
	}
	
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	
	public String getAtorFilme() {
		return atorFilme;
	}
	
	public void setAtorFilme(String atorFilme) {
		this.atorFilme = atorFilme;
	}
	
	public boolean comparar(Especificacao especificacao) {
		if(diretor.equals(especificacao.diretor) && produtora.equals(especificacao.produtora) && 
				atorFilme.equals(especificacao.atorFilme)){
			return true;
			} else {
				return false;
			}
	}
}
