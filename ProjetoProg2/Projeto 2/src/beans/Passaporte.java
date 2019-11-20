package beans;

import java.util.ArrayList;


public class Passaporte {
    private ArrayList<Visto> vistos;
    private String codigo;

    public Passaporte(ArrayList<Visto> vistos, String codigo) {
        this.vistos = vistos;
        this.codigo = codigo;
    }

    public ArrayList<Visto> getVistos() {
        return vistos;
    }

    public void setVistos(ArrayList<Visto> vistos) {
        this.vistos = vistos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return codigo;
    }
    
    
}
