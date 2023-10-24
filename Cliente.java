public class Cliente extends Pessoa {
    private String email;
    private boolean receptorDeEmail;

    public Cliente() {

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setReceptorDeEmail(boolean receptorDeEmail) {
        this.receptorDeEmail = receptorDeEmail;
    }

    public boolean getReceptorDeEmail() {
        return this.receptorDeEmail;
    }

    public void mostrarDados() {
        System.out.println("Dados do cliente");
        System.out.println("------------------------------ \n");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getDtaNascimento());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Recebe Email? " + (this.getReceptorDeEmail() ? "Sim" : "Não"));
    }
}
