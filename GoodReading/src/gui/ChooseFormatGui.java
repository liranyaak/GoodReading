package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ChooseFormatGui extends JPanel {
	public JButton btnOk;
	public JComboBox comboBoxFormat;
	/**
	 * Create the panel.
	 */
	public ChooseFormatGui() {
		setLayout(null);
		String[] options={"PDF","DOC","FB2"};
		JLabel lblNewLabel = new JLabel("Format ");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblNewLabel.setBounds(287, 28, 175, 54);
		add(lblNewLabel);
		
		JLabel lblPleaseChooseBook = new JLabel("Please Choose Book Format");
		lblPleaseChooseBook.setBounds(224, 127, 348, 54);
		add(lblPleaseChooseBook);
		
		comboBoxFormat = new JComboBox(options);
		comboBoxFormat.setBounds(181, 209, 432, 54);
		add(comboBoxFormat);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(287, 523, 171, 41);
		add(btnOk);

	}
}
