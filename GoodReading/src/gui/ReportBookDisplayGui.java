package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class ReportBookDisplayGui extends JPanel {
	
	public JButton BackButton;
	public JButton GetReportButton;
	public JTextPane textPaneBookName,textPaneAuters,textPaneSubjectName,textPaneCost,textPaneRangeName,textPaneLanguage;
	public JTextArea textAreaTableOfContent,textAreaSummery;
	public JLabel lblFirstTitle; 

	/**
	 * Create the panel.
	 */
	public ReportBookDisplayGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		String s =new String();
		lblFirstTitle = new JLabel("Book Info Card");
		lblFirstTitle.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblFirstTitle.setBounds(206, 14, 349, 51);
		add(lblFirstTitle);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitle.setBounds(13, 80, 72, 33);
		add(lblTitle);
		textPaneBookName = new JTextPane(/*b.getName*/);
		textPaneBookName.setBackground(Color.LIGHT_GRAY);
		textPaneBookName.setEditable(false);
		textPaneBookName.setBounds(228, 80, 468, 33);
		add(textPaneBookName);
		
		JLabel lblAuthers = new JLabel("Authers:");
		lblAuthers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAuthers.setBounds(13, 123, 115, 33);
		add(lblAuthers);
		
	    textPaneAuters = new JTextPane(/*b.getAuthers*/);
		textPaneAuters.setBackground(Color.LIGHT_GRAY);
		textPaneAuters.setEditable(false);
		textPaneAuters.setBounds(228, 123, 468, 33);
		add(textPaneAuters);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSubject.setBounds(13, 166, 115, 33);
		add(lblSubject);
		
		textPaneSubjectName = new JTextPane(/*b.getSubject*/);
		textPaneSubjectName.setBackground(Color.LIGHT_GRAY);
		textPaneSubjectName.setEditable(false);
		textPaneSubjectName.setBounds(228, 166, 468, 33);
		add(textPaneSubjectName);
		
		JLabel lblRange = new JLabel("Range:");
		lblRange.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRange.setBounds(13, 209, 115, 33);
		add(lblRange);
		
		textPaneRangeName = new JTextPane(/*b.getRange*/);
		textPaneRangeName.setBackground(Color.LIGHT_GRAY);
		textPaneRangeName.setEditable(false);
		textPaneRangeName.setBounds(228, 209, 468, 33);
		add(textPaneRangeName);
		
		JLabel lblLanguage = new JLabel("Language:");
		lblLanguage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLanguage.setBounds(13, 252, 152, 33);
		add(lblLanguage);
		
		textPaneLanguage = new JTextPane(/*b.getLanguage*/);
		textPaneLanguage.setBackground(Color.LIGHT_GRAY);
		textPaneLanguage.setEditable(false);
		textPaneLanguage.setBounds(228, 252, 468, 33);
		add(textPaneLanguage);
		
		JLabel lblTableOfContext = new JLabel("Table Of Content:");
		lblTableOfContext.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTableOfContext.setBounds(13, 295, 223, 33);
		add(lblTableOfContext);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(228, 295, 468, 85);
		add(scrollPane_1);
		
		textAreaTableOfContent = new JTextArea(/*b.getTableOfContent*/);
		textAreaTableOfContent.setEditable(false);
		scrollPane_1.setViewportView(textAreaTableOfContent);
		textAreaTableOfContent.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblSummery = new JLabel("Summery:");
		lblSummery.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSummery.setBounds(13, 390, 152, 33);
		add(lblSummery);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(228, 391, 468, 85);
		add(scrollPane);
		
		textAreaSummery = new JTextArea(/*b.getSummery*/);
		scrollPane.setViewportView(textAreaSummery);
		textAreaSummery.setBackground(Color.LIGHT_GRAY);
		textAreaSummery.setEditable(false);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCost.setBounds(13, 480, 115, 33);
		add(lblCost);
		
		textPaneCost = new JTextPane(/*b.getCost*/);
		textPaneCost.setBackground(Color.LIGHT_GRAY);
		textPaneCost.setBounds(228, 480, 125, 33);
		add(textPaneCost);
		
		GetReportButton = new JButton("Get Report");
		GetReportButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		GetReportButton.setBounds(567, 568, 171, 41);
		add(GetReportButton);
		
	    
		
		BackButton = new JButton("Back");
		BackButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		BackButton.setBounds(13, 568, 171, 41);
		add(BackButton);

	}

}
