package gui.conta.controller;

import beans.Passageiro;
import beans.Viagem;
import gui.conta.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sistema.negocio.ControladorViagem;

import java.time.LocalDate;

public class ViagemDialogController {
    @FXML
    private DatePicker tfDatainicio;
    @FXML
    private DatePicker tfDatafim;
    @FXML
    private TextField tfOrigem;
    @FXML
    private TextField tfDestino;

    private ControladorViagem cv = ControladorViagem.getInstance();
    private Stage dialogStage;
    private boolean okClicked =  false;
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
    @FXML
    public void handleOk(ActionEvent event) {
        String origem = tfOrigem.getText();
        String destino = tfDestino.getText();
        LocalDate data = tfDatainicio.getValue();
        LocalDate data2 = tfDatafim.getValue();
        Viagem v = new Viagem(origem, destino, 100, data, data2);
        cv.cadastrar(v);
        System.out.println("Viagem criada. Informações: " + v);
    }

    @FXML
    protected void btVoltar(ActionEvent e)
    {
        Principal.changeScreen("adm");
    }
}
