package gui;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;

public class EditorGui extends ReaderGui{

	/**
	 * Create the panel.
	 */
	public EditorGui(String s) {
		super(s);
		setLayout(null);
		JButton btnNewButton = new JButton("Chack a Review");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton.setBounds(73, 254, 560, 30);
		add(btnNewButton);

	}

}
