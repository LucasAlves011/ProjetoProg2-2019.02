package sistema.negocio;

import beans.Viagem;
import sistema.dados.RepositorioViagem;

public class ControladorViagem {
    private RepositorioViagem rv;

    public void cadastrar(Viagem v) {
        if (v == null) {
            // exception de viagm nula
        }
        else {
            // receber informacao de viagem (atributos de viagem)
            rv.cadastrar(v);
        }
    }


}
