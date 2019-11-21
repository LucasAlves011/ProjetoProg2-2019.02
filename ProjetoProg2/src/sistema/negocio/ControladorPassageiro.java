package sistema.negocio;

import beans.Passageiro;
import sistema.dados.RepositorioPassageiro;

import java.util.ArrayList;

public class ControladorPassageiro {
    private RepositorioPassageiro rp = new RepositorioPassageiro();
    private static ControladorPassageiro cp;

    public static ControladorPassageiro getInstance(){
        if(cp == null){
            cp = new ControladorPassageiro();
        }
        return cp;
    }


    public void cadastrar(Passageiro p) {
        if (p == null) {
            //TODO exce��o de Passageiro nulo
        }
        else {
            //TODO receber informa��es do passageiro
            rp.cadastrar(p);
        }
    }

    public ArrayList<Passageiro> listar() {
        return rp.listar();
    }

    public boolean verificar(Passageiro p) {
        return rp.verificar(p);
    }


}
