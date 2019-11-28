package gui.conta.controller;

import beans.Bilhete;
import beans.Passageiro;
import beans.Viagem;
import com.sun.deploy.util.ArrayUtil;
import com.sun.security.ntlm.Client;
import gui.conta.Principal;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sistema.dados.RepositorioPassageiro;
import sistema.negocio.ControladorPassageiro;
import sistema.negocio.ControladorViagem;

import java.lang.reflect.Array;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerTable implements Initializable {


    @FXML
    private void btVoltar(ActionEvent e){
        Principal.changeScreen("func");
    }

    private boolean okClicked =  false;
    public void handleOk(ActionEvent event) {
        Passageiro contaSelecionada = tabela.getSelectionModel().getSelectedItem();
        int indiceSelecionado = tabela.getSelectionModel().getSelectedIndex();
        venderBilhete(contaSelecionada);
        okClicked = true;
        if(okClicked == true)
            Principal.changeScreen("bilhete");
    }

    private void venderBilhete(Passageiro contaSelecionada) {
        Viagem viagemSelecionada = viagens.getSelectionModel().getSelectedItem();
        if (viagemSelecionada == null) {
            System.out.println("Selecione uma viagem.");
        }
        else {
            Bilhete b = new Bilhete(viagemSelecionada.getCustoViagem(), 1, viagemSelecionada.getDestino(), viagemSelecionada.getOrigem());
            contaSelecionada.adicionarBilhete(b);
            System.out.println("O passageiro " + contaSelecionada.getNome() + " comprou o bilhete para " + b.getDestino());
        }
    }

    private ControladorPassageiro cp = ControladorPassageiro.getInstance();
    private ControladorViagem cv = ControladorViagem.getInstance();

    @FXML
    private TableView<Passageiro> tabela;

    @FXML
    private TableColumn<Passageiro,String> nomeCol;

    @FXML
    private TableColumn<Passageiro,String> passaporteCol;

    @FXML
    private ChoiceBox<Viagem> viagens = new ChoiceBox<>();

    @FXML
    public List<Passageiro> listarTodos() {
        return cp.listar();
    }

    public List<Viagem> listarViagens() {
        return cv.listar();
    }



    private ObservableList<Passageiro> listaDeClientes() {
        return FXCollections.observableArrayList(listarTodos());
    }
        @Override
        public void initialize(URL location, ResourceBundle resources) {
        nomeCol.setCellValueFactory(new PropertyValueFactory<Passageiro, String>("nome"));
        passaporteCol.setCellValueFactory(new PropertyValueFactory<Passageiro, String>("passaporte"));
        atualizar();
    }

    public void atualizar() {
        tabela.getItems().setAll(listarTodos());
        ArrayList<Viagem> a = new ArrayList<>();
        for (Viagem e : listarViagens()){
            a.add(e);
        }
        ObservableList<Viagem> lista = FXCollections.observableArrayList(a);
        viagens.setItems(lista);

    }

    }