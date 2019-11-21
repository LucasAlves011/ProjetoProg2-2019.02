package gui.conta.controller;

import gui.conta.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TelaADMController {
	
	@FXML 
	protected void btGerarRelatorio(ActionEvent e)
	{
		System.out.println("Metodo GerarRelatorio...");
	}
	
	@FXML 
	protected void btVerInformacoes(ActionEvent e)
	{
		System.out.println("Metodo Ver Informacoes...");
	}
	@FXML 
	protected void btMostrarLucros(ActionEvent e)
	{
		System.out.println("Metodo Mostrar Lucros...");
	}
	
	@FXML 
	protected void btCadastrarViagens(ActionEvent e )
	{
		System.out.println("Metodo Cadastrar Viagens...");
	}
	
	@FXML 
	protected void btCancelar(ActionEvent e)
	{
		Principal.changeScreen("login");
	}

}
