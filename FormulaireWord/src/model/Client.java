package model;

import java.sql.Date;

import view.FormFrame;

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
	
	/**
	* getter titre
	* @return
	*/
	public String getTitre() {
		new FormFrame();
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
		new FormFrame();
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
		new FormFrame();
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
		new FormFrame();
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
		new FormFrame();
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
		new FormFrame();
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
		new FormFrame();
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}

	
