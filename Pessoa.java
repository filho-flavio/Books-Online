import java.util.Date;
public class Pessoa {
    private String nome;
    private String cpf;
    private Date dataNascimento;

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

     public void setDtaNascimento(Date dtaNascimento){
        this.dataNascimento = dtaNascimento;
    }

    public Date getDtaNascimento(){
        return this.dataNascimento;
    }
}
