package beans;

import java.time.LocalDate;
import java.util.ArrayList;


public class Visto {
    private LocalDate validade;
    private ArrayList<Cidades> cidades;

    public Visto(LocalDate validade, ArrayList<Cidades> cidades) {
        this.validade = validade;
        this.cidades = cidades;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public ArrayList<Cidades> getCidades() {
        return cidades;
    }

    public void setCidades(ArrayList<Cidades> cidades) {
        this.cidades = cidades;
    }
    
    public boolean isValid() {
        return !this.validade.isAfter(LocalDate.now());
    }
    
    public boolean isValidForViagem(Viagem v) {
        return !this.validade.isAfter(v.getFim());
    }
    
    
    
}
