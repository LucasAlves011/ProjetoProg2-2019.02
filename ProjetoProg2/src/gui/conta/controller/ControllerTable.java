package gui.conta.controller;

import beans.Passageiro;
import gui.conta.Principal;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sistema.dados.RepositorioPassageiro;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ControllerTable implements Initializable {


    @FXML
    private void btVoltar(ActionEvent e){
        Principal.changeScreen("func");
    }

    private boolean okClicked =  false;
    public void handleOk(ActionEvent event) {
        Cliente contaSelecionada = tabela.getSelectionModel().getSelectedItem();
        int indiceSelecionado = tabela.getSelectionModel().getSelectedIndex();
        venderBilhete(contaSelecionada);
            okClicked = true;
            if(okClicked == true)
                Principal.changeScreen("bilhete");
    }

    private void venderBilhete(Cliente contaSelecionada) {
        System.out.println("Bilhete vendido!!, bom viagem");


    }

    @FXML
    private TableView<Cliente> tabela;

    @FXML
    private TableColumn<Cliente,String> nomeCol;

    @FXML
    private TableColumn<Cliente,String> passaporteCol;


    private ObservableList<Cliente> listaDeClientes()
    {
        return  FXCollections.observableArrayList(
                new Cliente("Matheus","mec1"),
                new Cliente("Paulo","mec2"),
                new Cliente("Lucas","mec3")
                );
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nomeCol.setCellValueFactory(new PropertyValueFactory<>("nome"));
        passaporteCol.setCellValueFactory(new PropertyValueFactory<>("passaporte"));

        tabela.setItems(listaDeClientes());
    }
    public static class Cliente {

        private final SimpleStringProperty nome;
        private final SimpleStringProperty passaporte;

        public Cliente(String nome,String passaporte)
        {
            this.nome = new SimpleStringProperty(nome);
            this.passaporte = new SimpleStringProperty(passaporte);
        }

        public String getNome() {
            return nome.get();
        }
        public SimpleStringProperty nomeProperty() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome.set(nome);
        }
        public String getPassaporte() {
            return passaporte.get();
        }

        public SimpleStringProperty passaporteProperty() {
            return passaporte;
        }

        public void setPassaporte(String passaporte) {
            this.nome.set(passaporte);
        }
    }


}
