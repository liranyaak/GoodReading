package gui;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddBookGui extends JPanel {

	public JButton BackButton;
	public JButton NextButton_category;
	public JComboBox comboBox;
	public DefaultComboBoxModel model;

	public JTextPane textPaneBookName,textPaneSubjectName,textPaneCost,textPaneRangeName;
	public JTextArea textAreaTableOfContent,textAreaSummery;


	/**
	 * Create the panel.
	 */
	public AddBookGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblAddNewBook = new JLabel("Add New Book");
		lblAddNewBook.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblAddNewBook.setBounds(223, 28, 320, 43);
		add(lblAddNewBook);
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitle.setBounds(13, 80, 72, 33);
		add(lblTitle);
		textPaneBookName = new JTextPane(/*b.getName*/);
		textPaneBookName.setBackground(Color.LIGHT_GRAY);
		textPaneBookName.setBounds(228, 80, 468, 33);
		add(textPaneBookName);
		
		comboBox = new JComboBox();
		model = new DefaultComboBoxModel();
		comboBox.setModel(model);
		comboBox.setBounds(228, 125, 223, 33);
		add(comboBox);
		
		JLabel lblLanguage = new JLabel("Language:");
		lblLanguage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLanguage.setBounds(13, 125, 152, 33);
		add(lblLanguage);
		
		JLabel lblTableOfContext = new JLabel("Table Of Content:");
		lblTableOfContext.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTableOfContext.setBounds(13, 170, 223, 33);
		add(lblTableOfContext);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(228, 170, 468, 85);
		add(scrollPane_1);
		
		textAreaTableOfContent = new JTextArea(/*b.getTableOfContent*/);
		scrollPane_1.setViewportView(textAreaTableOfContent);
		textAreaTableOfContent.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblSummery = new JLabel("Summery:");
		lblSummery.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSummery.setBounds(13, 270, 152, 33);
		add(lblSummery);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(228, 270, 468, 85);
		add(scrollPane);
		
		textAreaSummery = new JTextArea(/*b.getSummery*/);
		scrollPane.setViewportView(textAreaSummery);
		textAreaSummery.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCost.setBounds(13, 370, 115, 33);
		add(lblCost);
		
		textPaneCost = new JTextPane(/*b.getCost*/);
		textPaneCost.setBackground(Color.LIGHT_GRAY);
		textPaneCost.setBounds(228, 370, 125, 33);
		add(textPaneCost);
		
		NextButton_category = new JButton("Next");
		NextButton_category.setFont(new Font("Tahoma", Font.PLAIN, 23));
		NextButton_category.setBounds(567, 568, 171, 41);
		add(NextButton_category);
		
		
		BackButton = new JButton("Back");
		BackButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		BackButton.setBounds(13, 568, 171, 41);
		add(BackButton);
		
		

		

	}
}
