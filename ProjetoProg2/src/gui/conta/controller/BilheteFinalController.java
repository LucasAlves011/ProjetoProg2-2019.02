package gui.conta.controller;

import gui.conta.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class BilheteFinalController {
	
    @FXML
    private void btVoltar(ActionEvent e){
        Principal.changeScreen("vender");
    }

}
