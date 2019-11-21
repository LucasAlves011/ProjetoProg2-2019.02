package sistema.dados;

import beans.Passageiro;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RepositorioPassageiro {

    private static RepositorioPassageiro rp;

    public static RepositorioPassageiro getInstance() {
        if (rp == null) {
            rp = new RepositorioPassageiro();
        }
        return rp;
    }

    private ArrayList<Passageiro> arrayPassageiros =  new ArrayList<>();

    public ArrayList<Passageiro> listar()
    {
            ArrayList<Passageiro> retorno = new ArrayList<>();
            for (Passageiro e : arrayPassageiros) {
                retorno.add(e);
            }
            return retorno;
    }

    public void cadastrar(Passageiro p)
    {
        arrayPassageiros.add(p);
    }

    public boolean verificar(Passageiro p){
        return false;
    }

    public void remover(Passageiro p)
    {
        arrayPassageiros.remove(p);
    }

}
