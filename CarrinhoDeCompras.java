import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Livro> itensNoCarrinho;
    private double precoTotal;

    public CarrinhoDeCompras() {
        this.itensNoCarrinho = new ArrayList<>();
        this.precoTotal = 0.0;
    }

    public void adicionarItem(Livro livro) {
        itensNoCarrinho.add(livro);
        precoTotal += livro.getPreco();
    }

    public void removerItem(Livro livro) {
        if (itensNoCarrinho.remove(livro)) {
            precoTotal -= livro.getPreco();
        }
    }

    public List<Livro> getItensNoCarrinho() {
        return itensNoCarrinho;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void mostrarCarrinho() {
        if (!itensNoCarrinho.isEmpty()) {
            System.out.println("Itens no Carrinho:");
            double total = 0.0;
            int contador = 1;

            for (Livro livro : itensNoCarrinho) {
                System.out.println(contador);
                livro.mostrarDetalhes(livro);
                total += livro.getPreco();
                contador++;
            }

            System.out.println("\nTotal a pagar: R$" + total);
        } else {
            System.out.println("Seu carrinho de compras está vazio!");
        }
    }

    public Encomenda finalizarCompra() {
        if (!itensNoCarrinho.isEmpty()) {
            double total = 0.0;
            for (Livro livro : itensNoCarrinho) {
                total += livro.getPreco();
            }

            Encomenda encomenda = new Encomenda(itensNoCarrinho, total);

            itensNoCarrinho.clear();

            return encomenda;
        } else {
            System.out.println("Nenhum item encontrado para finalizar a compra!");
            return null;
        }
    }

    public void limparCarrinho() {
        itensNoCarrinho.clear();
        precoTotal = 0.0;
    }
}
