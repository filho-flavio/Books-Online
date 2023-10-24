import java.util.ArrayList;

public class Catalogo {
    ArrayList<Livros> catalogo = new ArrayList<>();

    public void adicionarLivro(Livros livro){
        this.catalogo.add(livro);
    }

    public void mostrarCatalogo(){
        for (Livros livro : this.catalogo){
            livro.mostrarDetalhes();
        }
    }
}
