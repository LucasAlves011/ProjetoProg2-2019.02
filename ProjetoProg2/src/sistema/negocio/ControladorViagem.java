package sistema.negocio;

import beans.Viagem;
import sistema.dados.RepositorioViagem;

import java.util.ArrayList;
import java.util.List;

public class ControladorViagem {
    private RepositorioViagem rv = RepositorioViagem.getInstance();
    private static ControladorViagem cv;

    public static ControladorViagem getInstance(){
        if(cv == null){
            cv = new ControladorViagem();
        }
        return cv;
    }

    public void cadastrar(Viagem v) {
        if (v == null) {
            // exception de viagem nula
        }
        else {
            // receber informacao de viagem (atributos de viagem)
            rv.cadastrar(v);
        }
    }

    public List<Viagem> listar() {
        return rv.listar();
    }
}
