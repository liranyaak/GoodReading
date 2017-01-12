package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import entity.Subject;

public class AddBookCatRangGui extends JPanel{
	
	public static JCheckBox chckbxNewCheckBox;
	public JPanel panel = new JPanel();
	public JButton BackButton;
	public JButton AddButton;
	public ArrayList<Subject> subjects = new ArrayList<Subject>();
	public AddBookCatRangGui() {
	

		setBackground(Color.WHITE);
		setLayout(null);
		
		
		
		JLabel label = new JLabel("Select Subject");
		label.setBounds(223, 28, 403, 43);
		label.setFont(new Font("Stencil", Font.PLAIN, 42));
		add(label);
		
		
		AddButton = new JButton("Add");
		AddButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		AddButton.setBounds(567, 568, 171, 41);
		add(AddButton);
		
		
		BackButton = new JButton("Back");
		BackButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		BackButton.setBounds(13, 568, 171, 41);
		add(BackButton);
	}
public void setSubjectsList(ArrayList<Subject> insubject){
		
	int j=0;
	for(int i=0; i< insubject.size(); i++ ){
	chckbxNewCheckBox = new JCheckBox();
	//String subject_name = myarr.get(i).getName();
	chckbxNewCheckBox.setText(insubject.get(i).getName());
	chckbxNewCheckBox.setBounds(62, 126+j, 113, 25);
	chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
	add(chckbxNewCheckBox);
	j+=30;
	}
	}
}

