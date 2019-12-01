package sistema.dados;

import beans.Passageiro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RepositorioPassageiro {

    private static RepositorioPassageiro rp;

    public static RepositorioPassageiro getInstance() {
        if (rp == null) {
            rp = new RepositorioPassageiro();
        }
        return rp;
    }

    public RepositorioPassageiro() {
        this.arrayPassageiros = new ArrayList<>();
    }

    private ArrayList<Passageiro> arrayPassageiros;

    public List<Passageiro> listar()
    {
            List<Passageiro> retorno = new ArrayList<>();
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
