
package projeto.pkg2;

import java.util.ArrayList;


public class Trem {
    private String nome;
    private ArrayList<Cadeira> cadeiras;
    private Fiscal fiscal;
    private Viagem viagem;
    private ArrayList<Passageiro> passageiros; 

    public Trem(String nome, ArrayList<Cadeira> cadeiras, Fiscal fiscal, Viagem viagem, ArrayList<Passageiro> passageiros) {
        this.cadeiras = cadeiras;
        this.fiscal = fiscal;
        this.viagem = viagem;
        this.passageiros = passageiros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cadeira> getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(ArrayList<Cadeira> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public Fiscal getFiscal() {
        return fiscal;
    }

    public void setFiscal(Fiscal fiscal) {
        this.fiscal = fiscal;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        return nome;
    }   
}
