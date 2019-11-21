package gui.conta.controller;

import beans.Passageiro;
import gui.conta.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
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
        cp.cadastrar(p);
        if (cp.verificar(p)) {
            System.out.println("Usuario cadastrado");
            okClicked = true;
        }
    }

    @FXML
    private void cancelar(ActionEvent ae) {
        this.dialogStage.close();
    }


}


