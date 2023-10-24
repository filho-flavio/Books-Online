import java.util.ArrayList;
import java.util.Iterator;

public class GestorDeContato extends Pessoa {
    public GestorDeContato(){
        
    }

    ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        System.out.println("------------------------------ \n");
        System.out.println("Cliente " + cliente.getNome() + " adicionado! \n");
        this.clientes.add(cliente);
    }

    public void removerCliente(String nome) {
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Excluindo cliente...");
                iterator.remove();
            }
        }
    }

    public void enviarEmails() {
        for (Cliente c : clientes) {
            if (c.getReceptorDeEmail()) {
                 System.out.println("------------------------------ \n");
                System.out.println("Enviando email para: " + c.getNome());
            } else {
                System.out.println("------------------------------ \n");
                System.out.println("Sem clientes para enviar e-mails!");
            }
        }
    }
}
