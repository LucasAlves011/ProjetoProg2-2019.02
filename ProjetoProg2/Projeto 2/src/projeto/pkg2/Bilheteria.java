
package projeto.pkg2;


public class Bilheteria {
    private CidadesEnum localDeVenda;

    public Bilheteria(CidadesEnum localDeVenda) {
        this.localDeVenda = localDeVenda;
    }

    public CidadesEnum getLocalDeVenda() {
        return localDeVenda;
    }

    public void setLocalDeVenda(CidadesEnum localDeVenda) {
        this.localDeVenda = localDeVenda;
    }
    
    
}
