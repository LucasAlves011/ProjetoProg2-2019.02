package beans;

import java.time.LocalDate;


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

    public double getCustoViagem() {
        return custoViagem;
    }

    public void setCustoViagem(double custoViagem) {
        this.custoViagem = custoViagem;
    }

    public LocalDate getInicio() {
        return inicio;
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
