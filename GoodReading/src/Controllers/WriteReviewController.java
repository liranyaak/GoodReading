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
	        
	        System.out.println("okkkkkkkkkkkkkkkkkkkk");
	          flag =true;
	          books= new ArrayList<Book>();
	          for(i=0;i<tmp.size();i++){
	        	bookList.add("select"); 									//type of the query
	  	        bookList.add("book");    									//from
	  	        bookList.add("book_id="+tmp.get(i));  // where 
	  	        client.handleMessageFromClientUI(bookList);
	  	      while(flag)
		        {
		      	   
		        }
	  	      flag =true;  
	          }
	          
	          System.out.println("test  review book"+tmpBook); 
	        
	       
	}
	public void display(Object message)
	{
		int i;
		System.out.println("test  review"+(((ArrayList<String>) message)));
		if(stage==0){
		
		for(i=0;i<Integer.parseInt((((ArrayList<String>) message).get(0)));i++)
			tmp.add((((ArrayList<String>) message).get(2*i)));
             stage++;
             System.out.println("test  review temp"+tmp);
             flag=false;
		}
		 
		 if(stage==1){
		  tmpBook.setBookId(((ArrayList<String>) message).get(1));
		  tmpBook.setTitle(((ArrayList<String>) message).get(2));
		  tmpBook.setLanguage(((ArrayList<String>) message).get(3));
		  tmpBook.setSummery(((ArrayList<String>) message).get(4));
		  tmpBook.setCost(Float.parseFloat((((ArrayList<String>) message).get(5))));
		  tmpBook.setSearchCount(Integer.parseInt(((ArrayList<String>) message).get(6)));
		  tmpBook.setVisable(Boolean.parseBoolean(((ArrayList<String>) message).get(7)));
		  tmpBook.setPorcheseCount(Integer.parseInt(((ArrayList<String>) message).get(6)));
		  tmpBook.setTableOfContents(((ArrayList<String>) message).get(9));
		  books.add(tmpBook);
		}
		
		
		flag=false;
		/*System.out.println(((ArrayList<String>) message).toString());
		System.out.println(((ArrayList<String>) message).get(0));
		if(((ArrayList<String>) message).get(0).compareTo("1")==0)
		{
			
		user.setId(((ArrayList<String>) message).get(1));
		user.setFirstName(((ArrayList<String>) message).get(2));
		user.setLastName(((ArrayList<String>) message).get(3));
		user.setpass(((ArrayList<String>) message).get(4));
		user.setEmail(((ArrayList<String>) message).get(5));
		user.setCreditCardNum(((ArrayList<String>) message).get(6));
		user.setlogin(((ArrayList<String>) message).get(7));
		user.setPrmission(((ArrayList<String>) message).get(8));
		user.setaccout_type(((ArrayList<String>) message).get(9));
		user.setstatus_blocked(((ArrayList<String>) message).get(10));
		System.out.println("test"+user.toString());
		}
		else
		{
			user.setPrmission("0");
			
		}
		
		flag=false;*/
		
	}
public ArrayList<Book> getBooksList(){
	return books;
}
}
