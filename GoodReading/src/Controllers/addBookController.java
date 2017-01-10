/* Sagi 7.1.17 */
package Controllers;

import entity.*;
import gui.main_gui;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Spring;

public class addBookController extends Main_con {
	volatile static boolean flag=true;
	static int stage;

	private   Book book;
	public ArrayList<Subject> subjects;
	public ArrayList<Range> range;
	private Subject tmpsubject;
	public addBookController(Book book){
		
		super();
		stage=0;
		subjects	= new ArrayList<Subject>();
		tmpsubject	= new Subject();
	    ArrayList<String> addbook_input = new ArrayList<String>();
	    addbook_input.add("select"); 									//type of the query
	    addbook_input.add("subject"); 
	    addbook_input.add("1=1");//from
	    //addbook_input.add("subject_id=1");  
	    
        client.handleMessageFromClientUI(addbook_input);
	    stage++;
           
       while(flag)
      {
    	   
      }
       flag=true;
	}
	
	public addBookController(Book book2, ArrayList<Subject> subjects2) {
		super();

		// TODO Auto-generated constructor stub
		while(flag)
	    {
	    	   
	    }
	       flag=true;
	}
	
	public void display(Object message)
	{
		
			for(int i=1; i <= Integer.valueOf( ((ArrayList<String>) message).get(0) ) *2 ; i=i+2 ){
				tmpsubject.setId(((ArrayList<String>) message).get(i));
				tmpsubject.setName(((ArrayList<String>) message).get(i+1));
				subjects.add(new Subject(tmpsubject));

		}

	
		flag=false;
		
	}
	
	public ArrayList<Subject> getSubjectsList(){
		
		return this.subjects;
	}
}

