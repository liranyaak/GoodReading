package Controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;

public class mysqlConnection {

	public Connection conn;

	public mysqlConnection(){
		try
	    {
	      Class.forName("com.mysql.jdbc.Driver").newInstance();
	    }
	    catch (Exception localException) {}
	    try
	    {
	      this.conn = DriverManager.getConnection("jdbc:mysql://mysql5006.smarterasp.net/db_a1588d_pro", "a1588d_pro", "braudebraude2016");
	      
	      System.out.println("SQL connection succeed");
	    }
	    catch (SQLException ex)
	    {
	      System.out.println("SQLException: " + ex.getMessage());
	      System.out.println("SQLState: " + ex.getSQLState());
	      System.out.println("VendorError: " + ex.getErrorCode());
	    }
	}

public static ArrayList<String> select(String table,String where, Connection con){
	ArrayList<String> result = new ArrayList<String>();
	try 
	{
	 Statement stmt = con.createStatement();
	 ResultSet rs;
	 String query = "SELECT * FROM "+table+" "+where+";";
	 
	 rs = stmt.executeQuery(query);
	 ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
	 int colums = rsmd.getColumnCount();
    // System.out.println(colums);

	 try {
		 rs.last();
	    
		 int totalRows = rs.getRow();
	        rs.beforeFirst();
	        result.add(String.valueOf(totalRows));
		 if(totalRows>0)
		 {
			 while(rs.next()){
				 for( int i =1;i<=colums;i++ )
				 {
				result.add(rs.getString(i));
				 }	
			 }
		 }
		 else
			 System.out.println("not found");
	 }
	 
	    catch(Exception ex)  {}
	 rs.close();
	}
	catch (SQLException e) {e.printStackTrace();}
	return result;
	}

public static void update(String table,String id,String department, Connection con){
	try
    {
      PreparedStatement pstmt = con.prepareStatement("UPDATE "+table+" SET department=? WHERE id=?");
      pstmt.setString(1, department);
      pstmt.setString(2, id);
      pstmt.executeUpdate();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
	}

public static Object PrintMenu(){
	String result = "Welcome to HR system\nPlease one choose options:\nPress 1 to show all the workders details\nPress 2 to set a new detpartment for workder\n";
	return result;
	}
}