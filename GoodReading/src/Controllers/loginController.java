package Controllers;

import entity.User;
import gui.main_gui;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Spring;
 


 
 
public class loginController extends Main_con {
	
	volatile static boolean flag=true;
	 private   User user;
	  
	public loginController(String ID,String Password ) /// change password and to user class
	{
		super();
		user=new User();
	
	    ArrayList<String> login_input = new ArrayList<String>();
        login_input.add("select"); 									//type of the query
        login_input.add("users");    									//from
        login_input.add("user_id="+ID+" and password='"+Password+"'");  // where 
        client.handleMessageFromClientUI(login_input);
       
           
       while(flag)
      {
    	   
      }
       
        flag =true;
        login_input.clear();
        login_input.add("update");
        login_input.add("users");
        login_input.add("log_in = 1");
        login_input.add("user_id = "+user.getId());
        System.out.println(login_input);
        client.handleMessageFromClientUI(login_input);
	}

	
	public void display(Object message)
	{
		//System.out.println(((ArrayList<String>) message).toString());
		//System.out.println(((ArrayList<String>) message).get(0));
		if(((ArrayList<String>) message).get(0).compareTo("1")==0)
		{
			
		user.setId(((ArrayList<String>) message).get(1));
		user.setFirstName(((ArrayList<String>) message).get(2));
		user.setLastName(((ArrayList<String>) message).get(3));
		user.setpass(((ArrayList<String>) message).get(4));
		user.setEmail(((ArrayList<String>) message).get(5));
		user.setCreditCardNum(((ArrayList<String>) message).get(6));
		user.setlogin(((ArrayList<String>) message).get(7));
		user.setPrmission(((ArrayList<String>) message).get(8));
		user.setaccout_type(((ArrayList<String>) message).get(9));
		user.setstatus_blocked(((ArrayList<String>) message).get(10));
		//System.out.println("test"+user.toString());
		}
		else
		{
			user.setPrmission("0");
			
		}
		
		flag=false;
		
	}
	
	public User getUser()
	{
		return user;
		
	}
	

}
