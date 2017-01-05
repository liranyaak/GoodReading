/*Shay made-3.1.17*/
package check1;

import java.util.Date;


public class Review {

	String reviewId;
	boolean chackStatus;
	Date reviewDate;
	String contentReview;
	
	public Review (String contentReview)
	{
		/*this.reviewId=null;
		this.chackStatus=false;
		this.reviewDate=null;*/
		this.contentReview=contentReview;
	}
	public Review ()
	{
		this.reviewId=null;
		this.chackStatus=false;
		this.reviewDate=null;
		this.contentReview=null;
	}
	public void updateCheckStatus (boolean chackStatus)
	{
		this.chackStatus=chackStatus;
	}
	public void updateContent()
	{
		this.contentReview="TO FILL!!!!";
	}
	public String getReviewId() {
		return reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public boolean isChackStatus() {
		return chackStatus;
	}
	public void setChackStatus(boolean chackStatus) {
		this.chackStatus = chackStatus;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	public String getContentReview() {
		return contentReview;
	}
	public void setContentReview(String contentReview) {
		this.contentReview = contentReview;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", chackStatus=" + chackStatus
				+ ", reviewDate=" + reviewDate + ", contentReview="
				+ contentReview + "]";
	}
	
}