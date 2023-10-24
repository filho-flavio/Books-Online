public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dtaNascimento;

    public Pessoa (){

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

     public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

     public void setDtaNascimento(String dtaNascimento){
        this.dtaNascimento = dtaNascimento;
    }

    public String getDtaNascimento(){
        return this.dtaNascimento;
    }
}
