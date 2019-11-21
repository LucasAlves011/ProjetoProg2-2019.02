package gui.conta.controller;

import beans.Passageiro;
import gui.conta.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaVenderBilheteController {

    @FXML
    private void btVoltar(ActionEvent e){
        Principal.changeScreen("func");
    }


    @FXML private TextField tfNome;
    @FXML private TextField tfPassaporte;

    private Stage dialogStage;
    private Passageiro passageiro;
    private boolean okClicked = false;


    @FXML
    private void initialize() {
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setPassageiro(Passageiro p) {
        this.passageiro = p;
        tfNome.setText(p.getNome());;
        tfPassaporte.setText(p.getPassaporte());;
    }

    @FXML
    private void cancelar(ActionEvent ae) {
        this.dialogStage.close();
    }

    private boolean isContaValida() {
        String msgErro = "";

        if (tfNome.getText() == null || tfNome.getText().length() == 0) {
            msgErro += "Número Inválido!\n";
        }
        if (tfPassaporte.getText() == null || tfPassaporte.getText().length() == 0) {
            msgErro += "Nome do cliente inválido!\n";
        }
        if (msgErro.length() == 0) {
            return true;
        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Campos Inválidos");
            alert.setHeaderText("Por favor, corrija os valores informados.");
            alert.setContentText(msgErro);

            alert.showAndWait();

            return false;
        }
    }




}
