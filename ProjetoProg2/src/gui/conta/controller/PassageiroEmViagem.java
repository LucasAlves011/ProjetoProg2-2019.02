package gui.conta.controller;

import beans.Passageiro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sistema.dados.ViagensFachada;

import java.util.List;

public class PassageiroEmViagem {
    private boolean okClicked =  false;

    @FXML
    private TableView<Passageiro> tblPassageiro;
    @FXML
    private TableColumn<Passageiro, String> clNome;
    @FXML
    private TableColumn<Passageiro, String> clPassaporte;
    @FXML
    private TableColumn<Passageiro, String> clIdade;


    @FXML
    private void btFechar(ActionEvent a) {
        ((Stage)(((Button)a.getSource()).getScene().getWindow())).close();
    }

    public void atualizar(){
        clNome.setCellValueFactory(new PropertyValueFactory<Passageiro, String>("nome"));
        clPassaporte.setCellValueFactory(new PropertyValueFactory<Passageiro, String>("passaporte"));
        clIdade.setCellValueFactory(new PropertyValueFactory<Passageiro, String>("idade"));
        tblPassageiro.getItems().setAll(listar());
    }

    private List<Passageiro> listar() {
        return ViagensFachada.getInstance().listar();
    }


}
