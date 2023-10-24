import java.util.List;

public class GestorDeContato {
    private List<Cliente> clientesRegistradosParaEmails;

    public GestorDeContato(List<Cliente> clientesRegistradosParaEmails) {
        this.clientesRegistradosParaEmails = clientesRegistradosParaEmails;
    }

    public List<Cliente> getClientesRegistradosParaEmails() {
        return clientesRegistradosParaEmails;
    }

    public void enviarEmailPromocional(Cliente cliente, String mensagem) {
        // Lógica para enviar um email promocional para o cliente
        System.out.println("Enviando email promocional para " + cliente.getNome() + ": " + mensagem);
    }

    public void enviarEmailInformativo(Cliente cliente, String mensagem) {
        // Lógica para enviar um email informativo para o cliente
        System.out.println("Enviando email informativo para " + cliente.getNome() + ": " + mensagem);
    }
}
