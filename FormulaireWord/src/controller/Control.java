package controller;

import view.FormFrame;

public class Control {

	// propriétés
	private FormFrame formFrame;
	
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
		formFrame = new FormFrame(this);
		formFrame.setVisible(true);

	}
}
