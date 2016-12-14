package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ListModel;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import database.dao.AttributDAO;
import entite.Attribut;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class CRUDAttribut {

	private JFrame frame;
	private JTextField txtAttributs;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDAttribut window = new CRUDAttribut();
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
	public CRUDAttribut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtAttributs = new JTextField();
		txtAttributs.setHorizontalAlignment(SwingConstants.CENTER);
		txtAttributs.setText("ATTRIBUTS");
		txtAttributs.setColumns(10);
		
		JButton btnNewButton = new JButton("Supprime");
		
		AttributDAO attDAO = new AttributDAO();
		
		JList<Attribut> list = new JList(attDAO.SelectAll().toArray());
		
		JScrollBar scrollBar = new JScrollBar();
		
		JButton btnNewButton_1 = new JButton("OK");
		
		JTextPane txtpnModifierAttribut = new JTextPane();
		txtpnModifierAttribut.setText("Modifier Attribut:");
		
		JTextPane txtpnAjouterJoueur = new JTextPane();
		txtpnAjouterJoueur.setText("Ajouter Attribut:");
		
		JButton btnNewButton_2 = new JButton("OK");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(txtAttributs, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(47)
							.addComponent(btnNewButton_1))
						.addComponent(txtpnAjouterJoueur, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
					.addGap(197)
					.addComponent(btnNewButton))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(btnNewButton_2))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnModifierAttribut, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtAttributs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(list, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(txtpnAjouterJoueur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(13)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton_1))))))
					.addGap(18)
					.addComponent(txtpnModifierAttribut, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2))
					.addGap(59))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
