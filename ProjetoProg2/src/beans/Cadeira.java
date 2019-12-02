package beans;

public class Cadeira {
    private String poltrona;
    private boolean ocupada;

    public Cadeira( String poltrona) {
        this.poltrona = poltrona;
        ocupada = false;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    @Override
    public String toString() {
        return poltrona;
    }
    
    
}
