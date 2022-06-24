package controller;

import model.Client;
import view.FormFrame;

public class Control {

	// déclaration des variables du model et view
	private FormFrame formFrame;
	private Client client;
	
	/**
	 * Méthode de démarrage
	 * @param args
	 */
	public static void main(String[] args) {
		new Control();
	}
	
	/**
	 * Constructeur
	 */
	public Control () {
		this.formFrame = new FormFrame();
		new Client();		
		formFrame.setVisible(true);

	}
}
