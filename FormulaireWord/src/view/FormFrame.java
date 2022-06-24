package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;

import model.Doc;


public class FormFrame extends JFrame {

	/**
	 * propriétés de FormFrame 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtAdresse;
	private JTextField txtVille;
	private JTextField txtFacture;
	private Doc doc;
	
	
	/**
	 * clic sur le bouton valider
	 * récupération des données présentes dans le Frame
	 * initialisation du document avec les données 
	 */
	public void valider() {
		// constructeur 
		this.doc = new Doc(null);
		// importation des données renseignées
		String nom = txtNom.getText();
		String prenom = txtPrenom.getText();
		// lecture des données renseignées
		System.out.println(nom + " " + prenom);
		// exportation des données renseignées vers le Doc
		
		// initialisation de la sauvegarde
		doc.sauvegarde();
	}
	
	/**
	 * clic sur le bouton effacer
	 * réinitialisation des champs
	 */
	public void effacer() {
		txtNom.setText("");
		txtPrenom.setText("");
		txtAdresse.setText("");
		txtVille.setText("");
		txtFacture.setText("");	
	}
	
	/**
	 * clic sur le bouton quitter
	 */
	public void quitter() {
		System.exit(0);
	}
	
	/**
	 * Creation du frame
	 */
	public FormFrame() {

		
		// initialisation du JPanel
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// boutons Titre + label
		JRadioButton rdbtnMadame = new JRadioButton("Madame");
		rdbtnMadame.setBounds(146, 23, 93, 23);
		contentPane.add(rdbtnMadame);
		
		JRadioButton rdbtnMonsieur = new JRadioButton("Monsieur");
		rdbtnMonsieur.setBounds(240, 23, 100, 23);
		contentPane.add(rdbtnMonsieur);
		
		JLabel lblIdClient = new JLabel("Titre");
		lblIdClient.setBounds(47, 27, 46, 14);
		contentPane.add(lblIdClient);
			
		
		// JTextField + label nom
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(47, 61, 46, 14);
		contentPane.add(lblNom);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(147, 58, 170, 20);
		contentPane.add(txtNom);
		
		
		// JTextField + label prénom
		JLabel lblPrenom = new JLabel("Prénom");
		lblPrenom.setBounds(47, 92, 46, 14);
		contentPane.add(lblPrenom);
		
		txtPrenom = new JTextField();
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(147, 89, 170, 20);
		contentPane.add(txtPrenom);
	
		
		// JTextField + label adresse
		txtAdresse = new JTextField();
		txtAdresse.setColumns(10);
		txtAdresse.setBounds(147, 120, 170, 20);
		contentPane.add(txtAdresse);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(47, 122, 72, 14);
		contentPane.add(lblAdresse);
		

		// JTextField + label ville
		txtVille = new JTextField();
		txtVille.setBounds(147, 151, 170, 20);
		contentPane.add(txtVille);
		txtVille.setColumns(10);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(47, 154, 90, 14);
		contentPane.add(lblVille);
		
		
		// JTexteField + label facture & devise
		txtFacture = new JTextField();
		txtFacture.setColumns(10);
		txtFacture.setBounds(147, 182, 170, 20);
		contentPane.add(txtFacture);
		txtFacture.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) ||
				(c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		JLabel lblFacture = new JLabel("Montant facture");
		lblFacture.setBounds(47, 185, 90, 14);
		contentPane.add(lblFacture);
		
		JLabel devise = new JLabel("€");
		devise.setFont(new Font("Tahoma", Font.PLAIN, 13));
		devise.setBounds(327, 184, 14, 14);
		contentPane.add(devise);
		
		
		// JDateChooser + label date
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(147, 213, 170, 20);
		contentPane.add(dateChooser);
	
		JLabel datefacture = new JLabel("Date facture");
		datefacture.setBounds(47, 217, 72, 14);
		contentPane.add(datefacture);
		
		
		// bouton valider
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valider();				
			}
		});
		btnEnregistrer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEnregistrer.setBounds(364, 49, 130, 35);
		contentPane.add(btnEnregistrer);
		
		
		// bouton effacer
		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				effacer();
			}
		});
		btnEffacer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEffacer.setBounds(364, 97, 130, 35);
		contentPane.add(btnEffacer);
		
		
		// bouton quitter
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitter();
			}
		});
		btnQuitter.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnQuitter.setBounds(364, 205, 130, 35);
		contentPane.add(btnQuitter);
				
	}
}
