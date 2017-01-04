package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianBookDisplayGui extends BookDisplayGui {
	JButton btnSave,btnDelete;
	/**
	 * Create the panel.
	 */
	public LibrarianBookDisplayGui() {
		textPaneBookName.setLocation(228, 81);
		setBackground(Color.WHITE);
		textPaneBookName.setEditable(true);
		textPaneAuters.setEditable(true);
		textPaneSubjectName.setEditable(true);
		textPaneRangeName.setEditable(true);
		textAreaTableOfContent.setEditable(true);
		ReadReviewButton.setLocation(382, 568);
		textPaneLanguage.setEditable(true);
		textAreaSummery.setEditable(true);
		
		btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnSave.setBounds(203, 568, 171, 41);
		add(btnSave);
		
		btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setBackground(Color.RED);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnDelete.setBounds(567, 12, 171, 41);
		add(btnDelete);

	}
}
