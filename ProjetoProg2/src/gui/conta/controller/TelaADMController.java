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
	protected void btRegistro(ActionEvent e)
	{
		Principal.changeScreen("registro");
	}
	@FXML 
	protected void btMostrarLucros(ActionEvent e)
	{
		System.out.println("Metodo Mostrar Lucros...");
	}
	
	@FXML 
	protected void btCadastrarViagens(ActionEvent e )
	{
		Principal.changeScreen("viagem");
	}
	
	@FXML 
	protected void btCancelar(ActionEvent e)
	{
		Principal.changeScreen("login");
	}


}
