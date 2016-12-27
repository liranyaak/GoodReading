package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class About_us extends JPanel{
	
	 public JButton btnBack;
	
	


	
	public About_us() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(329, 381, 89, 23);
		add(btnBack);
		
		JLabel lblAbout = new JLabel("about");
		lblAbout.setFont(new Font("Stencil", Font.PLAIN, 28));
		lblAbout.setBounds(170, 46, 113, 34);
		add(lblAbout);
		
		JLabel lblCreateBy = new JLabel("Created by:  ");
		lblCreateBy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCreateBy.setBounds(42, 114, 113, 23);
		add(lblCreateBy);
		
		JLabel lblGrupe = new JLabel("group 23");
		lblGrupe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGrupe.setBounds(170, 261, 89, 23);
		add(lblGrupe);
		
		JLabel lblOhadAtias = new JLabel("Ohad Atias");
		lblOhadAtias.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOhadAtias.setBounds(170, 136, 140, 23);
		add(lblOhadAtias);
		
		JLabel lblShayBiton = new JLabel("Shay Biton");
		lblShayBiton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblShayBiton.setBounds(170, 161, 113, 25);
		add(lblShayBiton);
		
		JLabel lblSagiCastro = new JLabel("Sagi Castro");
		lblSagiCastro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSagiCastro.setBounds(170, 186, 113, 23);
		add(lblSagiCastro);
		
		JLabel lblDanielPeri = new JLabel("Daniel Peri");
		lblDanielPeri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanielPeri.setBounds(170, 211, 128, 25);
		add(lblDanielPeri);
		
		JLabel lblLiranYahakobay = new JLabel("Liran Yahakobay");
		lblLiranYahakobay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLiranYahakobay.setBounds(170, 236, 159, 23);
		add(lblLiranYahakobay);
	}
}
