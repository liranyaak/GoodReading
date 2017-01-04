package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class ManagerBookDisplayGui extends LibrarianBookDisplayGui {
	public JButton btnHideunhide;

	/**
	 * Create the panel.
	 */
	public ManagerBookDisplayGui() {
		lblFirstTitle.setLocation(209, 14);
		
		btnHideunhide = new JButton("Hide/Unhide");
		btnHideunhide.setForeground(Color.WHITE);
		btnHideunhide.setBackground(Color.BLUE);
		btnHideunhide.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnHideunhide.setBounds(0, 18, 197, 41);
		add(btnHideunhide);

	}

}
