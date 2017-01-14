package Controllers;
import entity.*;

import java.util.ArrayList;

public class WriteReviewController extends Main_con{
	volatile static boolean flag=true;
	private ArrayList<String> tmp;
	static int stage;
	public ArrayList<Book> books;
	public Book tmpBook;
	
	

	public WriteReviewController(String ID) /// change password and to user class
	{
		super();
		stage=0;
		tmp =new ArrayList<String>();
		tmpBook= new Book();
		int i;
		  ArrayList<String> bookList = new ArrayList<String>();
	        bookList.add("select"); 									//type of the query
	        bookList.add("purchase");    									//from
	        bookList.add("user_id="+ID);  // where 
	        client.handleMessageFromClientUI(bookList);
	       
	        while(flag)
	        {
	      	   
	        }
	       
	        
	          flag =true;
	          books= new ArrayList<Book>();


	          for(i=0;i<tmp.size();i++){
	        	bookList.clear();


	        	System.out.println("bookList:"+bookList);
	        	bookList.add("select"); 									//type of the query
	  	        bookList.add("book");    									//from
	  	        bookList.add("book_id="+tmp.get(i));  // where 
	  	        client.handleMessageFromClientUI(bookList);
	  	       stage++;
	  	      while(flag)
		        {
		      	   
		        }
	  	      flag =true;  
	          }
	          
	          
	          System.out.println("test  review book"+books.toString()); 
	       
	}
	public void display(Object message)
	{
		int i;
		System.out.println("test  review"+(((ArrayList<String>) message)));
		if(stage==0){
		
		for(i=2;i<(((ArrayList<String>) message).size());i=i+3)
			tmp.add((((ArrayList<String>) message).get(i)));
             
             System.out.println("test  review temp"+tmp);
            flag=false;
		}
		 


		 if(stage!=0){
		  tmpBook.clear();
		  tmpBook.setBookId(((ArrayList<String>) message).get(1));
		  tmpBook.setTitle(((ArrayList<String>) message).get(2));
		  tmpBook.setLanguage(Integer.valueOf(((ArrayList<String>) message).get(3)));
		  tmpBook.setSummery(((ArrayList<String>) message).get(4));


		  tmpBook.setCost(Float.parseFloat((((ArrayList<String>) message).get(5))));
		  tmpBook.setSearchCount(Integer.parseInt(((ArrayList<String>) message).get(6)));
		  tmpBook.setVisable(Boolean.parseBoolean(((ArrayList<String>) message).get(7)));
		  tmpBook.setPorcheseCount(Integer.parseInt(((ArrayList<String>) message).get(8)));
		  tmpBook.setTableOfContents(((ArrayList<String>) message).get(9));
		  books.add(new Book(tmpBook));
		  System.out.println("books"+books);
		  flag=false;


		}
		
		
		


		
		
	}
public ArrayList<Book> getBooksList(){
	
	return this.books;


}
}

