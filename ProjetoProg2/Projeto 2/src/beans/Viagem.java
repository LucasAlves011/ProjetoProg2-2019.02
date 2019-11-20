package beans;

import java.time.LocalDate;


public class Viagem {
    private Rotas rota;
    private double custoViagem;
    private LocalDate inicio;
    private LocalDate fim;

    public Viagem(Rotas rota, double custoViagem, LocalDate inicio, LocalDate fim) {
        this.rota = rota;
        this.custoViagem = custoViagem;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Rotas getRota() {
        return rota;
    }

    public void setRota(Rotas rota) {
        this.rota = rota;
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

    
    
    
}
