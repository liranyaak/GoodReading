/* Sagi 7.1.17 */
package Controllers;

import entity.*;
import gui.AddBookAuthors;
import gui.AddBookCatRangGui;
import gui.mainFrame;
import gui.main_gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.Spring;

public class addBookController extends Main_con {
	volatile static boolean flag=true;
	static int stage;

	private Book book;
	private String book_id;
	public ArrayList<Subject> subjects;
	public ArrayList<Author> authors;
	public ArrayList<Language> languages;
	public ArrayList<Integer> subjects_id;
	public ArrayList<Integer> authors_id;
	public ArrayList<Range> range;
	private Subject tmpsubject;
	private Language tmplang;
	private Author tmpauthor;
	public String type;
	private Integer count;
	public addBookController(){
		
		super();
		stage=0;
		tmpsubject	= new Subject();
		tmplang		= new Language();
		tmpauthor		= new Author();
		subjects	= new ArrayList<Subject>();
		authors		= new ArrayList<Author>();
		languages	= new ArrayList<Language>();
		subjects_id	= new ArrayList<Integer>();
		authors_id	= new ArrayList<Integer>();
	}
	
//	public addBookController(){
	//	super();
		
	//	InsertBook(book);
	//	if(count > 0)
		//InsertAuthors(book.getBookId(),author_array list);
		//	on the book save author in array list, 
		//	send the array list to this method and insert to the tables
		
//	}
	
	public void display(Object message)
	{
		if(type.equals("language")){
			type	= "";

			for(int i=1; i <= Integer.valueOf( ((ArrayList<String>) message).get(0) ) *2 ; i=i+2 ){
				tmplang.setId(((ArrayList<String>) message).get(i));
				tmplang.setName(((ArrayList<String>) message).get(i+1));
				languages.add(new Language(tmplang));
			}
			

		}else if(type.equals("subjects")){
			for(int i=1; i <= Integer.valueOf( ((ArrayList<String>) message).get(0) ) *2 ; i=i+2 ){
				tmpsubject.setId(((ArrayList<String>) message).get(i));
				tmpsubject.setName(((ArrayList<String>) message).get(i+1));
				subjects.add(new Subject(tmpsubject));

			}
		}
		else if(type.equals("authors")){
			for(int i=1; i <= Integer.valueOf( ((ArrayList<String>) message).get(0) ) *3 ; i=i+3 ){
				tmpauthor.setId(((ArrayList<String>) message).get(i));
				tmpauthor.setFirstName(((ArrayList<String>) message).get(i+1));
				tmpauthor.setLastName(((ArrayList<String>) message).get(i+2));
				authors.add(new Author(tmpauthor));

			}
		}
		else if(type.equals("insert_book")){
			
			this.type = "insert_book_subject";
			this.book_id = Integer.toString((int)message);
			
		    String author_insert="";
  			//System.out.println(authors_id);

			ArrayList<String> addbook_input = new ArrayList<String>();
			addbook_input.add("insert"); 									//type of the query
		    addbook_input.add("author_book"); 									//type of the query
		    addbook_input.add("book_id,author_id"); 
		    for(int i=0; i<authors_id.size();i++){
			   
		   // System.out.println("THIS "+subjects_id.get(0));
			    if(author_insert.equals(""))
			    	author_insert="("+book_id+","+authors_id.get(0)+")";
			    else
			   		author_insert=author_insert+",("+book_id+","+authors_id.get(0)+")";
		    }
		    addbook_input.add(author_insert);
 			System.out.println("debug buttom");
		    System.out.println(authors_id.size());

		    client.handleMessageFromClientUI(addbook_input);
		   
		}
		
		else if(type.equals("insert_book_subject")){
			   System.out.println("here3");
				this.type = "insert_book_finished";
			    System.out.println(subjects_id.size());

			String book_insert="";
			ArrayList<String> addbook_input = new ArrayList<String>();
			addbook_input.add("insert"); 									//type of the query
		    addbook_input.add("book_subject"); 									//type of the query
		    addbook_input.add("book_id,subject_id"); 
		    for(int i=0; i<subjects_id.size();i++){
		    	if(book_insert.equals(""))
		    		book_insert="("+book_id+","+subjects_id.get(i)+")";
		    	else
		    		book_insert=book_insert+",("+book_id+","+subjects_id.get(i)+")";
		    }
		    addbook_input.add(book_insert);
		    System.out.println(book_insert);
		    System.out.println(subjects_id.size());
		    client.handleMessageFromClientUI(addbook_input);
 
		}
		else if(type.equals("insert_book_subject")){
		
		}
		
		
		flag=false;
		
	}
	
	
	public void getLangList(){
		this.type = "language";
	 ArrayList<String> addbook_input = new ArrayList<String>();
	    addbook_input.add("select"); 									//type of the query
	    addbook_input.add("language"); 
	    addbook_input.add("1=1");//from
	    //addbook_input.add("subject_id=1");  
     client.handleMessageFromClientUI(addbook_input);
     while(flag)
     {
   	   
     }
      flag=true;
	}
	public void getSubjectsList(){
		this.type = "subjects";
	 ArrayList<String> addbook_input = new ArrayList<String>();
	    addbook_input.add("select"); 									//type of the query
	    addbook_input.add("subject"); 
	    addbook_input.add("1=1");//from
	    //addbook_input.add("subject_id=1");  
     client.handleMessageFromClientUI(addbook_input);
     while(flag)
     {
   	   
     }
      flag=true;
	}
	public void getAuthorList(){
		this.type = "authors";
	 ArrayList<String> addbook_input = new ArrayList<String>();
	    addbook_input.add("select"); 									//type of the query
	    addbook_input.add("author"); 
	    addbook_input.add("1=1");//from
	    //addbook_input.add("subject_id=1");  
     client.handleMessageFromClientUI(addbook_input);
     while(flag)
     {
   	   
     }
      flag=true;
	}
	public void InsertBook(Book book){
		this.type = "insert_book";
	 ArrayList<String> addbook_input = new ArrayList<String>();
	    addbook_input.add("insert"); 									//type of the query
	    addbook_input.add("book"); 									//type of the query
	    addbook_input.add("title,language,TableOfContent,cost,summary"); 
	    addbook_input.add("('"+book.getTitle()+"','"+book.getLanguage()+"','"+book.getTableOfContents()+"','"+book.getCost()+"','"+book.getSummery()+"')");//from
	    //addbook_input.add("subject_id=1");  
     client.handleMessageFromClientUI(addbook_input);
     while(flag)
     {
   	   
     }
      flag=true;
}

public void getSelectedSubjects(ArrayList<Subject> subjects){
	for (JCheckBox checkBox : AddBookCatRangGui.checkBoxes)
	{
			if (checkBox.isSelected())
			{
				for(int i=0; i<subjects.size();i++)
					if((subjects.get(i).getName()).equals(checkBox.getText()))
						this.subjects_id.add(Integer.valueOf(subjects.get(i).getId()));
				//book.setSubjectsId(this.subjects_id);
			}
	}
}
public void getSelectedAuthors(ArrayList<Author> authors){
	for (JCheckBox checkBox : AddBookAuthors.checkBoxes)
	{
			if (checkBox.isSelected())
			{
				for(int i=0; i<authors.size();i++)
					if((authors.get(i).getFullName()).equals(checkBox.getText()))
						this.authors_id.add(Integer.valueOf(authors.get(i).getId()));
				
			}
			//book.setAuthorsId(authors_id);
	}
}

}

