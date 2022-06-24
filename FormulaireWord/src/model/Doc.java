package model;

import java.io.FileOutputStream;
import java.sql.Date;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import view.FormFrame;

public class Doc {
	
	// création des variables liées au Frame
	private String nomClient;
	private String prenomClient;
	private String adresseClient;
	private String villeClient;
	private float facture;
	private Date date;
			
	/**
	 * getter sur le nom du client
	 * @return le nomClient
	 */
	public String getNomClient() {
		return nomClient;
	}
	
	/**
	 * setter sur le nom du client
	 * @param nomClient le nomClient à mettre en place
	 */
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	/**
	 * getter sur le prenom du client
	 * @return le prenomClient
	 */
	public String getPrenomClient() {
		return prenomClient;
	}

	/**
	 * setter sur le prenom du client
	 * @param prenomClient le prenomClient à mettre en place
	 */
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	
	/**
	 * getter sur l'adresse du client
	 * @return l'adresseClient
	 */
	public String getAdresseClient() {
		return adresseClient;
	}

	/**
	 * setter sur l'adresse du client
	 * @param adresseClient l'adresse client à mettre en place
	 */
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	/**
	 * getter sur la ville du client
	 * @return la villeClient
	 */
	public String getVilleClient() {
		return villeClient;
	}

	/**
	 * setter sur la ville du client
	 * @param villeClient la ville du client à mettre en place
	 */
	public void setVilleClient(String villeClient) {
		this.villeClient = villeClient;
	}
	
	/**
	 * getter sur la facture
	 * @return le montant de la facture
	 */
	public float getFacture() {
		return facture;
	}

	/**
	 * setter sur la facture
	 * @param facture la facture du client à mettre en place
	 */
	public void setFacture(float facture) {
		this.facture = facture;
	}

	/**
	 * getter sur la date de la facture
	 * @return la date 
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * setter sur la date
	 * @param date la date de la facture du client à mettre en place
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * méthode finale de création du document
	 */
	private static final XWPFDocument document = new XWPFDocument();
	
	/**
	 * appel du FormFrame
	 */
	private FormFrame formFrame;
	
	public Doc(FormFrame formFrame) {
		
		/**
		 * constructeur de FormFrame
		 */
		this.formFrame = new FormFrame();
		
		// header partie gauche
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		run.setText("Arkadia PC");
		run.addBreak();
		run.setText("4, rue des Pyrénées");
		run.addBreak();
		run.setText("92500 Rueil Malmaison");
		run.addBreak();
		run.setText("+33 (1)47 08 98 38");
		run.addBreak();
		run.setText("contact@arkadia-pc.fr");
		run.addBreak();
		run.addBreak();
		run.setText("Agrément N°SAP524160330");	
		run.addBreak();
		run.setFontFamily("Helvetia");
		paragraph.setAlignment(ParagraphAlignment.LEFT);

		// ajouter Logo

		// header partie droite
		XWPFParagraph paragraph2 = document.createParagraph();
		XWPFRun run2 = paragraph2.createRun();
		run2.setText(" ");
		run2.addBreak();
		run2.setText("Adresse");
		run2.addBreak();
		run2.addBreak();
		run2.setText("Date");
		run2.setFontFamily("Helvetia");
		paragraph2.setAlignment(ParagraphAlignment.RIGHT);

		// titre 
		XWPFParagraph paragraph3 = document.createParagraph();
		XWPFRun run3 = paragraph3.createRun();
		run3.addBreak();
		run3.setText("Attestation destinée au Centre des Impôts");
		run3.setFontSize(18);
		run3.addBreak();
		run3.setFontFamily("Helvetia");
		run3.setUnderline(UnderlinePatterns.SINGLE);
		paragraph3.setAlignment(ParagraphAlignment.CENTER);

		// body
		XWPFParagraph paragraph4 = document.createParagraph();
		XWPFRun run4 = paragraph4.createRun();
		run4.addBreak();
		run4.addBreak();
		run4.setText("Je soussigné Monsieur Adelino ARAUJO, gérant de l'organisme agréé Arkadia PC, certifie que XXXX "
				+ "a bénéficié d'assistance informatique à domicile, service à la personne :");
		run4.addBreak();
		run4.addBreak();
		run4.setText("Montant total des factures de " + "date" + " : " + " montant" + " euros");
		run4.addBreak();
		run4.setText("Montant totalt payé en Cesu préfinancés : 0 euros");
		run4.addBreak();
		run4.addBreak();
		run4.setText("Intervenants : ");
		run4.addBreak();
		run4.addBreak();
		run4.setText("Adelino ARAUJO");
		run4.addBreak();
		run4.addBreak();
		run4.setText("Prestations :");
		run4.addBreak();
		run4.addBreak();
		run4.setText("Les sommes perçues pour financer les services à la personne sont à déduire de la valeur indiquée précédemment.");
		run4.addBreak();
		run4.addBreak();
		run4.setText("La déclaration engage la responsabilité du seul contribuable");
		run4.addBreak();
		run4.addBreak();
		run4.setText("* Pour les personnes utilisant le Chèque Emploi Service Universel, seul le montant financé personnellement est déductible. "
			+ "Une attestation est délivrée par les établissements qui préfinancent le CESU.");
		run4.addBreak();
		run4.addBreak();
		run4.addBreak();
		run4.setText("Fait pour valoir ce que de droit,");
		run4.addBreak();
		run4.addBreak();
		run4.addBreak();
		run4.addBreak(); 	
		run4.setText("Adelino ARAUJO, gérant.");
		run4.setFontFamily("Helvetia");
		paragraph4.setIndentationLeft(0);
		paragraph4.setIndentationHanging(100);
	}
	
	public void sauvegarde() {

		//
		// AJOUTER CLIC BOUTON CHOIX NOM DOCUMENT OU GENERATION AUTOMATIQUE
		//
		
		// sauvegarde du .doc dans le dossier cible
			try {
				FileOutputStream output = new FileOutputStream("C:\\Users\\Jean\\Desktop\\Projetstage1ereannee\\DocGenerator\\testDoc.docx");					
				document.write(output);
				output.close();
				System.out.println("SAVED.");
			} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}

	


