package sistema.dados;

import beans.Passageiro;
import beans.Viagem;

import java.util.ArrayList;
import java.util.List;

public class ViagensFachada {
    private static ViagensFachada viagensFachada;

    public static ViagensFachada getInstance(){
        if (viagensFachada == null) {
            viagensFachada = new ViagensFachada();
        }
            return viagensFachada;
    }

    private ArrayList<Passageiro> passageirosEmViagem = new ArrayList<>();

    public void criar(Viagem v) {
        for (Passageiro p : v.getPassageiros()) {
            passageirosEmViagem.add(p);
        }
    }

    public List<Passageiro> listar() {
        List<Passageiro> retorno = new ArrayList<>();
        for (Passageiro e : passageirosEmViagem) {
            retorno.add(e);
        }
        return retorno;
    }

    public void descriar() {
        passageirosEmViagem.removeAll(listar());
    }


}
