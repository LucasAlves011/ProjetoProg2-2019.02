package gui.conta.controller;

import beans.Administrador;
import beans.Funcionario;
import gui.conta.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginEditDialogController {

    @FXML private TextField tfLogin;
    @FXML private PasswordField tfSenha;


    private Stage dialogStage;
    private Administrador adm;
    private Funcionario func;
    private boolean okClicked =  false;

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
                a.setTitle("Campos Inválidos");
                a.setHeaderText("Por favor, corrija os valores informados.");

                a.showAndWait();
            }
        }
    }


    @FXML
    private void cancelar(ActionEvent ae) {
        Principal.getStage().close();
    }

    private boolean isContaValida(){

        if (tfLogin.getText() == null || tfSenha.getText() == null) {
            return false;
        }

        String msgErro = "";

        if ( tfLogin.getText().length() == 0) {
            msgErro += "Login inválido!\n";
        }
        if ( tfSenha.getText().length() == 0) {
            msgErro += "Senha inválida!\n";
        }

        if (msgErro.length() == 0) {
            return true;
        } else {

            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Campos Inválidos");
            alert.setHeaderText("Por favor, corrija os valores informados.");
            alert.setContentText(msgErro);

            alert.showAndWait();

            return false;
        }
    }
}
