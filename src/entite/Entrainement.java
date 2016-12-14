package entite;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;


public class Entrainement {
	
	private String[] listeEntrainement = {"attaque", "defense", "milieu", "gardien"};
	private String[] listeEquipe = {"equipe1", "equipe2", "equipe3"};//recuperer nom equipe dans database
	
	private JFrame frame;
	private final JComboBox<String> Equipe = new JComboBox<>(listeEquipe);
	private final JComboBox<String> Entrainement = new JComboBox<>(listeEntrainement);
	private final JPanel panel = new JPanel();
	private final JLabel lblEquipe = new JLabel("Equipe");
	private final JLabel lblEntrainement = new JLabel("Entrainement");
	private final JButton btnValider = new JButton("Valider");
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_3 = new JPanel();
	private final JTextArea txtrRsultat = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrainement window = new Entrainement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Entrainement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{63, 0, 32, 63, 64, 64, 65, 0};
		gbl_panel.rowHeights = new int[]{23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		GridBagConstraints gbc_lblEquipe = new GridBagConstraints();
		gbc_lblEquipe.insets = new Insets(0, 0, 0, 5);
		gbc_lblEquipe.gridx = 1;
		gbc_lblEquipe.gridy = 0;
		panel.add(lblEquipe, gbc_lblEquipe);
		GridBagConstraints gbc_Equipe = new GridBagConstraints();
		gbc_Equipe.insets = new Insets(0, 0, 0, 5);
		gbc_Equipe.gridx = 2;
		gbc_Equipe.gridy = 0;
		panel.add(Equipe, gbc_Equipe);
		
		GridBagConstraints gbc_lblEntrainement = new GridBagConstraints();
		gbc_lblEntrainement.anchor = GridBagConstraints.WEST;
		gbc_lblEntrainement.insets = new Insets(0, 0, 0, 5);
		gbc_lblEntrainement.gridx = 4;
		gbc_lblEntrainement.gridy = 0;
		panel.add(lblEntrainement, gbc_lblEntrainement);
		GridBagConstraints gbc_Entrainement = new GridBagConstraints();
		gbc_Entrainement.anchor = GridBagConstraints.WEST;
		gbc_Entrainement.insets = new Insets(0, 0, 0, 5);
		gbc_Entrainement.gridx = 5;
		gbc_Entrainement.gridy = 0;
		panel.add(Entrainement, gbc_Entrainement);
		Entrainement.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			}
		});
		
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		panel_2.add(panel_1, BorderLayout.NORTH);
		panel_1.add(btnValider);
		
		panel_2.add(panel_3, BorderLayout.CENTER);
		txtrRsultat.setEditable(false);
		txtrRsultat.setText("R\u00E9sultat\nle resultat de l entrainement");
		
		panel_3.add(txtrRsultat);
	}

}
