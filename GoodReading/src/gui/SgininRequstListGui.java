package gui;

import javax.swing.JPanel;
import java.awt.Color;

public class SgininRequstListGui extends PaymentRequestListGui {

	/**
	 * Create the panel.
	 */
	public SgininRequstListGui() {
		listRequst.setBackground(Color.LIGHT_GRAY);
		setBackground(Color.WHITE);
		lblFirstTitle.setBounds(163, 28, 394, 61);
		lblFirstTitle.setText("Sgin-In Request");

	}

}
