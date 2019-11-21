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
import sun.applet.Main;

public class LoginEditDialogController {

    @FXML private TextField tfLogin;
    @FXML private PasswordField tfSenha;


    private Stage dialogStage;
    private Administrador adm;
    private Funcionario func;
    private boolean okClicked =  false;

    @FXML
    private void initialize() {
        adm = new Administrador("teteus","123");
        func = new Funcionario("lucas","123");
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

//    public void setAdministrador()
//    {
//        adm = new Administrador("mec","mec");
//        //        this.adm = administrador;
////        tfLogin.setText(administrador.getLogin());
////        tfSenha.setText(administrador.getSenha());
//    }

    public Boolean isOkClicked()
    {
        return okClicked;
    }
    @FXML
    private void handleOk() {
        String klogin = tfLogin.getText();
        String ksenha = tfSenha.getText();

        // so seta a conta se a mesma estiver valida
        if (isContaValida()) {

            if (klogin.equals(adm.getLogin()) && ksenha.equals(adm.getSenha()) )
            {        
            	Principal.changeScreen("adm");
                System.out.println("Funcionou");
//            adm.setLogin(tfLogin.getText());
//            adm.setSenha(tfSenha.getText());
                okClicked = true;
//            dialogStage.close();
            }
            else if(klogin.equals(func.getLogin()) && ksenha.equals(func.getSenha()))
            {
            	Principal.changeScreen("func");
            	okClicked = true;

            }
            
        }
    }

    @FXML
    private void cancelar(ActionEvent ae) {
        this.dialogStage.close();
    }

    private boolean isContaValida()
    {

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

            // Apresenta mensagem de erro num alerta
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
