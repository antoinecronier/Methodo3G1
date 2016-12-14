package calendrier;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JFrame;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.BorderLayout;
import javax.swing.JButton;



public class CalendrierReservation {
	private JFrame frame;
	private final JButton button = new JButton("Valider");
	JCalendar calendar;
	
	
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
	private void initialize() {
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
		//chooser.setVisible(false);
		chooser.getDateEditor().addPropertyChangeListener(
		    new PropertyChangeListener() {
				@Override
				public void propertyChange(PropertyChangeEvent arg0) {
					if ("date".equals(arg0.getPropertyName())) {
		                System.out.println(arg0.getPropertyName()
		                    + ": " + (Date) arg0.getNewValue());
		               
		              String datos = arg0.getPropertyName()
			                    + ": " + (Date) arg0.getNewValue();
//		                SimpleDateFormat fromUser = new SimpleDateFormat("dd/MM/yyyy");
//		                SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//		                try {
//
//		                    String reformattedStr = myFormat.format(fromUser.parse(inputString));
//		                } catch (ParseException e) {
//		                    e.printStackTrace();
//		                }
		         
		                
		            }
				}
		    });    
		calendar.add(chooser);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		System.out.println(datos);
			}
		});
		calendar.add(button, BorderLayout.SOUTH);
	}
}