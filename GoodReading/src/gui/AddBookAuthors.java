package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import Controllers.addBookController;
import entity.Author;
import entity.Subject;

public class AddBookAuthors extends JPanel{
	
	public static JCheckBox chckbxNewCheckBox;
	public ArrayList<Integer> authors_id;
	public static  ArrayList<JCheckBox> checkBoxes;

	public JPanel panel = new JPanel();
	public JButton BackButton;
	public JButton AddButton;
	public AddBookAuthors() {
	
	    checkBoxes = new ArrayList<JCheckBox>();

		setBackground(Color.WHITE);
		setLayout(null);
		
		
		
		JLabel label = new JLabel("Select Authors");
		label.setBounds(223, 28, 403, 43);
		label.setFont(new Font("Stencil", Font.PLAIN, 42));
		add(label);
		
		
		AddButton = new JButton("Add Book");
		AddButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		AddButton.setBounds(567, 568, 171, 41);
		add(AddButton);
		
		
		BackButton = new JButton("Back");
		BackButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		BackButton.setBounds(13, 568, 171, 41);
		add(BackButton);
	}
public void setAuthorsList(ArrayList<Author> authors){
		
	int j=0;
	for(int i=0; i< authors.size(); i++ ){
	chckbxNewCheckBox = new JCheckBox();
	//String subject_name = myarr.get(i).getName();
	chckbxNewCheckBox.setText(authors.get(i).getFullName());
	chckbxNewCheckBox.setBounds(62, 126+j, 113, 25);
	chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
	checkBoxes.add(chckbxNewCheckBox);
	add(chckbxNewCheckBox);
	j+=30;
	}
	}
}

