package gui.conta.controller;

import beans.Passageiro;
import beans.Viagem;
import gui.conta.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
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
        if(isViagemValida())
        {        
        	cv.cadastrar(v);
        	System.out.println("Viagem criada. Informa��es: " + v);
        	Principal.changeScreen("adm");
        }else {

            Alert a = new Alert(AlertType.ERROR);
            a.initOwner(dialogStage);
            a.setTitle("Campos Inv�lidos");
            a.setHeaderText("Por favor, corrija os valores informados.");

            a.showAndWait();
        }

    }
    
    private boolean isViagemValida(){

        if (tfOrigem.getText() == null || tfDestino.getText() == null || tfDatafim.getValue() == null || tfDatainicio.getValue() == null) {
            return false;
        }

        String msgErro = "";

        if ( tfOrigem.getText().length() == 0) {
            msgErro += "Texto inv�lido!\n";
        }
        if ( tfDestino.getText().length() == 0) {
            msgErro += "Texto inv�lido!\n";
        }
        if(tfDatafim.getValue() == null) {
        	msgErro += "Data inv�lida!\n";
        }
        if(tfDatainicio.getValue() == null) {
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
    protected void btVoltar(ActionEvent e)
    {
        Principal.changeScreen("adm");
    }
}
