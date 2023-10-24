public class Autor extends Pessoa{
    public Autor(String nome) {
        this.nome = nome;
    }

    public void mostrarDetalhesAutor() {
        String mensagem = "Mostrando detalhes do autor:";
        System.out.println(mensagem);
        System.out.println("Nome do autor: " + this.getNome());
    }
}
