package gui.conta.controller;

import beans.Administrador;
import beans.Funcionario;
import beans.Passageiro;
import gui.conta.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import sistema.negocio.ControladorPassageiro;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoginEditDialogController {

    @FXML private TextField tfLogin;
    @FXML private PasswordField tfSenha;
    private ControladorPassageiro cp = ControladorPassageiro.getInstance();


    private Stage dialogStage;
    private Administrador adm;
    private Funcionario func;
    private boolean okClicked =  false;

    @FXML
    public List<Passageiro> listarTodos() {
        return cp.listar();
    }


    @FXML
    private void initialize() {
        adm = new Administrador("adm","123");
        func = new Funcionario("func","123");
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public Boolean isOkClicked(){
        return okClicked;
    }

    @FXML
    private void handleOk() {
        String klogin = tfLogin.getText();
        String ksenha = tfSenha.getText();

        if (isContaValida()) {

            if (klogin.equals(adm.getLogin()) && ksenha.equals(adm.getSenha()) )
            {        
            	Principal.changeScreen("adm");
                System.out.println("Funcionou");
                okClicked = true;
            }
            else if(klogin.equals(func.getLogin()) && ksenha.equals(func.getSenha()))
            {
            	Principal.changeScreen("func");
            	okClicked = true;

            }else {

                Alert a = new Alert(AlertType.ERROR);
                a.initOwner(dialogStage);
                a.setTitle("Campos Inv�lidos");
                a.setHeaderText("Por favor, corrija os valores informados.");

                a.showAndWait();
            }
        }
    }


    @FXML
    private void cancelar(ActionEvent ae) {
        escreverArquivo();
        Principal.getStage().close();
    }

    private boolean isContaValida(){

        if (tfLogin.getText() == null || tfSenha.getText() == null) {
            return false;
        }

        String msgErro = "";

        if ( tfLogin.getText().length() == 0) {
            msgErro += "Login inv�lido!\n";
        }
        if ( tfSenha.getText().length() == 0) {
            msgErro += "Senha inv�lida!\n";
        }

        if (msgErro.length() == 0) {
            return true;
        } else {

            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Campos Inv�lidos");
            alert.setHeaderText("Por favor, corrija os valores informados.");
            alert.setContentText(msgErro);

            alert.showAndWait();

            return false;
        }
    }

    public void escreverArquivo(){
        String Arquivo = "C:\\Users\\Paulo\\Desktop\\ProjetoProg2-2019.02\\ProjetoProg2\\src\\gui\\conta\\controller\\passageirosFile";
        List<Passageiro> passageirosLista = new ArrayList<>();
        System.out.println(""+cp.listar());
        passageirosLista.addAll(cp.listar());
        try {
            BufferedWriter Escritor = new BufferedWriter(new FileWriter(Arquivo));
            for(Passageiro f: passageirosLista){
                String p = f.getNome()+","+f.getPassaporte();
                System.out.println(""+p);

                Escritor.write(p);
                Escritor.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
