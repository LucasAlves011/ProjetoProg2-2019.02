package beans;

import java.time.LocalDate;


public class Viagem {
    private Cidades origem;
    private Cidades destino;
    private double custoViagem;
    private LocalDate inicio;
    private LocalDate fim;

    public Viagem(Cidades origem, Cidades destino, double custoViagem, LocalDate inicio, LocalDate fim) {
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

    public Cidades getOrigem() {
        return origem;
    }

    public void setOrigem(Cidades origem) {
        this.origem = origem;
    }

    public Cidades getDestino() {
        return destino;
    }

    public void setDestino(Cidades destino) {
        this.destino = destino;
    }


}
