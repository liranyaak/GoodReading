package gui;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

import Controllers.ChatClient;
import Controllers.ChatIF;
import Controllers.ClientConsole;
import Controllers.EchoServer;

public  class main_gui  {
	
	public static void main( String args[] )
	   { 		

	mainFrame aFrame  = new mainFrame(); // create StudentFrame
	 // aFrame.loadStudent(s1);
    aFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    aFrame.setSize( 450,450 ); // set frame size
    aFrame.setVisible( true ); // display frame
} // end main
}
