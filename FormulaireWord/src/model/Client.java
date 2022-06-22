package model;

import java.sql.Date;

import controller.Control;

/**
 * Classe Client, paramètres associés et getters/setters 
 * @author Jean
 */
public class Client {
	
	// propriétés
	private String titre;
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private float montant;
	private Date date;
	// constructeur du control
	public Client(Control control) {
	}

	// constructeur de l'identité
	public void ID(String titre, String nom, String prenom) {
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
	}
	 
	/**
	 * getter titre
	 * @return
	 */
	public String getTitre() {
		return this.titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	/**
	 * getter sur le nom
	 * @param  
	 * @return
	 */
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * getter sur le prénom
	 * @return
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * getter sur l'adresse
	 * @return
	 */
	public String getAdresse() {
		return this.adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	/**
	 * getter sur la ville
	 * @return
	 */
	public String getVille() {
		return this.ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	/**
	 * getter sur le montant
	 * @return
	 */
	public float getMontant() {
		return this.montant;
	}
	
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	/**
	 * getter sur la date
	 * @return
	 */
	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
