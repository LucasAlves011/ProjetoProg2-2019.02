package sistema.negocio;

import beans.Bilhete;
import sistema.dados.RepositorioBilhete;

public class ControladorBilhete {
    private RepositorioBilhete rb;

    public void cadastrar(Bilhete b) {
        if (b == null) {
            //TODO exception de bilhete nulo
        }
        else {
            //TODO receber informacao do bilhete na GUI
            rb.cadastrar(b);
        }
    }
}
