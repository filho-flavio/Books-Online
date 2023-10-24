public class Main {
    public static void main(String[] args) {
        GestorDeContato gestor = new GestorDeContato();

        gestor.setNome("Pedrinho");
        gestor.setCpf("000.000.000-00");
        gestor.setDtaNascimento("2000-07-16");

        Cliente cliente = new Cliente();
        cliente.setNome("Ana");
        cliente.setCpf("345.890.123-45");
        cliente.setDtaNascimento("1990-01-16");
        cliente.setEmail("Ana@ifg.com");
        cliente.setReceptorDeEmail(true);
        cliente.mostrarDados();

        gestor.adicionarCliente(cliente);
        gestor.enviarEmails();
    }
}
