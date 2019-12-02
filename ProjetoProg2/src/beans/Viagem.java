package beans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Viagem {
    private String origem;
    private String destino;
    private double custoViagem;
    private LocalDate inicio;
    private LocalDate fim;

    public Viagem(String origem, String destino, double custoViagem, LocalDate inicio, LocalDate fim) {
        this.origem = origem;
        this.destino = destino;
        this.custoViagem = custoViagem;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Viagem(String origem, String destino){
        this.origem = origem;
        this.destino = destino;

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
