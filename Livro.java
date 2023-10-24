public class Livro {
    private String titulo;
    private double preco;
    private String isbn;
    private String descricao;
    private String autor;

    public Livro(String titulo, String autor, double preco, String isbn, String descricao) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.isbn = isbn;
        this.descricao = descricao;
    }

    // Getters e Setters para os atributos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrarDetalhes(Livro livro) {
        System.out.println(". Título: " + livro.getTitulo());
        System.out.println("   Autor: " + livro.getAutor());
        System.out.println("   Preço: R$" + livro.getPreco());
        System.out.println("   ISBN: " + livro.getIsbn());
        System.out.println("   Descrição: " + livro.getDescricao());
    }
}
