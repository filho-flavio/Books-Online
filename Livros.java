public class Livros {
    private int isbn;
    private String titulo;
    private String descricao;
    protected double valor;
    Autor autor;

    public Livros(Autor autor) {
        this.autor = autor;
        this.isbn = 000 - 000 - 00;
    }

    public void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do livro:";
        System.out.println(mensagem);
        System.out.println("---------------------------");
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("Titulo do livro: " + this.titulo);
        System.out.println("Descrição do livro: " + this.descricao);
        System.out.println("Valor do livro: R$" + this.valor);
        if(temAutor()){
            autor.mostrarDetalhesAutor();
        }
    }

    boolean temAutor(){
        return this.autor != null;
    }

    // Getters e Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return this.isbn;
    }

}