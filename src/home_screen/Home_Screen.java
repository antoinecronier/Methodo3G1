package home_screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Home_Screen {

	private JFrame frame;
	private final JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
	private JTextField txtBallsManager;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Screen window = new Home_Screen();
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
	public Home_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.frame = new JFrame();
		this.frame.setTitle("Background Color for JFrame");
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("PLAY");
		btnNewButton.setFont(new Font("Rockwell Condensed", Font.BOLD, 35));
		btnNewButton.setBounds(87, 254, 189, 101);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOGIN\r\n");
		btnNewButton_1.setFont(new Font("Rockwell Condensed", Font.BOLD, 35));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(319, 408, 175, 115);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("GIVE UP");
		btnNewButton_2.setFont(new Font("Rockwell Condensed", Font.BOLD, 35));
		btnNewButton_2.setBounds(553, 574, 189, 101);
		frame.getContentPane().add(btnNewButton_2);
		
		txtBallsManager = new JTextField();
		txtBallsManager.setEditable(false);
		txtBallsManager.setFont(new Font("Rockwell Condensed", Font.BOLD, 60));
		txtBallsManager.setText("BALLS MANAGER");
		txtBallsManager.setBorder(null);
		txtBallsManager.setBounds(157, 41, 434, 60);
		frame.getContentPane().add(txtBallsManager);
		txtBallsManager.setColumns(10);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setEditable(false);
		textField.setFont(new Font("Rockwell Condensed", textField.getFont().getStyle() | Font.BOLD, 55));
		textField.setText("2017");
		textField.setBounds(611, 42, 110, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	}
}
