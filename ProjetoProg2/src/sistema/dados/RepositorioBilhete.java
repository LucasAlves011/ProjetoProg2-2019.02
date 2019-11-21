package sistema.dados;

import beans.Bilhete;

import java.util.ArrayList;

public class RepositorioBilhete {

    private static RepositorioBilhete rb;

    public RepositorioBilhete getInstance () {
        if (rb == null) {
            rb = new RepositorioBilhete();
        }
        return rb;
    }

    private ArrayList<Bilhete> bilhetes = new ArrayList<>();

    public void cadastrar(Bilhete b) {
        bilhetes.add(b);
    }
}
