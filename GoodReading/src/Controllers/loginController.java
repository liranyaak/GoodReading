package Controllers;

import gui.main_gui;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Spring;
 


public class loginController implements ChatIF {
	
	
	private int id;
	private String password;
	public static ChatClient client = null;
	final public static int DEFAULT_PORT = 5555;
	 private   User user;
	volatile static boolean flag=true;
	static int port = 5555;
	String host="localhost";
	  
	public loginController(String ID,String Password ) /// change password and to user class
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

		user=new User();
	
	    ArrayList<String> login_input = new ArrayList<String>();
        login_input.add("select"); 									//type of the query
        login_input.add("users");    									//from
        login_input.add("where user_id="+ID+" and password="+Password);  // where 
       
        client.handleMessageFromClientUI(login_input);
      
       while(flag)
      {
    	   
      }
       
        
	}

	
	public void display(Object message)
	{
		System.out.println(((ArrayList<String>) message).toString());
		System.out.println(((ArrayList<String>) message).get(0));
		if(((ArrayList<String>) message).get(0).compareTo("1")==0)
		{
			
		user.setId(((ArrayList<String>) message).get(1));
		user.setFirstName(((ArrayList<String>) message).get(2));
		user.setLastName(((ArrayList<String>) message).get(3));
		user.setpass(((ArrayList<String>) message).get(4));
		user.setCreditCardNum(((ArrayList<String>) message).get(5));
		user.setStatus(((ArrayList<String>) message).get(6));
		user.setPrmission(((ArrayList<String>) message).get(8));
		}
		else
		{
			user.setPrmission("0");
			
		}
		
		System.out.println(user.toString());
		flag=false;
		
	}
	
	public User getUser()
	{
		return user;
		
	}
	

}
