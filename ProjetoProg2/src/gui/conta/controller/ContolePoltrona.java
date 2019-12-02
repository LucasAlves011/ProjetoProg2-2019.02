package gui.conta.controller;

import gui.conta.Principal;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class ContolePoltrona implements Initializable  {

    @FXML
    private TilePane tilePane;

    @FXML
    private Label cadeiraSelec;

    @FXML
    private Button ok;

    @FXML
    private void setCadeiraSelec(MouseEvent evento){
//        tilePane.getChildren()
        Label q ;
        if (evento.getTarget() instanceof Label){
            q = (Label) evento.getTarget();

            for (int i = 0; i < 104 ; i++) {
                if (ControllerTable.viagemConsulta.getCadeiras()[i].getPoltrona().equals(q.getText())
                && !ControllerTable.viagemConsulta.getCadeiras()[i].isOcupada()){
                    cadeiraSelec.setText(q.getText());
                }
            }
//            for (Poltrona iterador:x.listar()) {
//                if (iterador.getNome().equals(q.getText()) && !iterador.isOcupada()){
//                    cadeiraSelec.setText(q.getText());
//                }
//            }
        }
    }

    public static Image VERDE = new Image("gui/conta/controller/Paint.png");
    public static Image VERMELHO = new Image("gui/conta/controller/vermelho.png");

    @FXML
    private void Ok(){
       if (cadeiraSelec.getText() != null){
           for (int i = 0; i < 104; i++) {
               if(ControllerTable.viagemConsulta.getCadeiras()[i].getPoltrona().equals(cadeiraSelec.getText())){
                   ControllerTable.viagemConsulta.getCadeiras()[i].setOcupada(true);
                   ControllerTable.viagemConsulta = null;
                   break;
               }
           }
           Principal.changeScreen("func");
       }

    }

    private  ArrayList<Label> fazer(int posicao){
        ArrayList<Label> q = new ArrayList<>();
        Label n1 ;


        char letra = 'A';
        for (int i = 0; i < 104 ; i++) {
            //Criar a coluna de letras
            if( i%4 == 0 ){
                String k = "" + letra;
                Label p = new Label(k);
                p.setAlignment(Pos.TOP_CENTER);
                p.setScaleY(2.1);
                p.setScaleX(1.90);
                letra++;
                q.add(p);
                p.setLayoutY(p.getLayoutY()+30);
            }

            //Criar os labels
            n1 = new Label(ControllerTable.viagemConsulta.getCadeiras()[i].getPoltrona(), !ControllerTable.viagemConsulta.getCadeiras()[i].isOcupada() ? new ImageView(VERDE):new ImageView(VERMELHO));
            n1.setContentDisplay(ContentDisplay.TOP);
            if (!ControllerTable.viagemConsulta.getCadeiras()[i].isOcupada()) {
                n1.setCursor(Cursor.HAND);
            } else {
                n1.setCursor(Cursor.DEFAULT);
            }
            q.add(n1);
        }
        return q;
    }
    private int sla = 0;
    public void iniciar(){

            tilePane.getChildren().removeAll(tilePane.getChildren());
           tilePane.getChildren().addAll(fazer(1));


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (ControllerTable.viagemConsulta != null) {
            tilePane.getChildren().addAll(fazer(1));
            System.out.println("Entrou");

        }
        else
            System.out.println("caiu aqui");
    }
}

