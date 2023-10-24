public class Website {
    public static void main(String[] args) {
        
        CatalogoDeLivros catalogo = new CatalogoDeLivros();

        Livro livro1 = new Livro("O pequeno príncipe", "Autor 1", 19.99, "978-1234567890", "Descrição do livro 1");
        Livro livro2 = new Livro("Aventuras Fantásticas", "Autor 2", 14.99, "978-9876543210", "Descrição do livro 2");

        catalogo.adicionarLivro(livro1);
        catalogo.adicionarLivro(livro2);

        System.out.println("Catálogo de Livros Disponíveis:");
        for (Livro livro : catalogo.getLivrosDisponiveis()) {
            livro.mostrarDetalhes(livro);
        }

        String tituloDesejado = "O pequeno príncipe";
        Livro livroEncontrado = catalogo.encontrarLivroPorTitulo(tituloDesejado);

        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado.getTitulo());
        } else {
            System.out.println("Livro não encontrado.");
        }

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem(livro1);
        carrinho.adicionarItem(livro2);

        System.out.println("Carrinho de Compras:");
        carrinho.mostrarCarrinho();

        carrinho.finalizarCompra();
    }
}
