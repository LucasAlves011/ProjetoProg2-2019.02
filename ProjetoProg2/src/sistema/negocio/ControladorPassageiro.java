package sistema.negocio;

import beans.Passageiro;
import sistema.dados.RepositorioPassageiro;

import java.util.ArrayList;
import java.util.List;

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
        	//TODO: fazer com que n cadastre o msm usuario
        	rp.cadastrar(p);
        }
    }

    public List<Passageiro> listar() {

        return rp.listar();
    }

    public boolean verificarPassaporte(Passageiro p) {
        return rp.verificarPassaporte(p);
    }

    public boolean verificar(Passageiro p) {
        return rp.verificar(p);
    }


}
