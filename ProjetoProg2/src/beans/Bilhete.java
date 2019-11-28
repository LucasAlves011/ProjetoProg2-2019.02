package beans;

public class Bilhete {
    private double preco;
    private int cadeira;
    private String destino;
    private String localBilhete;

    public Bilhete(double preco, int cadeira, String destino, String localBilhete) {
        this.preco = preco;
        this.cadeira = cadeira;
        this.destino = destino;
        this.localBilhete = localBilhete;
    }

    public String getLocalBilhete() {
		return localBilhete;
	}

	public void setLocalBilhete(String localBilhete) {
		this.localBilhete = localBilhete;
	}

	public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCadeira() {
        return cadeira;
    }

    public void setCadeira(int cadeira) {
        this.cadeira = cadeira;
    }


    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
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
