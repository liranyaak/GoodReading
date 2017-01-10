package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;

public class AddBookCatRangGui extends JPanel{
	
	public JCheckBox chckbxNewCheckBox;
	
	public AddBookCatRangGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(61, 57, 113, 25);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		add(chckbxNewCheckBox);
		
		JLabel label = new JLabel("Select Subject");
		label.setBounds(223, 28, 403, 43);
		label.setFont(new Font("Stencil", Font.PLAIN, 42));
		add(label);
	}

}


