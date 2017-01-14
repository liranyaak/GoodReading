package Controllers;
import java.util.ArrayList;
import java.sql.*;

import entity.*;

import java.util.ArrayList;

public class SearchBookController extends Main_con  {
	
	public ArrayList<Book> search_book;
	private Book tmpbook;
	volatile static boolean flag=true;
	public String input="";
	public SearchBookController(String title, String author,String subject,String range,String keyword)
	{
		super();
		search_book = new ArrayList<Book>();
		tmpbook = new Book();
		ArrayList<String> search_input = new ArrayList<String>();
        search_input.add("select_var");
        search_input.add("distinct");
        search_input.add("book.book_id,book.title");
        search_input.add("book inner join author_book on book.book_id=author_book.book_id"
    	+" inner join  author on author.author_id=author_book.author_id" 
        +" inner join book_subject on book_subject.book_id=book.book_id"
        +" inner join subject on subject.subject_id=book_subject.subject_id"
        +" inner join range_subject on range_subject.subject_id=book_subject.subject_id" 
        +" inner join rang on range_subject.range_id =rang.range_id ");
      
        if(title.compareToIgnoreCase("")!=0)
        {
        	
        	input=input+"book.title LIKE '%"+title+"%'";
        }
        if(author.compareToIgnoreCase("")!=0)
        {
        	if(input.compareTo("")==0)
        	{
        		input=input+"author.name LIKE '%"+author+"%'";
        	}
        	else input=input+"OR author.name LIKE '%"+author+"%'";
        }
        if(subject.compareToIgnoreCase("")!=0)
        {
        	if(input.compareTo("")==0)
        	{
        		input=input+"book_subject.subject LIKE '%"+subject+"%'";
        	}
        	else input=input+"OR book_subject.subject LIKE '%"+subject+"%'";
        }
        if(range.compareToIgnoreCase("")!=0)
        {
        	if(input.compareTo("")==0)
        	{
        		input=input+"range.range_name LIKE '%"+range+"%'";
        	}
        	else input=input+"OR range.range_name LIKE '%"+range+"%'";
        }
        if(keyword.compareToIgnoreCase("")!=0)
        {
        	if(input.compareTo("")==0)
        	{
        		input=input+"book.summary LIKE '%"+keyword+"%'";
        	}
        	else input=input+"OR book.summary LIKE '%"+keyword+"%'";
        }
        input=input+" AND book.visiable>0";
		search_input.add(input);
		client.handleMessageFromClientUI(search_input);
		while(flag)
		{
			
		}
		flag=true;
	
	}
	
	public void display(Object message)
	{
	
			for(int i=1; i <= Integer.valueOf( ((ArrayList<String>) message).get(0) ) *2 ; i=i+2 ){
				
				tmpbook.setBookId(((ArrayList<String>) message).get(i));
				tmpbook.setTitle(((ArrayList<String>) message).get(i+1));
				System.out.println("i=:"+i);
				search_book.add(new Book(tmpbook));
			}
				
				flag=false;
	}
	public ArrayList<Book> getBooksList(){
		
		return this.search_book;

	}
}//end class