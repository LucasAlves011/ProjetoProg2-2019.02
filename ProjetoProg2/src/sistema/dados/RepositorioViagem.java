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
        List<Viagem> viagens = new ArrayList<>();
        for(Viagem f: viagens){
            viagens.add(f);
        }
        return viagens;
    }
}
