package gui;

import java.io.IOException;

import javax.swing.JFrame;

import Controllers.ChatClient;
import Controllers.ChatIF;
import Controllers.ClientConsole;

public class main_gui implements ChatIF  {
	static int port = 5555;
	private int id;
	private String password;
	public static ChatClient client = null;
	final public static int DEFAULT_PORT = 5555;
	
	
	public main_gui(String host, int port){
		try 
	    {
	       client = new ChatClient(host, port, this);
	    } 
	    catch(IOException exception) 
	    {
	      System.out.println("Error: Can't setup connection!"
	                + " Terminating client.");
	      System.exit(1);
	    }
	}
	
	
	
	
	
	public static void main( String args[] )
	   { 
	
	    String host="localhost";
		main_gui chat= new main_gui(host, DEFAULT_PORT);

		
		
		
	mainFrame aFrame  = new mainFrame(); // create StudentFrame
	 // aFrame.loadStudent(s1);
    aFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    aFrame.setSize( 450,450 ); // set frame size
    aFrame.setVisible( true ); // display frame
} // end main
	public void display(String message) {
		// TODO Auto-generated method stub
		
	}
}

