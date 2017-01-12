/*Shay made-3.1.17*/
package entity;

import java.util.Date;


public class Review {

	String reviewId;
	boolean chackStatus;
	Date reviewDate;
	String contentReview;
	String userId;
	String bookId;
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
		this.bookId=null;
		this.userId=null;
	}
	public Review(Review review){
		this.reviewId=review.getReviewId();
		this.chackStatus=review.getChackStatus();
		this.reviewDate=review.getReviewDate();
		this.contentReview=review.getContentReview();
		this.bookId=review.bookId;
		this.userId=review.getUserId();
	}
	
	public String getReviewId() {
		return reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public boolean getChackStatus() {
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
	public String getUserId() {
		return userId;
	}
	public void setUserID(String userId) {
		this.userId = userId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookid(String bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", chackStatus=" + chackStatus
				+ ", reviewDate=" + reviewDate + ", contentReview="
				+ contentReview + "]";
	}
	public void clear(){
		this.reviewId=null;
		this.chackStatus=false;
		this.reviewDate=null;
		this.contentReview=null;
		this.bookId=null;
		this.userId=null;
		
	}
	
}