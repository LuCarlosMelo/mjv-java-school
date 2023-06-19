package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DadosPessoais {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String sexo;

    public DadosPessoais(){}
    public DadosPessoais(String nome, String cpf, LocalDate dataNascimento, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getNome() + "; ");
        stringBuilder.append(getDataNascimento() + "; ");
        stringBuilder.append(getCpf() + "; ");
        stringBuilder.append(getSexo() + "; ");
        return stringBuilder.toString();
    }
}
