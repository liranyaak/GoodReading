package Controllers;

import java.util.ArrayList;

public class LogoutController extends Main_con 
{
	
	public LogoutController(String ID)
	{
	 ArrayList<String> login_input = new ArrayList<String>();	
	 login_input.add("update");
     login_input.add("users");
     login_input.add("log_in = 0");
     login_input.add("user_id = "+ID);
     System.out.println(login_input);
     client.handleMessageFromClientUI(login_input);
	}

}
