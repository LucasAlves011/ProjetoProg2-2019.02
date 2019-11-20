package beans;

public class Cadeira {
    private Passageiro passageiro;
    private String poltrona;

    public Cadeira(Passageiro passageiro, String poltrona) {
        this.passageiro = passageiro;
        this.poltrona = poltrona;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
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
