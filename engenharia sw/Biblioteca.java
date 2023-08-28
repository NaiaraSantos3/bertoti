import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
 private List<Livro>livros = new LinkedList<Livro>;
 private List<Usuario>usuarios = new LinkedList<Usuario>;

 public void addLivro (Livro livro){

    livros add(livro);
 }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

 public List<Livro> buscarListNome(String nome){
    List<Livro>encontrados = new.LinkedList<Livro>();
    for (Livro livro: livros){
        if(livro.getNome().equals(nome))}
                encontrados.add(livro);
    }return encontrados;
}
// uma lista vazia, ela existe//
// uma lista nula, ela não existe, é "nada"//