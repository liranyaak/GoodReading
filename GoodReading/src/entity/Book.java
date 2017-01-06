/*Shay made-3.1.17*/
package entity;

public class Book {
	String bookId;
	String title;
	String language;
	String tableOfContents;
	float cost;
	int searchCount;
	boolean visable;
	int porcheseCount;
	String Summery;
	
	public Book(String bookId, String title, String language ,
			String tableOfContents, float cost)
	{
		this.bookId=bookId;
		this.title=title;
		this.language=language;
		this.tableOfContents=tableOfContents;
		this.cost=cost;
	}
	public Book()
	{
		this.bookId=null;
		this.title=null;
		this.language=null;
		this.tableOfContents=null;
		this.cost=0;
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
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLanguage() {
		return language;
	}
	public String getSummery() {
		return Summery;
	}
	public void setLanguage(String language) {
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
	
	public void setsummery(String Summery) 
	{
		this.Summery=Summery;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", language="
				+ language + ", tableOfContents=" + tableOfContents + ", cost="
				+ cost + ", searchCount=" + searchCount + ", visable="
				+ visable + ", porcheseCount=" + porcheseCount + "]";
	}
	
	
}
