package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;

public class ReviewToCheckGui extends JPanel {
	public JButton btnOk,btnBack;
    public JList Reviewlist ;
	/**
	 * Create the panel.
	 */
	public ReviewToCheckGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Uncheckd Reviews");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblNewLabel.setBounds(160, 28, 434, 53);
		add(lblNewLabel);
		
		btnOk = new JButton("Ok");
	    btnOk.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnOk.setBounds(473, 563, 171, 41);
		add(btnOk);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnBack.setBounds(86, 563, 171, 41);
		add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(147, 103, 470, 439);
		add(scrollPane);
		
        Reviewlist = new JList();
		scrollPane.setViewportView(Reviewlist);

	}
}
