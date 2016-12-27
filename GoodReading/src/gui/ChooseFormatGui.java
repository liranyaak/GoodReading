package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class ChooseFormatGui extends JPanel {
	public JButton btnOk;
	public JComboBox comboBoxFormat;
	/**
	 * Create the panel.
	 */
	public ChooseFormatGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		String[] options={"PDF","DOC","FB2"};
		JLabel lblNewLabel = new JLabel("Format ");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblNewLabel.setBounds(287, 28, 175, 54);
		add(lblNewLabel);
		
		JLabel lblPleaseChooseBook = new JLabel("Please Choose Book Format");
		lblPleaseChooseBook.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPleaseChooseBook.setBounds(57, 126, 348, 54);
		add(lblPleaseChooseBook);
		
		comboBoxFormat = new JComboBox(options);
		comboBoxFormat.setBounds(53, 204, 432, 54);
		add(comboBoxFormat);
		
		btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOk.setBounds(273, 505, 184, 60);
		add(btnOk);

	}
}
