package gui.conta;

import java.io.IOException;

import beans.Administrador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Principal extends Application {
	
	private static Stage stage;
	private static Scene telaLogin;
	private static Scene telaFunc;
	private static Scene telaAdm;
	private static Scene telacadastro;
	private static Scene telaviagem;
	private static Scene telaVender;
	private static Scene telaVerRotas;


	public static Stage getStage() {
		return stage;
	}

	@Override
    public void start(Stage primaryStage) throws IOException {
    	
    	stage = primaryStage;
        Pane fxmlLogin =  FXMLLoader.load(getClass().getResource("FXMLTela.fxml"));
        telaLogin = new Scene(fxmlLogin);
        
        Pane fxmlFunc=  FXMLLoader.load(getClass().getResource("TelaFUNC.fxml"));
        telaFunc = new Scene(fxmlFunc);
        
        Pane fxmlAdm =  FXMLLoader.load(getClass().getResource("TelaADM.fxml"));
        telaAdm = new Scene(fxmlAdm);

		Pane fxmlcadastro = FXMLLoader.load(getClass().getClassLoader().getResource("gui/conta/TelaDeCadastro.fxml"));
		telacadastro = new Scene(fxmlcadastro);

		Pane fxmlViagem = FXMLLoader.load(getClass().getClassLoader().getResource("gui/conta/Tela de viagem.fxml"));
		telaviagem = new Scene(fxmlViagem);

		Pane fxmlVender = FXMLLoader.load(getClass().getClassLoader().getResource("gui/conta/VenderBilhete.fxml"));
		telaVender = new Scene(fxmlVender);

		Pane fxmlVerRotas = FXMLLoader.load(getClass().getClassLoader().getResource("gui/conta/TELA VER ROTAS.fxml"));
		telaVerRotas = new Scene(fxmlVerRotas);

		primaryStage.setScene(telaLogin);
        primaryStage.show();
    }
    
    public static void changeScreen(String str)
    {
    	switch (str) {

			case "login":
				stage.setScene(telaLogin);
				break;
			case "func":
				stage.setScene(telaFunc);
				break;
			case "adm":
				stage.setScene(telaAdm);
				break;
			case "cadastro":
				stage.setScene(telacadastro);
				break;
			case "viagem":
				stage.setScene(telaviagem);
				break;
			case "vender":
				stage.setScene(telaVender);
				break;
			case"verRotas":
				stage.setScene(telaVerRotas);
				break;
				default:
			break;
		}
    }
    public static void main(String[] args) {
        launch(args);
    }
}
