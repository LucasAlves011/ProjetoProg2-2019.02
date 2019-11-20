package sistema.negocio;

import beans.Passageiro;
import sistema.dados.RepositorioPassageiro;

public class ControladorPassageiro {
    private RepositorioPassageiro rp;

    public void cadastrar(Passageiro p) {
        if (p == null) {
            //TODO exce��o de Passageiro nulo
        }
        else {
            //TODO receber informa��es do passageiro
            rp.cadastrar(p);
        }
    }

    public void comprarBilhete() {

    }


}
