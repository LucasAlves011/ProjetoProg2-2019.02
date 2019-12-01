package gui.conta.controller;

import beans.Viagem;
import gui.conta.Principal;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sistema.negocio.ControladorViagem;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ResourceBundle;

public class Registro implements Initializable {
    private final ControladorViagem cv = new ControladorViagem();

    private boolean okClicked =  false;

    @FXML
    private TableView<Viagem> tblViagem;
    @FXML
    private TableColumn<Viagem, String> clDestino;
    @FXML
    private TableColumn<Viagem, String> clOrigem;
    @FXML
    private TableColumn<Viagem, String> clData;
    @FXML
    private TableColumn<Viagem, String> clAssentos;

    private ObservableList<Viagem> data;

    public static SimpleDateFormat dataFormatter = new SimpleDateFormat("dd/MM/yyyy");

    @FXML
    private void btVoltar(ActionEvent e){
        Principal.changeScreen("adm");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        clDestino.setCellValueFactory(new PropertyValueFactory<Viagem, String>("destino"));
        clOrigem.setCellValueFactory(new PropertyValueFactory<Viagem, String>("origem"));
        clData.setCellValueFactory(new PropertyValueFactory<Viagem, String>("inicio"));
        clAssentos.setCellValueFactory(new PropertyValueFactory<Viagem, String>("assento"));

        tblViagem.getItems().setAll(listarViagens());
        data = FXCollections.observableArrayList();
        data.addAll(listarViagens());
    }

    public void atualizar() {
        tblViagem.getItems().setAll(listarViagens());
        data = FXCollections.observableArrayList();
        data.addAll(listarViagens());
    }

    private List<Viagem> listarViagens() {
        return cv.listar();
    }
}
