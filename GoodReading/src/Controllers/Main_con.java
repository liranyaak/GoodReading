package Controllers;

import java.io.IOException;

public class Main_con implements ChatIF {

	public static ChatClient client = null;
	final public static int DEFAULT_PORT = 5555;	
	static int port = 5555;
	String host="localhost";
	
	
	public Main_con()
	{
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
	
	
	
	@Override
	public void display(Object message) {
		// TODO Auto-generated method stub
		
	}
	
	

}
