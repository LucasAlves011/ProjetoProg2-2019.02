package sistema.negocio;


import beans.Cidades;

public class Bilheteria {
    private Cidades localDeVenda;

    public Bilheteria(Cidades localDeVenda) {
        this.localDeVenda = localDeVenda;
    }

    public Cidades getLocalDeVenda() {
        return localDeVenda;
    }

    public void setLocalDeVenda(Cidades localDeVenda) {
        this.localDeVenda = localDeVenda;
    }


}
