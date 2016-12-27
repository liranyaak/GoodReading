package Controllers;

import gui.main_gui;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Spring;
 


public class loginController{
	
	private String id;
	private String password;
	
	public loginController(String ID,String Password ) /// change password and to user class
	{
	     // login_input.add()
       // client.handleMessageFromClientUI(input);
	    ArrayList<String> login_input = new ArrayList<String>();
        login_input.add("select"); 									//type of the query
        login_input.add("users");    									//from
        login_input.add("where user_id="+ID+" and password="+Password);  // where 
        //login_input.add(user);
        main_gui.client.handleMessageFromClientUI(login_input);
		//clientconsole=new ;

	}
	public int login_controler(int id,String password)
	{
		int job=0;
		
		
		
		
		
		return job ;
		
	}


}
