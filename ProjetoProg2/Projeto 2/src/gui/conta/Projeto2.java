package gui.conta;

import java.io.IOException;

import beans.Administrador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Projeto2 extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        Pane root =  FXMLLoader.load(getClass().getResource("FXMLTela.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();



    }
    public static void main(String[] args) {
        Administrador x = new Administrador("mec","mec");
        launch(args);
    }
}
