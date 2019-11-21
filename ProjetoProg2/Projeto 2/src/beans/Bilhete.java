package beans;

public class Bilhete {
    private double preco;
    private Cadeira cadeira;
    private Cidades destino;
    private Cidades localBilhete;

    public Bilhete(double preco, Cadeira cadeira, Cidades destino,Cidades localBilhete) {
        this.preco = preco;
        this.cadeira = cadeira;
        this.destino = destino;
        this.localBilhete = localBilhete;
    }

    public Cidades getLocalBilhete() {
		return localBilhete;
	}

	public void setLocalBilhete(Cidades localBilhete) {
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


    public Cidades getDestino() {
        return destino;
    }

    public void setDestino(Cidades destino) {
        this.destino = destino;
    }

//    public Bilheteria getLocalBilhete() {
//        return localBilhete;
//    }
//
//    public void setLocalBilhete(Bilheteria localBilhete) {
//        this.localBilhete = localBilhete;
//    }

    @Override
    public String toString() {
        return "beans.Bilhete: \n" + "Preço: R$" + preco +  "\nAssento: " + cadeira + " \nDestino: " + destino + "Origem: " + localBilhete;
    }
    
    
}
