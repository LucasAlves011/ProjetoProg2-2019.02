package sistema.dados;

import beans.Passageiro;

import java.util.ArrayList;

public class RepositorioPassageiro {

    private static RepositorioPassageiro rp;

    public RepositorioPassageiro getInstance () {
        if (rp == null) {
            rp = new RepositorioPassageiro();
        }
        return rp;
    }

    private ArrayList<Passageiro> arrayPassageiros =  new ArrayList<>();

    public void cadastrar(Passageiro p)
    {
        arrayPassageiros.add(p);
    }

    public void remover(Passageiro p)
    {
        arrayPassageiros.remove(p);
    }

}
