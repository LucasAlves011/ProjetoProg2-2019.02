package sistema.dados;

import beans.Viagem;

import java.util.ArrayList;

public class RepositorioViagem {
    private ArrayList<Viagem> viagens = new ArrayList<>();

    private static RepositorioViagem rv;

    public RepositorioViagem getInstance () {
        if (rv == null) {
            rv = new RepositorioViagem();
        }
        return rv;
    }

    public void cadastrar(Viagem v) {
        viagens.add(v);
    }
}
