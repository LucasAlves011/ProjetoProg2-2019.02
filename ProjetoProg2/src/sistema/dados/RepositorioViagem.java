package sistema.dados;

import beans.Viagem;

import java.util.ArrayList;
import java.util.List;

public class RepositorioViagem {
    private ArrayList<Viagem> viagens = new ArrayList<>();

    private static RepositorioViagem rv;

    public static RepositorioViagem getInstance() {
        if (rv == null) {
            rv = new RepositorioViagem();
        }
        return rv;
    }

    public void cadastrar(Viagem v) {
        viagens.add(v);
    }

    public List<Viagem> listar() {
        List<Viagem> listaViagens = new ArrayList<>();
        for(Viagem f: viagens){
            listaViagens.add(f);
        }
        return listaViagens;
    }

    public boolean verificarViagem(Viagem v){
        boolean retorno = false;
        for(Viagem f: viagens){
            if(v.getOrigem().equals(f.getOrigem()) && v.getDestino().equals(f.getDestino())){
                retorno = true;
            }
        }
        return retorno;
    }

}
