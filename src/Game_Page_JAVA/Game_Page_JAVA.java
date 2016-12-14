package Game_Page_JAVA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Game_Page_JAVA {

	private JFrame frmBallsManager;
	private JTextField txtMonClub;
	private JTextField txtListJoueurs;
	private JTextField txtMatch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_Page_JAVA window = new Game_Page_JAVA();
					window.frmBallsManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game_Page_JAVA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBallsManager = new JFrame();
		frmBallsManager.getContentPane().setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		frmBallsManager.setTitle("Balls Manager");
		frmBallsManager.setBounds(100, 100, 910, 786);
		frmBallsManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBallsManager.getContentPane().setLayout(null);
		
		
		JPanel Icnpanel = new JPanel();
		Icnpanel.setBorder(null);
		Icnpanel.setBounds(10, 11, 350, 175);
	    ImageIcon pic = new ImageIcon("C:\\Users\\Yannick\\Eclipse\\Game_Page_JAVA\\src\\Images\\ball_manager.png");
	    Icnpanel.add(new JLabel(pic));
	    this.add(Icnpanel);
	    this.setVisible(true);
		frmBallsManager.getContentPane().add(Icnpanel);
		
		txtMonClub = new JTextField();
		txtMonClub.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonClub.setForeground(Color.BLACK);
		txtMonClub.setFont(new Font("Rockwell Condensed", Font.BOLD, 99));
		txtMonClub.setText("Mon Club");
		txtMonClub.setEditable(false);
		txtMonClub.setBounds(366, 42, 518, 124);
		frmBallsManager.getContentPane().add(txtMonClub);
		txtMonClub.setColumns(10);
		
		txtListJoueurs = new JTextField();
		txtListJoueurs.setHorizontalAlignment(SwingConstants.CENTER);
		txtListJoueurs.setEditable(false);
		txtListJoueurs.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		txtListJoueurs.setText("Joueurs");
		txtListJoueurs.setBounds(10, 197, 432, 65);
		frmBallsManager.getContentPane().add(txtListJoueurs);
		txtListJoueurs.setColumns(10);
		
		txtMatch = new JTextField();
		txtMatch.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		txtMatch.setHorizontalAlignment(SwingConstants.CENTER);
		txtMatch.setText("Match");
		txtMatch.setEditable(false);
		txtMatch.setBounds(452, 197, 432, 65);
		frmBallsManager.getContentPane().add(txtMatch);
		txtMatch.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 285, 432, 309);
		frmBallsManager.getContentPane().add(scrollPane);
		
		JButton btnEntrainement = new JButton("Entrainement");
		btnEntrainement.setFont(new Font("Rockwell Condensed", Font.PLAIN, 40));
		btnEntrainement.setBounds(10, 619, 267, 107);
		frmBallsManager.getContentPane().add(btnEntrainement);
		
		JButton btnJouer = new JButton("Jouer");
		btnJouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnJouer.setFont(new Font("Rockwell Condensed", Font.PLAIN, 40));
		btnJouer.setBounds(317, 619, 267, 107);
		frmBallsManager.getContentPane().add(btnJouer);
		
		JButton btnCalendrier = new JButton("Calendrier");
		btnCalendrier.setFont(new Font("Rockwell Condensed", Font.PLAIN, 40));
		btnCalendrier.setBounds(617, 619, 267, 107);
		frmBallsManager.getContentPane().add(btnCalendrier);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(452, 285, 432, 309);
		frmBallsManager.getContentPane().add(textArea);
	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void add(JPanel icnpanel) {
		// TODO Auto-generated method stub
		
	}
}
