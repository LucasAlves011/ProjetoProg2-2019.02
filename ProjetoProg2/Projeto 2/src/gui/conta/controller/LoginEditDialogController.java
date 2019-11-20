package gui.conta.controller;

import beans.Administrador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginEditDialogController {

    @FXML private TextField tfLogin;
    @FXML private TextField tfSenha;

    private Stage dialogStage;
    private Administrador adm;
    private boolean okClicked =  false;

    @FXML
    private void initialize() {
        adm = new Administrador("mec","mec");
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
                System.out.println("Funcionou");
//            adm.setLogin(tfLogin.getText());
//            adm.setSenha(tfSenha.getText());
            okClicked = true;
//            dialogStage.close();

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
