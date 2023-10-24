import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String email;
    private CarrinhoDeCompras carrinho;
    private List<Encomenda> encomendas;

    public Cliente(String nome, String cpf, Date dataNascimento, String email) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDtaNascimento(dataNascimento);
        this.setEmail(email);
        this.carrinho = new CarrinhoDeCompras();
        this.encomendas = new ArrayList<>();
    }

    // Getters e Setters para os atributos

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public List<Encomenda> getEncomendas() {
        return encomendas;
    }
}
