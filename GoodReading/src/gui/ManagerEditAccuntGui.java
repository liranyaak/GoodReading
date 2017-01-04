package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class ManagerEditAccuntGui extends EditAccuntGui{
	JButton btnBlockunblock;
	/**
	 * Create the panel.
	 */
	public ManagerEditAccuntGui() {
		
		btnBlockunblock = new JButton("Block/Unblock");
		btnBlockunblock.setBackground(Color.RED);
		btnBlockunblock.setBounds(502, 23, 203, 41);
		add(btnBlockunblock);

	}

}
