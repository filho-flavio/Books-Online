import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
    private List<Livro> livrosDisponiveis;

    public CatalogoDeLivros() {
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosDisponiveis.remove(livro);
    }

    public List<Livro> getLivrosDisponiveis() {
        return livrosDisponiveis;
    }

    public Livro encontrarLivroPorTitulo(String tituloDesejado) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getTitulo().equalsIgnoreCase(tituloDesejado)) {
                return livro; // Retorna o livro se o título corresponder
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }
}
