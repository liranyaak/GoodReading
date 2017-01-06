package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import Controllers.LogoutController;



public class main_gui {
	
	private mainFrame aFrame;
	
	public static void main( String args[] )
	   { 
	
	mainFrame aFrame  = new mainFrame(); // create StudentFrame
	 // aFrame.loadStudent(s1);
    aFrame.setSize( 450,450 ); // set frame size
    aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aFrame.setVisible( true ); // display frame
 // end main

	aFrame.addWindowListener(new WindowAdapter()
     {
         @Override
         public void windowClosing(WindowEvent e)
         {
        	 LogoutController logout=new LogoutController(aFrame.id);
             e.getWindow().dispose();
         }
     });


	//LogoutController logout=new LogoutController(aFrame.user.getId());
  }	

}
