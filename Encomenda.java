import java.util.List;
import java.util.Date;

public class Encomenda {
    private List<Livro> listaDeLivros;
    private double precoTotal;
    private String status;
    private Date dataDaEncomenda;

    public Encomenda(List<Livro> listaDeLivros, double precoTotal) {
        this.listaDeLivros = listaDeLivros;
        this.precoTotal = precoTotal;
    }

    public List<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public String getStatus() {
        return status;
    }

    public Date getDataDaEncomenda() {
        return dataDaEncomenda;
    }
}
