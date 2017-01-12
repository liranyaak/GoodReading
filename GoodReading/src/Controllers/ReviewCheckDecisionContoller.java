package Controllers;
import java.util.ArrayList;

import entity.*;
public class ReviewCheckDecisionContoller extends Main_con{
	
	public ReviewCheckDecisionContoller(Boolean decision,Review review){
		super();
		ArrayList<String> Decision = new ArrayList<String>();
		if(decision){
			Decision.clear();
			Decision.add("update");
			Decision.add("reviews");
			Decision.add("check_status = '1',review_content = '"+review.getContentReview()+"'");
			Decision.add("review_id = "+review.getReviewId());
	        client.handleMessageFromClientUI(Decision);

		}
		else{
			Decision.clear();
			Decision.add("delete");
			Decision.add("reviews");
			Decision.add("review_id");
			Decision.add(review.getReviewId());
	        client.handleMessageFromClientUI(Decision);
		}
	
	}

}
