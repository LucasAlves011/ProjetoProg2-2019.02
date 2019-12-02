package beans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;


public class Viagem {
    private String origem;
    private String destino;
    private double custoViagem;
    private LocalDate inicio;
    private LocalDate fim;
    private ArrayList<Passageiro> passageiros = new ArrayList<>();

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void adicionar(Passageiro passageiro) {
        this.passageiros.add(passageiro);
    }

    public Viagem(String origem, String destino, double custoViagem, LocalDate inicio, LocalDate fim) {
        this.origem = origem;
        this.destino = destino;
        this.custoViagem = custoViagem;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Viagem(String origem, String destino,String inicio,String fim){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        this.origem = origem;
        this.destino = destino;
        this.inicio = LocalDate.parse(inicio,formatter);
        this.fim = LocalDate.parse(fim,formatter);
    }

    public double getCustoViagem() {
        return custoViagem;
    }

    public void setCustoViagem(double custoViagem) {
        this.custoViagem = custoViagem;
    }

    public String getInicio() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formatada = this.inicio.format(formatter);
        return formatada;
    }

    public String getFimString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formatada = this.fim.format(formatter);
        return formatada;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "De " + getOrigem() + " até " + getDestino();
    }
}
