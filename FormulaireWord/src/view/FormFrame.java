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
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDayChooser;
import java.util.regex.*;


public class FormFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtAdresse;
	private JTextField txtFacture;
	private JTextField txtCodePostal;
	JLabel label;

	/**
	 * Creaation du frame
	 */
	public FormFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(47, 61, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prénom");
		lblPrenom.setBounds(47, 92, 46, 14);
		contentPane.add(lblPrenom);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(47, 122, 72, 14);
		contentPane.add(lblAdresse);
		
		JLabel lblFacture = new JLabel("Montant facture");
		lblFacture.setBounds(47, 185, 90, 14);
		contentPane.add(lblFacture);
		
		JLabel lblIdClient = new JLabel("Titre");
		lblIdClient.setBounds(47, 27, 46, 14);
		contentPane.add(lblIdClient);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(147, 58, 170, 20);
		contentPane.add(txtNom);
		txtNom.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((c == KeyEvent.VK_BACK_SPACE) ||
				(c == KeyEvent.VK_DELETE)) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		
		txtPrenom = new JTextField();
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(147, 89, 170, 20);
		contentPane.add(txtPrenom);
		
		txtAdresse = new JTextField();
		txtAdresse.setColumns(10);
		txtAdresse.setBounds(147, 120, 170, 20);
		contentPane.add(txtAdresse);
		
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
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnValider.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnValider.setBounds(364, 49, 130, 35);
		contentPane.add(btnValider);
		
		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEffacer.setBounds(364, 97, 130, 35);
		contentPane.add(btnEffacer);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnQuitter.setBounds(364, 311, 130, 35);
		contentPane.add(btnQuitter);
		
		JLabel lblNewLabel = new JLabel("Code postal / Ville");
		lblNewLabel.setBounds(47, 154, 90, 14);
		contentPane.add(lblNewLabel);
		
		txtCodePostal = new JTextField();
		txtCodePostal.setBounds(147, 151, 170, 20);
		contentPane.add(txtCodePostal);
		txtCodePostal.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Madame");
		rdbtnNewRadioButton.setBounds(146, 23, 93, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMonsieur = new JRadioButton("Monsieur");
		rdbtnMonsieur.setBounds(240, 23, 100, 23);
		contentPane.add(rdbtnMonsieur);
		
		JLabel lblNewLabel_1 = new JLabel("Date facture");
		lblNewLabel_1.setBounds(47, 217, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		JDayChooser dayChooser = new JDayChooser();
		dayChooser.setBounds(147, 213, 170, 133);
		contentPane.add(dayChooser);
	}
}
