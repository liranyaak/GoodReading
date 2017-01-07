package Controllers;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import entity.*;

public class NewReviewContoller extends Main_con{

	
public NewReviewContoller(Book book,User user,String content){
	super();
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
	System.out.println(dateFormat.format(date));  
	
	ArrayList<String> NewReview = new ArrayList<String>();
	NewReview.add("insert"); 									//type of the query
	NewReview.add("reviews");    									//to
	NewReview.add("check_status,review_content,review_date,book_id,user_id");  // where
	NewReview.add("0,'"+content+"','"+dateFormat.format(date)+"','"+book.getBookId()+"','"+user.getId()+"'");
    client.handleMessageFromClientUI(NewReview);
}

}
