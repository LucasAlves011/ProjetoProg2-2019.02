package beans;

public class Rotas {
    private Cidades cidades;
    private double distancia;

    public Rotas(Cidades cidades, double distancia) {
        this.cidades = cidades;
        this.distancia = distancia;
    }

    public Cidades getCidades() {
        return cidades;
    }

    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
}
