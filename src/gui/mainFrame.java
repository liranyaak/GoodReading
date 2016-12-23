package gui;



import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainFrame extends JFrame {
	
	private Signin_gui signin_gui ;
    private Login_gui login_gui;
    private ReaderGui reader_gui;
	private EditorGui editor_gui;
    private LibrarianGui librarian_gui;
    private LibraryManagerGui libraryManager_gui;
	private SearchBookGui searchBookGui;
    private BookListToReviewGui bookListToReviewGui;
	private SearchBookResultGui searchBookResultGui; 
	private  BookDisplayGui bookDisplayGui;
	
	public mainFrame() {
		
		super();
		Checks check=new Checks();
		setSize(750,650);
		
		login_gui=new Login_gui();
		signin_gui=new Signin_gui();
		reader_gui=new ReaderGui("Reader");
		editor_gui=new EditorGui("Editor");
		librarian_gui=new LibrarianGui("Librarian");
		libraryManager_gui=new LibraryManagerGui("Library Manager");
		searchBookGui=new SearchBookGui();
		bookListToReviewGui=new BookListToReviewGui();
		searchBookResultGui=new SearchBookResultGui();
		bookDisplayGui =new BookDisplayGui();
		
		add(login_gui); // place the first panel in the frame 
		add(signin_gui);
		
		//add(reader_gui);
		//add(editor_gui);
		//add(librarian_gui);
		//add(libraryManager_gui);
		searchBookResultGui.setVisible(false);
		signin_gui.setVisible(false);
		//reader_gui.setVisible(false);
		//editor_gui.setVisible(false);
		//librarian_gui.setVisible(false);
		//libraryManager_gui.setVisible(false);
		
		setTitle("Good Reading");
	   
		/////// log in button////// 
		login_gui.loginButton.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
			
				if(check.checkInputLogin(login_gui))
				{
					setSize(new Dimension(750, 650));
					openPanelByjob("Reader"); 
			        // go to controller to check id and password
					// fanc. that open the correct window according the user
					
				}
				
			}
		});
		
		login_gui.singinButton.addActionListener(new ActionListener() 
		{
			
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				setSize(new Dimension(750, 650));
				login_gui.setVisible(false);
				signin_gui.setVisible(true);
			}
		} );	
		//////////////////////////
		
		//////// sign in button////////
		signin_gui.BackButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				//setContentPane(login_gui);
				setSize(new Dimension(450,450));
				signin_gui.setVisible(false);
				login_gui.setVisible(true);
			}
		});
		
		signin_gui.SendButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				check.checkInputSignin(signin_gui);
				
			}
		});
		///////////////////////////
		
		/////// reader  button////////
		reader_gui.btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				// change in db status of user
				setSize(new Dimension(450,450));
				login_gui.setVisible(true);
				reader_gui.setVisible(false);
				
			} 
		});
	
		reader_gui.btnBookSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(searchBookGui);
				reader_gui.setVisible(false);
				searchBookGui.setVisible(true);
				
			}
		} );

		reader_gui.btnWriteAReview.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(bookListToReviewGui);
				bookListToReviewGui.setVisible(true);
				reader_gui.setVisible(false);
			}
		});
		
		reader_gui.NotificationButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		/////////////////////////////
		
		///////////// Book Search ////////////
		searchBookGui.BackButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				reader_gui.setVisible(true);
				searchBookGui.setVisible(false);
			}
		});
		
		searchBookGui.SearchbtnNewButton.addActionListener(new ActionListener() {
		
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				
				if(check.check_serch_book(searchBookGui))
				{
					// go to db to search Book
					add(searchBookResultGui);
					searchBookResultGui.setVisible(true);
					searchBookGui.setVisible(false);
				}
			}
		});
        //////////////////////////////////////
		
        ///////////////write review///////////
		bookListToReviewGui.backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bookListToReviewGui.setVisible(false);
				reader_gui.setVisible(true);
				
			}
		});
	
		bookListToReviewGui.OKbtnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			    
			}
		});
	    ///////////////////////////////////////////
		
	    ////////////////search Book Result///////////
		searchBookResultGui.BackButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				searchBookResultGui.setVisible(false);
				searchBookGui.setVisible(true);
			}
		});
	
	    searchBookResultGui.OKButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(bookDisplayGui);
				bookDisplayGui.setVisible(true);
				searchBookResultGui.setVisible(false);
			}
		});
	   ///////////////////////////////////////////
	    
	   //////////////// Book Display ////////////
	    bookDisplayGui.BackButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				searchBookResultGui.setVisible(true);
				bookDisplayGui.setVisible(false);
			}
		} );
	}
	
	
	private void openPanelByjob(String job)
	{
		
		switch(job)
		{
		case "Reader":
		{
			add(reader_gui);
			reader_gui.setVisible(true);
			login_gui.setVisible(false);
		
		break;
		}
		case "Editor":
		{
			add(editor_gui);
			editor_gui.setVisible(true);
			login_gui.setVisible(false);
		break;	
		}
		case "Librarian":
		{   
			add(librarian_gui);
			librarian_gui.setVisible(true);
			login_gui.setVisible(false);
		break;
		}
		case "Library Manager":
		{
			add(libraryManager_gui);
			libraryManager_gui.setVisible(true);
			login_gui.setVisible(false);
		break;
		}
		default:
		{
			JOptionPane.showMessageDialog(null,"The ID or the PASSWORD are incorrct");
		}
		
		
		}
	}
	
}


