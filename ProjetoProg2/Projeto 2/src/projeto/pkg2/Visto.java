
package projeto.pkg2;

import java.time.LocalDate;
import java.util.ArrayList;


public class Visto {
    private LocalDate validade;
    private ArrayList<CidadesEnum> cidades;

    public Visto(LocalDate validade, ArrayList<CidadesEnum> cidades) {
        this.validade = validade;
        this.cidades = cidades;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public ArrayList<CidadesEnum> getCidades() {
        return cidades;
    }

    public void setCidades(ArrayList<CidadesEnum> cidades) {
        this.cidades = cidades;
    }
    
    public boolean isValid() {
        return !this.validade.isAfter(LocalDate.now());
    }
    
    public boolean isValidForViagem(Viagem v) {
        return !this.validade.isAfter(v.getFim());
    }
    
    
    
}
