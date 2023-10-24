import java.util.ArrayList;

public class Encomendas extends CarrinhoDeCompras {
    ArrayList<String> encomenda = new ArrayList<String>();
    private double precoTotal;

    void adicionarEncomenda(String livro, double valor) {
        this.precoTotal += valor;
        this.encomenda.add("Livro: " + livro + " Preço Total: " + precoTotal);
    }

    String statusEncomenda(){
        return "Status da Encomenda:\n" + this.encomenda.toString();
    }
}
