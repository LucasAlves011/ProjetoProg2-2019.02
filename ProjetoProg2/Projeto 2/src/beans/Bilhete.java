package beans;

public class Bilhete {
    private double preco;
    private Cadeira cadeira;
    private Trem trem;
    private Cidades destino;
    private Bilheteria localBilhete;

    public Bilhete(double preco, Cadeira cadeira, Trem trem, Cidades destino, Bilheteria localBilhete) {
        this.preco = preco;
        this.cadeira = cadeira;
        this.trem = trem;
        this.destino = destino;
        this.localBilhete = localBilhete;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Cadeira getCadeira() {
        return cadeira;
    }

    public void setCadeira(Cadeira cadeira) {
        this.cadeira = cadeira;
    }

    public Trem getTrem() {
        return trem;
    }

    public void setTrem(Trem trem) {
        this.trem = trem;
    }

    public Cidades getDestino() {
        return destino;
    }

    public void setDestino(Cidades destino) {
        this.destino = destino;
    }

    public Bilheteria getLocalBilhete() {
        return localBilhete;
    }

    public void setLocalBilhete(Bilheteria localBilhete) {
        this.localBilhete = localBilhete;
    }

    @Override
    public String toString() {
        return "beans.Bilhete: \n" + "Preço: R$" + preco +  "\nAssento: " + cadeira + "\nTrem: " + trem + "\nDestino: " + destino + "Origem: " + localBilhete;
    }
    
    
}
