package gui.conta.controller;

import beans.Passageiro;
import gui.conta.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import sistema.negocio.ControladorPassageiro;

import java.time.LocalDate;

public class RegisterDialogControler {

    @FXML
    private void btVoltar(ActionEvent e){
        Principal.changeScreen("func");
    }
    @FXML
    private DatePicker tfData;
    @FXML
    private TextField tfPassaporte;
    @FXML
    private TextField tfNome;


    private ControladorPassageiro cp = ControladorPassageiro.getInstance();
    private Stage dialogStage;
    private boolean okClicked =  false;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
    @FXML
    public void handleOk(ActionEvent event) {
        String username = tfNome.getText();
        LocalDate data = tfData.getValue();
        String passaporte = tfPassaporte.getText();
        Passageiro p = new Passageiro(username,data,passaporte);
        if(isPassageiroValido())
        {
        	cp.cadastrar(p);
        	System.out.println("Usuario cadastrado! " + p);
        }else {

            Alert a = new Alert(AlertType.ERROR);
            a.initOwner(dialogStage);
            a.setTitle("Campos Inv�lidos");
            a.setHeaderText("Por favor, corrija os valores informados.");

            a.showAndWait();
        }

    }
    private boolean isPassageiroValido(){

        if (tfNome.getText() == null || tfPassaporte.getText() == null || tfData.getValue() == null ) {
            return false;
        }

        String msgErro = "";

        if ( tfNome.getText().length() == 0) {
            msgErro += "Texto inv�lido!\n";
        }
        if ( tfPassaporte.getText().length() == 0) {
            msgErro += "Texto inv�lido!\n";
        }
        if(tfData.getValue() == null) {
        	msgErro += "Data inv�lida!\n";
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

    @FXML
    private void cancelar(ActionEvent ae) {
        this.dialogStage.close();
    }


}


