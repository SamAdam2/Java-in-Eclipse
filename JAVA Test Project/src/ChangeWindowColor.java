package de.glamazon.g1.gui;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HowToChangeContent {

	private JFrame frame;
	private JPanel one = new JPanel();
	private JPanel two = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HowToChangeContent window = new HowToChangeContent();
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
	public HowToChangeContent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		one.setBackground(Color.GREEN);
		two.setBackground(Color.BLUE);
		
		frame.setContentPane(one);
		
		JButton btnOneButton = new JButton("Change to Two");
		btnOneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(two);
				frame.repaint();
				frame.revalidate();
			}
		});
		one.add(btnOneButton);
		
		
		JButton btnTwoButton = new JButton("Change to One");
		btnTwoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(one);
				frame.repaint();
				frame.revalidate();
			}
		});
		two.add(btnTwoButton);
	}

}
