import java.util.ArrayList;

public class CarrinhoDeCompras extends Catalogo {
    ArrayList<Livros> carrinho = new ArrayList<>();

    // Adicionar livro ao carrinho
    public void adicionarAoCarrinho(Livros livro) {
        if (temNoCatalogo(livro)) {
            if (carrinho.contains(livro)) {
                System.out.println("O livro já está no seu carrinho!");
            } else {
                carrinho.add(livro);
                System.out.println("O livro foi adicionado com sucesso!");
            }
        } else {
            System.out.println("Este livro não se encontra disponível em nossos catálogos.");
        }
    }

    public boolean temNoCatalogo(Livros livro) {
        return this.catalogo.contains(livro);
    }

    public void removerLivro(Livros livro) {
        if (!this.carrinho.isEmpty()) {
            carrinho.remove(livro);
        }
    }

    public void valorTotal() {
        double total = 0;
        for (int i = 0; i < carrinho.size(); i++) {
            Livros l = carrinho.get(i);
            total += l.valor;
        }
        System.out.printf("Valor Total: R$ %.2f\n", total);
    }

    public void mostrarCarrinho() {
        if (!carrinho.isEmpty()) {
            int contador = 1;
            for (Livros livro : carrinho) {
                System.out.print((contador++) + " - ");
                livro.mostrarDetalhes();
            }
        } else {
            System.out.println("Seu carrinho de compras está vazio!");
        }
    }
}
