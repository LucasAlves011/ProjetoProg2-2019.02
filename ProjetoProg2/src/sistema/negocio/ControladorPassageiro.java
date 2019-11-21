package sistema.negocio;

import beans.Passageiro;
import sistema.dados.RepositorioPassageiro;

public class ControladorPassageiro {
    private RepositorioPassageiro rp = RepositorioPassageiro.getInstance();
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

    public boolean verificar(Passageiro p) {
        return rp.verificar(p);
    }

    public void comprarBilhete() {

    }


}
