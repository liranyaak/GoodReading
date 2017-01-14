


/*Shay made-3.1.17*/
package entity;

import java.util.ArrayList;

public class Book {
	String bookId;
	String title;
	int language;
	String tableOfContents;
	String summery;
	float cost;
	int searchCount;
	boolean visable;
	int porcheseCount;
	ArrayList<Integer> subjects_id;
	ArrayList<Integer> authors_id;
	
	public Book(String bookId, String title, int language ,
			String tableOfContents, float cost,String summery)
	{
		this.bookId=bookId;
		this.title=title;
		this.language=language;
		this.tableOfContents=tableOfContents;
		this.cost=cost;
		this.summery=summery;
	}
	public Book()
	{
		this.bookId=null;
		this.title=null;
		this.language=0;
		this.tableOfContents=null;
		this.cost=0;
		
	}
	public Book(Book b){
		this.bookId=b.getBookId();
		this.title=b.getTitle();
		this.language=b.getLanguage();
		this.tableOfContents=b.getTableOfContents();
		this.cost=b.getCost();
		this.summery=b.getSummery();
		this.searchCount=b.getSearchCount();
		this.visable=b.isVisable();
		this.porcheseCount=b.getPorcheseCount();
		
	}
	private void UpdateVisableStatus(boolean vis)
	{
		this.visable=vis;
	}
	private void EditBook()		//////////EDIT BOOK/////////////
	{
		
	}

	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		//this.bookId = bookId;
		System.out.println(bookId);
	}
	public ArrayList<Integer> getSubjectsId() {
		return subjects_id;
	}
	public void setSubjectsId(ArrayList<Integer> subjects_id) {
		this.subjects_id = subjects_id;
	}
	public ArrayList<Integer> getAuthorsId() {
		return authors_id;
	}
	public void setAuthorsId(ArrayList<Integer> authors_id) {
		this.authors_id = authors_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	public String getTableOfContents() {
		return tableOfContents;
	}
	public void setTableOfContents(String tableOfContents) {
		this.tableOfContents = tableOfContents;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getSearchCount() {
		return searchCount;
	}
	public void setSearchCount(int searchCount) {
		this.searchCount = searchCount;
	}
	public boolean isVisable() {
		return visable;
	}
	public void setVisable(boolean visable) {
		this.visable = visable;
	}
	public int getPorcheseCount() {
		return porcheseCount;
	}
	public void setPorcheseCount(int porcheseCount) {
		this.porcheseCount = porcheseCount;
	}
	public String getSummery() {
		return summery;
	}
	public void setSummery(String summery) {
		this.summery = summery;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", language="
				+ language + ", tableOfContents=" + tableOfContents + ", cost="
				+ cost +", summery= "+summery+ ", searchCount=" + searchCount + ", visable="
				+ visable + ", porcheseCount=" + porcheseCount + "]";
	}
	public void clear(){
		this.bookId=null;
		this.title=null;
		this.language=0;
		this.tableOfContents=null;
		this.cost=0;
		this.summery=null;
		this.searchCount=0;
		this.visable=true;
		this.porcheseCount=0;
	}
	
}



