package Controllers;
import java.util.ArrayList;

import entity.*;
public class ReviewDetailsContoller extends Main_con{
	private ArrayList<String>  FullName;
	private ArrayList<String>  Title;
	volatile static boolean flag=true;
	private ArrayList<String> detials;
	private int N;
	private int stage;
	public ReviewDetailsContoller(ArrayList<Review> reviews){
		super();
		int i;
		stage=0;
		N=reviews.size();
		FullName= new ArrayList<String>();
		Title=new ArrayList<String>();
		detials =new ArrayList<String>();
		for(i=0;i<N;i++){
		ArrayList<String> fullName = new ArrayList<String>();
		fullName.add("select"); 									//type of the query
		fullName.add("users");    									//from
		fullName.add("user_id="+reviews.get(i).getUserId());  // where 
		stage++;
	    client.handleMessageFromClientUI(fullName);
	    
	    while(flag)
        {
      	   
        }
	      flag =true;  
		}
		for(i=0;i<N;i++){
			ArrayList<String> title = new ArrayList<String>();
			title.add("select"); 									//type of the query
			title.add("book");    									//from
			title.add("book_id="+reviews.get(i).getBookId());  // where 
			stage++;
		    client.handleMessageFromClientUI(title);
		    while(flag)
	        {
	      	   
	        }
		      flag =true;  
			}
		for(i=0;i<N;i++){
			detials.add(FullName.get(i));
			detials.add(Title.get(i));
		}
		
	
	}
	public void display(Object message)
	{
		
		
		if(stage<=N){
		FullName.add((((ArrayList<String>) message).get(2))+" "+(((ArrayList<String>) message).get(3)));
		flag=false;
		}
		 

		else{
		  Title.add(((((ArrayList<String>) message).get(2))));
		  flag=false;
		}
		
		
		

		
		
	}
public ArrayList<String> getDetials(){
	
	return this.detials;

}
}


