package Controllers;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import entity.*;
public class UncheckdReviewsListContoller extends Main_con{
	volatile static boolean flag=true;
	private Review tmpReview;
	private DateFormat format;
	private ArrayList<Review> reviews;
	public UncheckdReviewsListContoller(){
	super();
	reviews=new ArrayList<Review>();
	tmpReview= new Review();
	format = new SimpleDateFormat("yyyy-MM-dd");
	ArrayList<String> uncheckReviewList = new ArrayList<String>();
	uncheckReviewList.add("select"); 									//type of the query
	uncheckReviewList.add("reviews");    									//from
	uncheckReviewList.add("check_status=0");  // where 
    client.handleMessageFromClientUI(uncheckReviewList);
    while(flag)
    {
  	   
    }
    flag=true;
	}
	
	public void display(Object message)
	{
		int i;
		
		for(i=0;i<Integer.parseInt((((ArrayList<String>) message).get(0)))*6;i=i+6){
			System.out.println((((ArrayList<String>) message)));
			tmpReview.clear();
			tmpReview.setReviewId(((ArrayList<String>) message).get(i+1));
			tmpReview.setChackStatus(Boolean.parseBoolean(((ArrayList<String>) message).get(i+2)));
			tmpReview.setContentReview(((ArrayList<String>) message).get(3+i));
			try {
				tmpReview.setReviewDate(format.parse(((((ArrayList<String>) message).get(i+4)))));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    tmpReview.setBookid((((ArrayList<String>) message).get(i+5)));
			tmpReview.setUserID(((((ArrayList<String>) message).get(i+6))));
			System.out.println("review "+tmpReview);
			reviews.add(new Review(tmpReview));
		}
		
            flag=false;
	}
		
		
	
public ArrayList<Review> getReviewsList(){
	
	System.out.println("Reviews"+reviews);
	return this.reviews;
}
}
