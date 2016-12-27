package gui;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;

public class EditorGui extends ReaderGui{
	public JButton btnCheckReview;
	/**
	 * Create the panel.
	 */
	public EditorGui(String s) {
		super(s);
		setLayout(null);
		btnCheckReview = new JButton("Check a Review");
		btnCheckReview.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnCheckReview.setBounds(73, 254, 560, 30);
		add(btnCheckReview);

	}

}
