package gui.conta.controller;

import beans.Passageiro;
import beans.Viagem;
import gui.conta.Principal;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sistema.negocio.ControladorPassageiro;
import sistema.negocio.ControladorViagem;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class VerRotasController implements Initializable {
    ControladorViagem cv = ControladorViagem.getInstance();
    @FXML
    private void btVoltar(ActionEvent e){
        Principal.changeScreen("func");
    }

    private ControladorPassageiro cp = ControladorPassageiro.getInstance();
    private Stage dialogStage;
    private boolean okClicked =  false;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
    @FXML
    public void handleOk(ActionEvent event) {
        System.out.println("...");
    }
    @FXML
    private void cancelar(ActionEvent ae) {
        this.dialogStage.close();
    }

    @FXML
    private TableView<ControllerTable.Cliente> tabela;

    @FXML
    private TableColumn<ControllerTable.Cliente,String> atributo1Col;

    @FXML
    private TableColumn<ControllerTable.Cliente,String> atributo2Col;



    private ObservableList<ControllerTable.Cliente> listaDeViagens() {
        cv.cadastrar(new beans.Viagem("Recife","Inferno",500,LocalDate.of(1,1,1),LocalDate.of(2,2,2)));
        List<beans.Viagem> viagens = cv.listar();
        ArrayList<ControllerTable.Cliente> clientes = new ArrayList<>();
        for (beans.Viagem e : viagens) {
            ControllerTable.Cliente c = new ControllerTable.Cliente(e.getDestino(), e.getOrigem());
            clientes.add(c);
        }
        return FXCollections.observableArrayList(clientes);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        atributo1Col.setCellValueFactory(new PropertyValueFactory<>("atributo1"));
        atributo2Col.setCellValueFactory(new PropertyValueFactory<>("atributo2"));

        tabela.setItems(listaDeViagens());
    }
    public static class Viagem {

        private final SimpleStringProperty atributo1;
        private final SimpleStringProperty atributo2;

        public Viagem(String atributo1,String atributo2)
        {
            this.atributo1 = new SimpleStringProperty(atributo1);
            this.atributo2 = new SimpleStringProperty(atributo2);
        }

        public String getNome() {
            return atributo1.get();
        }
        public SimpleStringProperty nomeProperty() {
            return atributo1;
        }
        public void setNome(String atributo1) {
            this.atributo1.set(atributo1);
        }
        public String getPassaporte() {
            return atributo2.get();
        }

        public SimpleStringProperty passaporteProperty() {
            return atributo2;
        }

        public void setPassaporte(String atributo2) {
            this.atributo2.set(atributo2);
        }
    }
}
