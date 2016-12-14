package calendrier;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JFrame;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import javax.swing.JButton;

import database.DatabaseAccess;
import database.GenericDAO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CalendrierReservation {
	private JFrame frame;
	private final JButton button = new JButton("Valider");
	private JCalendar calendar;
	private Date selectedDate = new Date();
	private String ResultSet;
	private JTextField txtCliquDroite;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendrierReservation window = new CalendrierReservation();
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
	public CalendrierReservation() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calendar = new JCalendar();
		frame.getContentPane().add(calendar, BorderLayout.CENTER);
		JDateChooser chooser = new JDateChooser();
		chooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		// chooser.setVisible(false);
		chooser.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent arg0) {
				if ("date".equals(arg0.getPropertyName())) {
					System.out.println(arg0.getPropertyName() + ": " + (Date) arg0.getNewValue());
					selectedDate = (Date) arg0.getNewValue();
				}
			}
		});
		calendar.add(chooser);
		
		JButton btnRetour = new JButton("Retour");
		
		txtCliquDroite = new JTextField();
		txtCliquDroite.setText("Cliqu\u00E9 \u00E0 droite pour choisir une date de match");
		txtCliquDroite.setColumns(10);
		GroupLayout gl_chooser = new GroupLayout(chooser);
		gl_chooser.setHorizontalGroup(
			gl_chooser.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_chooser.createSequentialGroup()
					.addGroup(gl_chooser.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRetour)
						.addGroup(gl_chooser.createSequentialGroup()
							.addGap(113)
							.addComponent(txtCliquDroite, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chooser.getCalendarButton(), GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
		);
		gl_chooser.setVerticalGroup(
			gl_chooser.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_chooser.createSequentialGroup()
					.addGroup(gl_chooser.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_chooser.createParallelGroup(Alignment.LEADING)
							.addComponent(btnRetour, Alignment.TRAILING)
							.addComponent(chooser.getCalendarButton(), GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_chooser.createSequentialGroup()
							.addGap(12)
							.addComponent(txtCliquDroite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		chooser.setLayout(gl_chooser);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(selectedDate);
				SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
				String reformattedStr = myFormat.format(selectedDate);
				System.out.println(reformattedStr);
				
				//java.sql.ResultSet result = GenericDAO.executeUpdate("INSERT `Match` SET `date` = "+ reformattedStr ", `cli_id` = 22 WHERE `id` = 92;");
			}
		});
		calendar.add(button, BorderLayout.SOUTH);
	}
}