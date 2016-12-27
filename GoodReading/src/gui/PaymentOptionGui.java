package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class PaymentOptionGui extends JPanel {
	public JComboBox comboBoxPay;
	JButton btnOk,btnBack;
	/**
	 * Create the panel.
	 */
	public PaymentOptionGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		String[] options = { "Monthly Mambership", "Yearly Mambership", "Reguler Pay"};
		JLabel lblPayment = new JLabel("Payment");
		lblPayment.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblPayment.setBounds(260, 28, 214, 43);
		add(lblPayment);
		
		JLabel lblNewLabel = new JLabel("Please Pick Payment Method");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(26, 80, 356, 33);
		add(lblNewLabel);
		
		comboBoxPay = new JComboBox(options);
		comboBoxPay.setBounds(26, 151, 391, 43);
		add(comboBoxPay);
		
		btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOk.setBounds(533, 518, 172, 53);
		add(btnOk);
		
	    btnBack = new JButton("Back");
	    btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(26, 518, 178, 54);
		add(btnBack);

	}
}
