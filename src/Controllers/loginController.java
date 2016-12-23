package Controllers;

import java.io.IOException;
 


public class loginController {
	
	
	private int id;
	private String password;
	private ClientConsole clientconsole;
	
	public loginController(int ID,String Password )
	{
		
		try 
	    {
	      ChatClient client = new ChatClient(host, port, this);
	    } 
	    catch(IOException exception) 
	    {
	      System.out.println("Error: Can't setup connection!"
	                + " Terminating client.");
	      System.exit(1);
	    }
		
		
		id=ID;
		password=Password;
		//clientconsole=new ;
	}
	
	public int login_controler(int id,String password)
	{
		int job=0;
		
		
		
		
		
		return job ;
		
	}

}
