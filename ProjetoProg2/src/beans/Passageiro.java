package beans;

import java.time.LocalDate;
import java.util.ArrayList;


public class Passageiro {
    private String nome;
    private LocalDate dataNascimento;
    private String passaporte;
    private ArrayList<Bilhete> bilhetes = new ArrayList<>();

    public Passageiro(String nome, LocalDate dataNascimento, String passaporte) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.passaporte = passaporte;
    }

    public Passageiro(String nome,String passaporte) {
        this.nome = nome;
        this.passaporte = passaporte;
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

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public ArrayList<Bilhete> getBilhetes() {
        return bilhetes;
    }

    public void adicionarBilhete (Bilhete bilhete){
        this.bilhetes.add(bilhete);
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
