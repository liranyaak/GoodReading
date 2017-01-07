package Controllers;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class SinginController extends Main_con {
	
	volatile static boolean flag=true;
	private int flag_id_not_exist=0;
	private int flag_insert_seccess=0;
	private int stage=0;
	
	public SinginController(String ID,String Fname,String Lname,String pass, String email ,String credit, String membership)   
	{
		     super();
		    
		     ArrayList<String> login_input = new ArrayList<String>();
	        login_input.add("select"); 									//type of the query
	        login_input.add("users");    									//from
	        login_input.add("user_id="+ID);  // where 
	        client.handleMessageFromClientUI(login_input);
	        
	        while(flag)
	        {
	      	   
	        }
	         
	          flag =true;
	       stage++;
	        if(flag_id_not_exist==0)
	      	{    
	        	login_input.clear();
	            login_input.add("insert"); 		
	 	        login_input.add("users");    // table									
	 	        login_input.add("user_id,firstname,lastname,password,email,credit_card,log_in,permission,account_type,status_blocked");  //key
	 	        login_input.add("'"+ID+"','"+Fname+"','"+Lname+"','"+pass+"','"+email+"','"+credit+"','0','0','"+membership+"','0'"); //value
	 	        client.handleMessageFromClientUI(login_input);
	 	       while(flag)
		        {
		      	   
		        }
		         
		         flag =true;
	        	if(flag_insert_seccess>0)
	        		JOptionPane.showMessageDialog(null,"The requst is send to approval");
	    	    else
	    		    JOptionPane.showMessageDialog(null,"The requst don't sended please try again");
	        	
	        }
	        else
	        {
	        	JOptionPane.showMessageDialog(null,"The user is allready exist");
	        }
		
		
	}
	
	
	public void display(Object message)
	{
		if(stage==0 )
		{
		   flag_id_not_exist=Integer.parseInt(((ArrayList<String>) message).get(0));
		   flag=false;
		}
		if (stage==1)
		{
			flag_insert_seccess=((int)message);
			flag=false;
		}
	}
    

}
