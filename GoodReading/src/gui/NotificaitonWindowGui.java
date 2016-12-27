package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;

public class NotificaitonWindowGui extends JPanel {
	private JTable table;
    public JButton btnBack;
 
	/**
	 * Create the panel.
	 */
	public NotificaitonWindowGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		JLabel lblNotificaitons = new JLabel("Notificaitons");
		lblNotificaitons.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblNotificaitons.setBounds(224, 28, 315, 64);
		add(lblNotificaitons);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(91, 130, 556, 333);
		add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(table);
	
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBack.setBounds(278, 521, 178, 50);
		add(btnBack);

	}
}
