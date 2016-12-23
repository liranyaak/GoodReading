package gui;

import javax.swing.JOptionPane;





public class Checks
{
	/**
	 * check the input in the login gui
	 * @param login_gui
	 * @return false-input invalid ,else-true
	 */
	public boolean checkInputLogin(Login_gui login_gui)
	{
		int flag=0;
		String str="INVALID INPUT:\n";
		if(!(check_Srt_only_num(login_gui.IDtextPane.getText())))
		{
			str+=" #ID\n";
			flag=1;
		}
		if(!(check_Str_not_null(login_gui.passwordField.getText())))
		{
			str+=" #PASSWORD\n";
			flag=1;
			
		}
		if(flag==1)
		{
			 JOptionPane.showMessageDialog(null,str);
			 return false;
		}
		else
			return true;
	}

	/**
	 * check the input in the singin gui
	 * @param singin_gui
	 * @return false-input invalid ,else-true
	 */
	
	public boolean checkInputSignin(Signin_gui singin_gui)
	{
		String str="INVALID INPUT:\n";
		int flag=0;
		if(!(check_Srt_only_num(singin_gui.IDtextPane.getText())))
		{
			str+="# ID\n";
			flag=1;
		}
		if(!(check_Srt_only_letters(singin_gui.F_MANEtextPane.getText())))
		{
			str+="# FIRST NAME\n";
			flag=1;
		}
		if(!(check_Srt_only_letters(singin_gui.L_NAMEtextPane.getText())))
		{
			str+="# LAST NAME\n";
			flag=1;
		}
		if(!(check_Str_not_null(singin_gui.PASStextPane.getText())))
		{
			str+="# PASSWORD\n";
			flag=1;
		}
		if(!(check_Str_not_null(singin_gui.EMAILtextPane.getText())))
		{
			str+="# EMAIL\n";
			flag=1;
		}
		if(!(check_Srt_only_num(singin_gui.CARDtextPane.getText())))
		{
			str+="# CREDIT CARD\n";
			flag=1;
		}
		
		if(flag==1)
		{
			 JOptionPane.showMessageDialog(null,str);
			 return false;
		}
		else
			return true;
		
	}
	
	/**
	 * check if the string counting only numbers and not NULL
	 * @param str
	 * @return true-if the string contain only number and not null else-false
	 
	 */
	public boolean check_serch_book(SearchBookGui searchBookGui)
	{
	
		if(!(check_Str_not_null(searchBookGui.TitletextPane.getText())||check_Str_not_null(searchBookGui.SubjecttextPane.getText())||check_Str_not_null(searchBookGui.AutortextPane.getText())||check_Str_not_null(searchBookGui.RangetextPane.getText())||check_Str_not_null(searchBookGui.KeyWordstextPane.getText())))
		{
			
			JOptionPane.showMessageDialog(null,"All fields are empty");
			return false;
		}
		  return true;
		
		
	}

	
	
	public boolean check_Srt_only_num(String str) 
	{
		if (str.matches("[0-9]+")&& str.length()>0)
		{
			return true;
		}
		
		return false;
	
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public boolean check_Str_not_null(String str)
	{
		if (str.length()>0)
		{
			return true;
		}
		return false;
	
	}
	
	public boolean check_Srt_only_letters(String str)
	{
		if (str.matches("[a-zA-Z]+")&& str.length()>0)
		{
			return true;
		}
		return false;
     }
	
	
	
	
}
