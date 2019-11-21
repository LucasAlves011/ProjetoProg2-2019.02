package gui.conta.controller;

import gui.conta.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TelaFUNCController {
	
	@FXML 
	protected void btCadastrar(ActionEvent e)
	{
		System.out.println("Metodo cadastrar...");
	}
	
	@FXML 
	protected void btVerRotas(ActionEvent e)
	{
		System.out.println("Metodo Ver rotas...");
	}
	@FXML 
	protected void btVenderBilhetes(ActionEvent e)
	{
		System.out.println("Metodo Vender Bilhetes...");
	}
	
	@FXML 
	protected void btCancelar(ActionEvent e)
	{
		Principal.changeScreen("login");
	}
}
