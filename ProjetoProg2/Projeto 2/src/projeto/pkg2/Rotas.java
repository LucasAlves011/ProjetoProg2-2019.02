
package projeto.pkg2;


public class Rotas {
    private CidadesEnum cidades;
    private double distancia;

    public Rotas(CidadesEnum cidades, double distancia) {
        this.cidades = cidades;
        this.distancia = distancia;
    }

    public CidadesEnum getCidades() {
        return cidades;
    }

    public void setCidades(CidadesEnum cidades) {
        this.cidades = cidades;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
}
