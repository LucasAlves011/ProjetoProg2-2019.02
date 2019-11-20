package beans;

import java.time.LocalDate;


public class Passageiro {
    private String nome;
    private LocalDate dataNascimento;
    private Passaporte passaporte;
    private Double saldo;

    public Passageiro(String nome, LocalDate dataNascimento, Passaporte passaporte, double saldo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.passaporte = passaporte;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Passaporte getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(Passaporte passaporte) {
        this.passaporte = passaporte;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
