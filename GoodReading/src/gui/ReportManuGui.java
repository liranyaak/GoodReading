package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class ReportManuGui extends JPanel {
	public JButton btnReportByBook,btnReportByReader,btnBack;
	/**
	 * Create the panel.
	 */
	public ReportManuGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblReportManu = new JLabel("Report Manu");
		lblReportManu.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblReportManu.setBounds(216, 28, 322, 72);
		add(lblReportManu);
		
		btnReportByBook = new JButton("Report By Book");
		btnReportByBook.setBounds(90, 189, 571, 41);
		add(btnReportByBook);
		
		btnReportByReader = new JButton("Report By Reader");
		btnReportByReader.setBounds(90, 298, 571, 41);
		add(btnReportByReader);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(26, 581, 171, 41);
		add(btnBack);

	}
}
