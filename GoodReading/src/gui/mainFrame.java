package gui;
import entity.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;


















import Controllers.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class mainFrame extends JFrame {
    private User user;
    private Book book;
    private ArrayList<Language> languages;
    private ArrayList<Book> books;
	public ArrayList<Subject> subjects;
	public ArrayList<Author> authors;
    private ArrayList<Review> reviews;
    private List<String> lang_combovalues;
    private int selection=-1;

    public String id="0";
    private String bookId;/////////////////////////for checking//////////////////
    private ArrayList<String> detials ;
	private Signin_gui signin_gui ;
    private Login_gui login_gui;
    private ReaderGui reader_gui;
	private EditorGui editor_gui;
    private LibrarianGui librarian_gui;
    private LibraryManagerGui libraryManager_gui;
	private SearchBookGui searchBookGui;
    private BookListToReviewGui bookListToReviewGui;
	private SearchBookResultGui searchBookResultGui; 
	private BookDisplayGui bookDisplayGui;
	private NotificaitonWindowGui notificaitonWindowGui;
	private ReviwsForBookListGui reviewsForBookList;
	private ReviewDisplayGui reviewDisplayGui;
	private PaymentOptionGui paymentOptionsGui;
	private ChooseFormatGui chooseFormatGui;
	private WriteReviewGui writeReviewGui;
	private ReviewToCheckGui reviewToCheackGui;
	private ReviewCheackingGui reviewCheckingGui;
	private LibrarianBookDisplayGui librarianBookDisplayGui;
	private AddBookGui addBookGui;
	private PaymentRequestListGui paymantRequstListGui;
	private PaymentRequstDisplayGui paymentRequstDisplayGui;
	private SgininRequstListGui sgininRequsrtListGui;
	private SginInRequestDisplayGui sgininRequstDisplayGui;
	private AddAccuntGui addAccuntGui;
	private SearchAccuntGui searchAccuntGui;
	private EditAccuntGui editAccuntGui;
	private ManagerBookDisplayGui managerBookDisplayGui;
	private ManagerEditAccuntGui managerEditAccuntGui;
	private ReportManuGui reportManuGui;
	private ReportSearchBookGui reportSearchBookGui;
	private ReportSearchAccuntGui reportSearchAccuntGui;
	private ReportDisplayReaderGui reportDisplayReaderGui;
	private SearchBookResultGui reportSearchBookResultGui;
	private ReportBookDisplayGui reportBookDisplayGui;
	private AddBookCatRangGui addBookCatRangGui;
	private AddBookAuthors addBookAuthors;
	private About_us about_us;
	private int permmision=0;
	public mainFrame() {
		
		super();
		user=new User();
		books=new ArrayList<Book>();
		subjects=new ArrayList<Subject>();
		authors=new ArrayList<Author>();
		
		Checks check=new Checks();
		setSize(750,650);
		///////////status represnet 1-reader,2-editor,3-librerian,4-libarary mananger
		boolean mambership=false;///////////////////////////////////////////////////////for cheacking
		login_gui=new Login_gui();
		signin_gui=new Signin_gui();
		about_us=new About_us();
		reader_gui=new ReaderGui("Reader");
		editor_gui=new EditorGui("Editor");
		librarian_gui=new LibrarianGui("Librarian");
		libraryManager_gui=new LibraryManagerGui("Library Manager");
		searchBookGui=new SearchBookGui();
		bookListToReviewGui=new BookListToReviewGui();
		searchBookResultGui=new SearchBookResultGui();
		bookDisplayGui =new BookDisplayGui();
		notificaitonWindowGui=new NotificaitonWindowGui();
		reviewsForBookList = new ReviwsForBookListGui();
		reviewDisplayGui = new ReviewDisplayGui();
		paymentOptionsGui = new PaymentOptionGui();
		chooseFormatGui =new ChooseFormatGui();
		writeReviewGui=new WriteReviewGui();
		reviewToCheackGui= new ReviewToCheckGui();
		reviewCheckingGui =new ReviewCheackingGui();
		librarianBookDisplayGui= new LibrarianBookDisplayGui();
		addBookGui = new AddBookGui();
		paymantRequstListGui=new PaymentRequestListGui();
		paymentRequstDisplayGui= new PaymentRequstDisplayGui();
	    sgininRequsrtListGui =new SgininRequstListGui();
	    sgininRequstDisplayGui=new SginInRequestDisplayGui();
	    addAccuntGui= new AddAccuntGui();
	    searchAccuntGui=new SearchAccuntGui();
	    editAccuntGui=new EditAccuntGui();
	    managerBookDisplayGui=new ManagerBookDisplayGui();
	    managerEditAccuntGui=new ManagerEditAccuntGui();
	    reportManuGui=new ReportManuGui();
	    reportSearchBookGui= new ReportSearchBookGui();
	    reportSearchAccuntGui= new ReportSearchAccuntGui();
	    reportDisplayReaderGui=new ReportDisplayReaderGui();
	    reportSearchBookResultGui=new SearchBookResultGui();
	    reportBookDisplayGui=new ReportBookDisplayGui();
	    addBookCatRangGui=new AddBookCatRangGui();
	    addBookAuthors=new AddBookAuthors();
		add(login_gui); // place the first panel in the frame 
		add(signin_gui);
		
		
		searchBookResultGui.setVisible(false);
		signin_gui.setVisible(false);

		
		setTitle("Good Reading");
	   
		
		/////////////////////////////////////reader//////////////////////////////////
		
		/////// log in button////// 
		login_gui.loginButton.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
			
				if(check.checkInputLogin(login_gui))
				{
					loginController login_con=new loginController(login_gui.IDtextPane.getText(), login_gui.passwordField.getText());
					permmision=Integer.parseInt(login_con.getUser().getPrmission());
					copyUser(login_con.getUser());
					openPanelByjob();
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
		
		login_gui.btnAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(about_us);
				about_us.setVisible(true);
				login_gui.setVisible(false);
				
			}
		});
		
		//////////////////////////
		
		////////////////About us///////////////////
		
		about_us.btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				about_us.setVisible(false);
				login_gui.setVisible(true);
			}
		});
		//////////////////////////////////////////////
		
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
				LogoutController logoutController=new LogoutController(user.getId());
				login_gui.IDtextPane.setText("");
				login_gui.passwordField.setText("");
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
				WriteReviewController writeReviewContoller=new WriteReviewController(user.getId());
				books=writeReviewContoller.getBooksList();
				if(books.size()==0)
					JOptionPane.showMessageDialog(null,"You Dont Have Books To review");
				else{
				add(bookListToReviewGui);
				bookListToReviewGui.setVisible(true);
				reader_gui.setVisible(false);
				DefaultListModel<String> model = new DefaultListModel<>();
				bookListToReviewGui.BookList.setModel(model);
				for(int i=0;i<books.size();i++)model.addElement(books.get(i).getTitle());
				}
				
			
			}
		});
		reader_gui.NotificationButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(notificaitonWindowGui);
				notificaitonWindowGui.setVisible(true);
				reader_gui.setVisible(false);
				
			}
		});
		notificaitonWindowGui.btnBack.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				notificaitonWindowGui.setVisible(false);
				if(permmision==1){
				add(reader_gui);
				reader_gui.setVisible(true);}
				else if(permmision==2){
					add(editor_gui);
					editor_gui.setVisible(true);}
				else if(permmision==3){
					add(librarian_gui);
					librarian_gui.setVisible(true);}
				else{
					add(libraryManager_gui);
					libraryManager_gui.setVisible(true);
				}
				}
				
		});
		
			
		
		/////////////////////////////
		
		///////////// Book Search ////////////
		searchBookGui.BackButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(permmision==1)reader_gui.setVisible(true);
				else if(permmision==2)editor_gui.setVisible(true);
				else if(permmision==3)librarian_gui.setVisible(true);
				else libraryManager_gui.setVisible(true);
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
				if(permmision==1)reader_gui.setVisible(true);
				else if(permmision==2)editor_gui.setVisible(true);
				else if(permmision==3)librarian_gui.setVisible(true);
				else libraryManager_gui.setVisible(true);
				
			}
		});
	
		bookListToReviewGui.OKbtnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selection=-1;
				bookListToReviewGui.BookList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				selection=bookListToReviewGui.BookList.getSelectedIndex();
				if(selection!=-1){
				// System.out.println("the choosen one "+books.get(selection));
				add(writeReviewGui);
				writeReviewGui.textAreaReview.setText("");
				writeReviewGui.setVisible(true);
				bookListToReviewGui.setVisible(false);
				}
			    
			}
		});
	    writeReviewGui.btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(bookListToReviewGui);
				writeReviewGui.setVisible(false);
				bookListToReviewGui.setVisible(true);
				
			    
			}
		});
        writeReviewGui.btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(writeReviewGui.textAreaReview.getText().equals("")){
					JOptionPane.showMessageDialog(null,"You MUST enter a review");
				}
				else{	
				NewReviewContoller newReviewcontoller=new NewReviewContoller(books.get(selection),user,writeReviewGui.textAreaReview.getText());
				JOptionPane.showMessageDialog(null,"The review sent for checking!");
				writeReviewGui.setVisible(false);
				if(permmision==1)reader_gui.setVisible(true);
				else if(permmision==2)editor_gui.setVisible(true);
				else if(permmision==3)librarian_gui.setVisible(true);
				else libraryManager_gui.setVisible(true);
				}
			    
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
				/////////////////////////////////////////////////////////////////////////
				if((permmision==1)||(permmision==2)){
				add(bookDisplayGui);
				bookDisplayGui.setVisible(true);
				}
				else if(permmision==3){
					add(librarianBookDisplayGui);
					librarianBookDisplayGui.setVisible(true);
				}
				else{
					add(managerBookDisplayGui);
					managerBookDisplayGui.setVisible(true);
				}
				searchBookResultGui.setVisible(false);
				
			}
		});
	    bookDisplayGui.ReadReviewButton.addActionListener(new ActionListener(){
	    	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	    		bookId=new String("2");///////////for checking///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    		ReviewsForBookListContoller reviewsForBookListContoller=new ReviewsForBookListContoller(bookId);
	    		reviews=reviewsForBookListContoller.getReviewsList();
	    		if(reviews.isEmpty())JOptionPane.showMessageDialog(null,"There is NO reviews for this book!!");
	    	  	else{
	    	  		 
	    	  		 DefaultListModel<String> model = new DefaultListModel<>();
	    	  		 reviewsForBookList.listReview.setModel(model);
	    			 for(int i=0;i<reviews.size();i++)model.addElement("Review No.: "+reviews.get(i).getReviewId());
	    			 add(reviewsForBookList);
	    			 bookDisplayGui.setVisible(false);
	    			 reviewsForBookList.setVisible(true);
	    	  		 }
				
			}
		});
	    reviewsForBookList.btnOk.addActionListener(new ActionListener(){
	    	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	    		selection=-1;
	    		reviewsForBookList.listReview.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    		selection=reviewsForBookList.listReview.getSelectedIndex();
	    		ArrayList<Review> temp=new ArrayList<Review>();
	    		
	    		if(selection!=-1){
	    		temp.add(reviews.get(selection));
	    		System.out.println("ttttttttttttttt"+temp);
		    	ReviewDetailsContoller reviewDetailsContoller=new ReviewDetailsContoller(temp);
		    	detials =new ArrayList<String>();
				detials=reviewDetailsContoller.getDetials();
				System.out.println("dddddddddd"+detials);
	    		reviewDisplayGui.textAreaContent.setText(reviews.get(selection).getContentReview());
	    		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	    		reviewDisplayGui.textPaneDate.setText(dateFormat.format(reviews.get(selection).getReviewDate()));
	    		reviewDisplayGui.textPaneReviewerId.setText(reviews.get(selection).getUserId());
	    		reviewDisplayGui.textPaneReviewerName.setText(detials.get(0));
	    		add(reviewDisplayGui);
				reviewDisplayGui.setVisible(true);
				reviewsForBookList.setVisible(false);
	    		}
			}
		});
	    reviewDisplayGui.btnBack.addActionListener(new ActionListener(){
	    	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(reviewsForBookList);
				reviewDisplayGui.setVisible(false);
				reviewsForBookList.setVisible(true);
			}
		});
	    reviewsForBookList.btnBack.addActionListener(new ActionListener(){
	    	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	    		reviewsForBookList.setVisible(false);
	    		if(permmision==4){
	    			add(managerBookDisplayGui);
	    			managerBookDisplayGui.setVisible(true);
	    		}
	    		else if(permmision==3){
	    			add(librarianBookDisplayGui);
	    			librarianBookDisplayGui.setVisible(true);
	    			
	    		}
	    		else{
				add(bookDisplayGui);
				bookDisplayGui.setVisible(true);
	    		}
			}
		});
	    bookDisplayGui.PurchaseButton.addActionListener(new ActionListener(){
	    	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	    		if(mambership==false){
				add(paymentOptionsGui);
				bookDisplayGui.setVisible(false);
				paymentOptionsGui.setVisible(true);
	    		}
	    		else{
	    			add(chooseFormatGui);
					bookDisplayGui.setVisible(false);
					chooseFormatGui.setVisible(true);
	    		}
			}
		});
	    paymentOptionsGui.btnOk.addActionListener(new ActionListener(){
	    	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	    		add(chooseFormatGui);
	    		chooseFormatGui.setVisible(true);
			     paymentOptionsGui.setVisible(false);
			}
		});
	    paymentOptionsGui.btnBack.addActionListener(new ActionListener(){
	    	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	    		add(bookDisplayGui);
	    		bookDisplayGui.setVisible(true);
			     paymentOptionsGui.setVisible(false);
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
       ////////////////////////////////////////
	   ///////////////Editor/////////////////////
	   editor_gui.btnBookSearch.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			add(searchBookGui);
			editor_gui.setVisible(false);
			searchBookGui.setVisible(true);
		}
	});
	   editor_gui.btnWriteAReview.addActionListener(new ActionListener() {


		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			WriteReviewController writeReviewContoller=new WriteReviewController(user.getId());
			books=writeReviewContoller.getBooksList();
			if(books.size()==0)
				JOptionPane.showMessageDialog(null,"You Dont Have Books To review");
			else{
			add(bookListToReviewGui);
			bookListToReviewGui.setVisible(true);
			editor_gui.setVisible(false);
			DefaultListModel<String> model = new DefaultListModel<>();
			bookListToReviewGui.BookList.setModel(model);
			for(int i=0;i<books.size();i++)model.addElement(books.get(i).getTitle());
			}
			
		
		}
	});


	   editor_gui.btnLogout.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			// change in db status of user
			LogoutController logoutController=new LogoutController(user.getId());
			login_gui.IDtextPane.setText("");
			login_gui.passwordField.setText("");
			setSize(new Dimension(450,450));
			login_gui.setVisible(true);
			editor_gui.setVisible(false);
			
		} 
	});
	   editor_gui.NotificationButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			add(notificaitonWindowGui);
			notificaitonWindowGui.setVisible(true);
			editor_gui.setVisible(false);
			
		}
	});
       editor_gui.btnCheckReview.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			UncheckdReviewsListContoller uncheckdReviewsListContoller =new UncheckdReviewsListContoller();
  			reviews=uncheckdReviewsListContoller.getReviewsList();
  			if(reviews.isEmpty())JOptionPane.showMessageDialog(null,"There is NO reviews to Check!!");
  			else{
  			int k=0;
  			DefaultListModel<String> model = new DefaultListModel<>();
			ReviewDetailsContoller reviewDetailsContoller= new ReviewDetailsContoller(reviews);
			detials =new ArrayList<String>();
			detials=reviewDetailsContoller.getDetials();
			reviewToCheackGui.Reviewlist.setModel(model);
			for(int i=0;i<reviews.size();i++){
				model.addElement("Review No.: "+reviews.get(i).getReviewId()+"  ||  Book Title: "+detials.get(k+1)+"  ||  Reviewer Full Name: "+detials.get(k));
				k=k+2;;
			}
			add(reviewToCheackGui);
			reviewToCheackGui.setVisible(true);
			editor_gui.setVisible(false);
  			}
		}
	});	
       ////////////////////////////////////////////////
       /////////////review list to check//////////////
       reviewToCheackGui.btnBack.addActionListener(new ActionListener() {
   		
   		@Override
   		public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
   			
   			reviewToCheackGui.setVisible(false);
   			if(permmision==2)editor_gui.setVisible(true);
   			if(permmision==3)librarian_gui.setVisible(true);
   			else libraryManager_gui.setVisible(true);
   			
   		}
   	});	
       reviewToCheackGui.btnOk.addActionListener(new ActionListener() {

      		
      		@Override
      		public void actionPerformed(ActionEvent e) {
      			// TODO Auto-generated method stub
      			selection=-1;
      			reviewToCheackGui.Reviewlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      			selection=reviewToCheackGui.Reviewlist.getSelectedIndex();
      			if(selection!=-1){
      			reviewCheckingGui.textPaneReviewerId.setText(reviews.get(selection).getUserId());
      			reviewCheckingGui.textPaneReviewerName.setText(detials.get(selection*2));
      			reviewCheckingGui.textPaneTitle.setText(detials.get(selection*2+1));
      			reviewCheckingGui.textAreaContnt.setText(reviews.get(selection).getContentReview());
      			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
      			reviewCheckingGui.textPaneDate.setText(dateFormat.format(reviews.get(selection).getReviewDate()));
      			reviewToCheackGui.setVisible(false);
      			reviewCheckingGui.setVisible(true);
      			add(reviewCheckingGui);
      			}
      			
      		}
      	});
       //////////////////////////////////////////////
       ///////review checking///////////////////////
       reviewCheckingGui.btnBack.addActionListener(new ActionListener() {
     		@Override
     		public void actionPerformed(ActionEvent e) {
     			// TODO Auto-generated method stub
     			
     			reviewToCheackGui.setVisible(true);
     			reviewCheckingGui.setVisible(false);
     			add(reviewToCheackGui);
     			
     		}
     	});
       reviewCheckingGui.btnApprove.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			reviews.get(selection).setContentReview(reviewCheckingGui.textAreaContnt.getText());
    			ReviewCheckDecisionContoller reviewCheckDecisionContoller=new ReviewCheckDecisionContoller(true,reviews.get(selection));
    			JOptionPane.showMessageDialog(null,"The Review APPROVED!!");
    			reviewCheckingGui.setVisible(false);
    			if(permmision==2)editor_gui.setVisible(true);
    			else if(permmision==3)librarian_gui.setVisible(true);
    			else libraryManager_gui.setVisible(true);
    		
    		}
    	});
         reviewCheckingGui.btnReject.addActionListener(new ActionListener() {
 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			ReviewCheckDecisionContoller reviewCheckDecisionContoller=new ReviewCheckDecisionContoller(false,reviews.get(selection));
 			JOptionPane.showMessageDialog(null,"The Review NOT APPROVED And DELETED Form The System!!");
 			reviewCheckingGui.setVisible(false);
 			if(permmision==2)editor_gui.setVisible(true);
 			else if(permmision==3)librarian_gui.setVisible(true);
 			else libraryManager_gui.setVisible(true);
 		
 		}
 	});
       ///////////////////////////////////////////////////////////////////
      //////////////////////////librarianGui//////////////////////////////
       librarian_gui.btnBookSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(searchBookGui);
				librarian_gui.setVisible(false);
				searchBookGui.setVisible(true);
				
			}
		} );
       librarian_gui.btnWriteAReview.addActionListener(new ActionListener() {
   		
    	   @Override
   		public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
   			WriteReviewController writeReviewContoller=new WriteReviewController(user.getId());
   			books=writeReviewContoller.getBooksList();
   			if(books.size()==0)
   				JOptionPane.showMessageDialog(null,"You Dont Have Books To review");
   			else{
   			add(bookListToReviewGui);
   			bookListToReviewGui.setVisible(true);
   			librarian_gui.setVisible(false);
   			DefaultListModel<String> model = new DefaultListModel<>();
   			bookListToReviewGui.BookList.setModel(model);
   			for(int i=0;i<books.size();i++)model.addElement(books.get(i).getTitle());
   			}
   			
   		
   		}
   	});
       librarian_gui.btnLogout.addActionListener(new ActionListener() {
   		
   		@Override
   		public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
   		
   			// change in db status of user
   			LogoutController logoutController=new LogoutController(user.getId());
   			login_gui.IDtextPane.setText("");
			login_gui.passwordField.setText("");
   			setSize(new Dimension(450,450));
   			login_gui.setVisible(true);
   			librarian_gui.setVisible(false);
   			
   		} 
   	});
       librarian_gui.NotificationButton.addActionListener(new ActionListener() {
   		
   		@Override
   		public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
   			add(notificaitonWindowGui);
   			notificaitonWindowGui.setVisible(true);
   			librarian_gui.setVisible(false);
   			
   		}
   	});
       librarian_gui.btnCheckReview.addActionListener(new ActionListener() {
   		

    	   @Override
   		public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
   			UncheckdReviewsListContoller uncheckdReviewsListContoller =new UncheckdReviewsListContoller();
     			reviews=uncheckdReviewsListContoller.getReviewsList();
     			if(reviews.size()==0)JOptionPane.showMessageDialog(null,"There is NO reviews to Check!!");
     			else{
     			int k=0;
     			DefaultListModel<String> model = new DefaultListModel<>();
   			ReviewDetailsContoller reviewDetailsContoller= new ReviewDetailsContoller(reviews);
   			detials =new ArrayList<String>();
   			detials=reviewDetailsContoller.getDetials();
   			reviewToCheackGui.Reviewlist.setModel(model);
   			for(int i=0;i<reviews.size();i++){
   				model.addElement("Review No.: "+reviews.get(i).getReviewId()+"  ||  Book Title: "+detials.get(k+1)+"  ||  Reviewer Full Name: "+detials.get(k));
   				k=k+2;;
   			}
   			add(reviewToCheackGui);
   			reviewToCheackGui.setVisible(true);
   			librarian_gui.setVisible(false);
     			}
   		}
   	});	
       librarian_gui.btnAddBook.addActionListener(new ActionListener() {
      		
      		@Override
      		public void actionPerformed(ActionEvent e) {
      			// TODO Auto-generated method stub
      			addBookController addBook_con = new addBookController();
    			addBook_con.getLangList();
    			languages = addBook_con.languages;
    			lang_combovalues = new ArrayList<String>();
   				lang_combovalues.add("Choose");
    			for(int i=0; i<languages.size();i++)
    				lang_combovalues.add(languages.get(i).getName());
    			String[] Langcomboarr = new String[ lang_combovalues.size() ];
    			Langcomboarr = lang_combovalues.toArray( Langcomboarr );
    			addBookGui.comboBox.setModel(new DefaultComboBoxModel(Langcomboarr));
    			
      			add(addBookGui);
      			addBookGui.setVisible(true);
      			librarian_gui.setVisible(false);
      			
      		}
      	});	
       librarian_gui.btnPayReq.addActionListener(new ActionListener() {
     		
     		@Override
     		public void actionPerformed(ActionEvent e) {
     			// TODO Auto-generated method stub
     			add(paymantRequstListGui);
     			paymantRequstListGui.setVisible(true);
     			librarian_gui.setVisible(false);
     			
     		}
     	});
       librarian_gui.btnSigninRequest.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			add(sgininRequsrtListGui);
    			sgininRequsrtListGui.setVisible(true);
    			librarian_gui.setVisible(false);
    			
    		}
    	});
       librarian_gui.btnAddAccount.addActionListener(new ActionListener() {
   		
   		@Override
   		public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
   			add(addAccuntGui);
   			addAccuntGui.setVisible(true);
   			librarian_gui.setVisible(false);
   			
   		}
   	});
        librarian_gui.btnAcocuntEditor.addActionListener(new ActionListener() {
      		
      		@Override
      		public void actionPerformed(ActionEvent e) {
      			// TODO Auto-generated method stub
      			add(searchAccuntGui);
      			searchAccuntGui.setVisible(true);
      			librarian_gui.setVisible(false);
      			
      		}
      	});
       ///////////////////////book display///////////////////////////////
       librarianBookDisplayGui.BackButton.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			
    			searchBookResultGui.setVisible(true);
    			librarianBookDisplayGui.setVisible(false);
    			
    			
    		}
    	});
       librarianBookDisplayGui.ReadReviewButton.addActionListener(new ActionListener(){
	    	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	    		bookId=new String("2");///////////for checking/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    		ReviewsForBookListContoller reviewsForBookListContoller=new ReviewsForBookListContoller(bookId);
	    		reviews=reviewsForBookListContoller.getReviewsList();
	    		if(reviews.isEmpty())JOptionPane.showMessageDialog(null,"There is NO reviews for this book!!");
	    	  	else{
	    	  		 
	    	  		 DefaultListModel<String> model = new DefaultListModel<>();
	    	  		 reviewsForBookList.listReview.setModel(model);
	    			 for(int i=0;i<reviews.size();i++)model.addElement("Review No.: "+reviews.get(i).getReviewId());
	    			 add(reviewsForBookList);
	    			 librarianBookDisplayGui.setVisible(false);
	    			 reviewsForBookList.setVisible(true);
	    	  		 }
				
			}
		});
       /////////////////////add book///////////////////////////////////
       addBookGui.BackButton.addActionListener(new ActionListener() {
   		@Override
   		public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
   			if(permmision==3)librarian_gui.setVisible(true);
   			else libraryManager_gui.setVisible(true);
   			addBookGui.setVisible(false);
   			
   			
   			
   		}
       });
       
       /////////////////////add book button//////////////////////////////////
       addBookGui.NextButton_category.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {

			
			book = new Book("",addBookGui.textPaneBookName.getText(), addBookGui.comboBox.getSelectedIndex()+1, addBookGui.textAreaTableOfContent.getText(), Float.parseFloat(addBookGui.textPaneCost.getText()), addBookGui.textAreaSummery.getText());
			addBookController addBook_con = new addBookController();
			addBook_con.getSubjectsList();
			subjects = addBook_con.subjects;
			addBookCatRangGui.setSubjectsList(addBook_con.subjects);
			/// build the subjects checkboxs
   			add(addBookCatRangGui);
   			addBookGui.setVisible(false);
   			addBookCatRangGui.setVisible(true); 
   			
	
		}
	});
       	addBookCatRangGui.NextButton_authors.addActionListener(new ActionListener() {

       		@Override
       		public void actionPerformed(ActionEvent e) {

    			addBookController addBook_con = new addBookController();
       			//System.out.println(addBook_con.subjects_id);

       			addBook_con.getAuthorList();
       			authors = addBook_con.authors;
    			addBookAuthors.setAuthorsList(addBook_con.authors);
       			add(addBookAuthors);
       			addBookAuthors.setVisible(true);
       			addBookCatRangGui.setVisible(false);
       		}
       	});
       	addBookCatRangGui.BackButton.addActionListener(new ActionListener() {

       		@Override
       		public void actionPerformed(ActionEvent e) {
       			// TODO Auto-generated method stub
    		//	addBookController addBook_con = new addBookController(book,subjects);
       			addBookGui.setVisible(true);
       			addBookCatRangGui.setVisible(false);
       		}
       	});
       	
       	addBookAuthors.BackButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			addBookCatRangGui.setVisible(true);
			addBookAuthors.setVisible(false);
			
		}
	});
       	
       	addBookAuthors.AddButton.addActionListener(new ActionListener() {

       		@Override
       		public void actionPerformed(ActionEvent e) {

    			addBookController addBook_con = new addBookController();
    			addBook_con.getSelectedAuthors(authors);
    			addBook_con.getSelectedSubjects(subjects);

       			//System.out.println(addBook_con.authors_id);

    			
    			addBook_con.InsertBook(book);
       			addBookAuthors.setVisible(true);
       			addBookCatRangGui.setVisible(false);
       		}
       	});
       
       ///////////////////////payment request//////////////////
       paymantRequstListGui.btnBack.addActionListener(new ActionListener() {
      		@Override
       		public void actionPerformed(ActionEvent e) {
       			// TODO Auto-generated method stub
      			paymantRequstListGui.setVisible(false);
       			if(permmision==3)librarian_gui.setVisible(true);
       			else libraryManager_gui.setVisible(true);
       			
       			
       		}
           });
       paymantRequstListGui.btnOk.addActionListener(new ActionListener() {
    		@Override
     		public void actionPerformed(ActionEvent e) {
     			// TODO Auto-generated method stub
    			paymantRequstListGui.setVisible(false);
    			add(paymentRequstDisplayGui);
    			paymentRequstDisplayGui.setVisible(true);
     			
     			
     		}
    	
         });
       ///////////////////////payment requst display////////////////////
       paymentRequstDisplayGui.btnBack.addActionListener(new ActionListener() {
    		@Override
     		public void actionPerformed(ActionEvent e) {
     			// TODO Auto-generated method stub
    			paymantRequstListGui.setVisible(true);
    			paymentRequstDisplayGui.setVisible(false);
     			
     			
     		}
    	
         });
       ///////////////sginin request//////////////////
       sgininRequsrtListGui.btnBack.addActionListener(new ActionListener() {
   		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
   			if(permmision==3)librarian_gui.setVisible(true);
   			else libraryManager_gui.setVisible(true);
   			sgininRequsrtListGui.setVisible(false);
    			
    			
    		}
   	
        });
       sgininRequsrtListGui.btnOk.addActionListener(new ActionListener() {
      		@Override
       		public void actionPerformed(ActionEvent e) {
       			// TODO Auto-generated method stub
      			sgininRequstDisplayGui.setVisible(true);
      			sgininRequsrtListGui.setVisible(false);
       			add(sgininRequstDisplayGui);
       			
       		}
      	
           });
         ///////////////////////////sginin requst display/////////////
         sgininRequstDisplayGui.btnBack.addActionListener(new ActionListener() {
     		@Override
      		public void actionPerformed(ActionEvent e) {
      			// TODO Auto-generated method stub
     			sgininRequstDisplayGui.setVisible(false);
     			sgininRequsrtListGui.setVisible(true);
      			
      			
      		}
     	
          });
         /////////////////////add Accunt///////////////////////////////
         addAccuntGui.BackButton.addActionListener(new ActionListener() {
      		@Override
       		public void actionPerformed(ActionEvent e) {
       			// TODO Auto-generated method stub
      			addAccuntGui.setVisible(false);
      			if(permmision==3)librarian_gui.setVisible(true);
      			else libraryManager_gui.setVisible(true);
       			
       		}
      	
           });
         ////////////////////////search accunt////////////////////
         searchAccuntGui.btnBack.addActionListener(new ActionListener() {
       		@Override
        		public void actionPerformed(ActionEvent e) {
        			// TODO Auto-generated method stub
       			searchAccuntGui.setVisible(false);
       			if(permmision==3)librarian_gui.setVisible(true);
       			else libraryManager_gui.setVisible(true);
        			
        		}
       	
            });
         searchAccuntGui.btnSearch.addActionListener(new ActionListener() {
       		@Override
        		public void actionPerformed(ActionEvent e) {
        			// TODO Auto-generated method stub
       			searchAccuntGui.setVisible(false);
       			if(permmision==3){
       				editAccuntGui.setVisible(true);
       			    add(editAccuntGui);
       			}	
       			else{
       				managerEditAccuntGui.setVisible(true);
       			    add(managerEditAccuntGui);
       			}
        		}
       	
            });
         //////////////////////////////////esit accunt liberian/////////////////
         editAccuntGui.BackButton.addActionListener(new ActionListener() {
       		@Override
        		public void actionPerformed(ActionEvent e) {
        			// TODO Auto-generated method stub
       			searchAccuntGui.setVisible(true);
       			editAccuntGui.setVisible(false);
            }});
         
         /////////////////////////////////////library manager/////////////////////////////
         libraryManager_gui.btnBookSearch.addActionListener(new ActionListener() {
       		@Override
        		public void actionPerformed(ActionEvent e) {
        			// TODO Auto-generated method stub
       			searchBookGui.setVisible(true);
       			libraryManager_gui.setVisible(false);
       			add(searchBookGui);
       		}
       		}); 
           libraryManager_gui.btnWriteAReview.addActionListener(new ActionListener() {

       		@Override
       		public void actionPerformed(ActionEvent e) {
       			// TODO Auto-generated method stub
       			WriteReviewController writeReviewContoller=new WriteReviewController(user.getId());
       			books=writeReviewContoller.getBooksList();
       			if(books.size()==0)
       				JOptionPane.showMessageDialog(null,"You Dont Have Books To review");
       			else{
       			add(bookListToReviewGui);
       			bookListToReviewGui.setVisible(true);
       			libraryManager_gui.setVisible(false);
       			DefaultListModel<String> model = new DefaultListModel<>();
       			bookListToReviewGui.BookList.setModel(model);
       			for(int i=0;i<books.size();i++)model.addElement(books.get(i).getTitle());
       			}
       			
       		
       		}
       	});
           libraryManager_gui.btnLogout.addActionListener(new ActionListener() {
       	   		
       	   		@Override
       	   		public void actionPerformed(ActionEvent e) {
       	   			// TODO Auto-generated method stub
       	   		
       	   			// change in db status of user
       	   		LogoutController logoutController=new LogoutController(user.getId());
       	     	login_gui.IDtextPane.setText("");
			    login_gui.passwordField.setText("");
       	   		setSize(new Dimension(450,450));
       	   		login_gui.setVisible(true);
       	   		libraryManager_gui.setVisible(false);
       	   			
       	   		} 
       	   	});
             libraryManager_gui.NotificationButton.addActionListener(new ActionListener() {
       	   		
       	   		@Override
       	   		public void actionPerformed(ActionEvent e) {
       	   			// TODO Auto-generated method stub
       	   			add(notificaitonWindowGui);
       	   			notificaitonWindowGui.setVisible(true);
       	   		    libraryManager_gui.setVisible(false);
       	   			
       	   		}
       	   	});
             libraryManager_gui.btnCheckReview.addActionListener(new ActionListener() {
       	   		
            	 @Override
         		public void actionPerformed(ActionEvent e) {
         			// TODO Auto-generated method stub
         			UncheckdReviewsListContoller uncheckdReviewsListContoller =new UncheckdReviewsListContoller();
           			reviews=uncheckdReviewsListContoller.getReviewsList();
           			if(reviews.size()==0)JOptionPane.showMessageDialog(null,"There is NO reviews to Check!!");
           			else{
           			int k=0;
           			DefaultListModel<String> model = new DefaultListModel<>();
         			ReviewDetailsContoller reviewDetailsContoller= new ReviewDetailsContoller(reviews);
         			detials =new ArrayList<String>();
         			detials=reviewDetailsContoller.getDetials();
         			reviewToCheackGui.Reviewlist.setModel(model);
         			for(int i=0;i<reviews.size();i++){
         				model.addElement("Review No.: "+reviews.get(i).getReviewId()+"  ||  Book Title: "+detials.get(k+1)+"  ||  Reviewer Full Name: "+detials.get(k));
         				k=k+2;;
         			}
         			add(reviewToCheackGui);
         			reviewToCheackGui.setVisible(true);
         			libraryManager_gui.setVisible(false);
           			}
         		}
         	});	
             libraryManager_gui.btnAddBook.addActionListener(new ActionListener() {
       	      		
       	      		@Override
       	      		public void actionPerformed(ActionEvent e) {
       	      		addBookController addBook_con = new addBookController();


       	      	addBook_con.getLangList();
    			languages = addBook_con.languages;
    			lang_combovalues = new ArrayList<String>();
   				lang_combovalues.add("Choose");
    			for(int i=0; i<languages.size();i++)
    				lang_combovalues.add(languages.get(i).getName());
    			String[] Langcomboarr = new String[ lang_combovalues.size() ];
    			Langcomboarr = lang_combovalues.toArray( Langcomboarr );
    			addBookGui.comboBox.setModel(new DefaultComboBoxModel(Langcomboarr));
    			
       	      			add(addBookGui);
       	      			addBookGui.setVisible(true);
       	      		libraryManager_gui.setVisible(false);
       	      			
       	      		}
       	      	});	
             libraryManager_gui.btnPayReq.addActionListener(new ActionListener() {
       	     		
       	     		@Override
       	     		public void actionPerformed(ActionEvent e) {
       	     			// TODO Auto-generated method stub
       	     			add(paymantRequstListGui);
       	     			paymantRequstListGui.setVisible(true);
       	     		libraryManager_gui.setVisible(false);
       	     			
       	     		}
       	     	});
             libraryManager_gui.btnSigninRequest.addActionListener(new ActionListener() {
       	    		
       	    		@Override
       	    		public void actionPerformed(ActionEvent e) {
       	    			// TODO Auto-generated method stub
       	    			add(sgininRequsrtListGui);
       	    			sgininRequsrtListGui.setVisible(true);
       	    			libraryManager_gui.setVisible(false);
       	    			
       	    		}
       	    	});
             libraryManager_gui.btnAddAccount.addActionListener(new ActionListener() {
       	   		
       	   		@Override
       	   		public void actionPerformed(ActionEvent e) {
       	   			// TODO Auto-generated method stub
       	   			add(addAccuntGui);
       	   			addAccuntGui.setVisible(true);
       	   		libraryManager_gui.setVisible(false);
       	   			
       	   		}
       	   	});
             libraryManager_gui.btnAcocuntEditor.addActionListener(new ActionListener() {
       	      		
       	      		@Override
       	      		public void actionPerformed(ActionEvent e) {
       	      			// TODO Auto-generated method stub
       	      			add(searchAccuntGui);
       	      			searchAccuntGui.setVisible(true);
       	      		libraryManager_gui.setVisible(false);
       	      			
       	      		}
       	      	});	
             libraryManager_gui.btnGetReport.addActionListener(new ActionListener() {
    	      		
    	      		@Override
    	      		public void actionPerformed(ActionEvent e) {
    	      			// TODO Auto-generated method stub
    	      			add(reportManuGui);
    	      			reportManuGui.setVisible(true);
    	      		libraryManager_gui.setVisible(false);
    	      			
    	      		}
    	      	});	
          
         /////////////////manager book display gui////////////////////////////
         managerBookDisplayGui.BackButton.addActionListener(new ActionListener() {
       		@Override
        		public void actionPerformed(ActionEvent e) {
        			// TODO Auto-generated method stub
       			
       			searchBookResultGui.setVisible(true);
       			managerBookDisplayGui.setVisible(false);
       		}
       		});	
         managerBookDisplayGui.ReadReviewButton.addActionListener(new ActionListener(){
 	    	@Override
 			public void actionPerformed(ActionEvent e) {
 				// TODO Auto-generated method stub
 	    		bookId=new String("2");///////////for checking/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 	    		ReviewsForBookListContoller reviewsForBookListContoller=new ReviewsForBookListContoller(bookId);
 	    		reviews=reviewsForBookListContoller.getReviewsList();
 	    		if(reviews.isEmpty())JOptionPane.showMessageDialog(null,"There is NO reviews for this book!!");
 	    	  	else{
 	    	  		 
 	    	  		 DefaultListModel<String> model = new DefaultListModel<>();
 	    	  		 reviewsForBookList.listReview.setModel(model);
 	    			 for(int i=0;i<reviews.size();i++)model.addElement("Review No.: "+reviews.get(i).getReviewId());
 	    			 add(reviewsForBookList);
 	    			 managerBookDisplayGui.setVisible(false);
 	    			 reviewsForBookList.setVisible(true);
 	    	  		 }
 				
 			}
 		});
         /////////////////////manager edit accunt gui///////////////////
         managerEditAccuntGui.BackButton.addActionListener(new ActionListener() {
       		@Override
        		public void actionPerformed(ActionEvent e) {
        			// TODO Auto-generated method stub
       			searchAccuntGui.setVisible(true);
       			managerEditAccuntGui.setVisible(false);
       			add(searchAccuntGui);
       		}
       		});	
         /////////////report manu///////////////////
         reportManuGui.btnBack.addActionListener(new ActionListener() {
        		@Override
         		public void actionPerformed(ActionEvent e) {
         			// TODO Auto-generated method stub
        			libraryManager_gui.setVisible(true);
        			reportManuGui.setVisible(false);
        		}
        		});	
         reportManuGui.btnReportByBook.addActionListener(new ActionListener() {
     		@Override
     		public void actionPerformed(ActionEvent e) {
     			// TODO Auto-generated method stub
     			add(reportSearchBookGui);
     			reportSearchBookGui.setVisible(true);
    			reportManuGui.setVisible(false);
    		}
    		});	
         reportManuGui.btnReportByReader.addActionListener(new ActionListener() {
      		@Override
      		public void actionPerformed(ActionEvent e) {
      			// TODO Auto-generated method stub
      			add(reportSearchAccuntGui);
      			reportSearchAccuntGui.setVisible(true);
     			reportManuGui.setVisible(false);
     		}
     		});		
         ////////////////////////////report by reader////////////////////////
         reportSearchAccuntGui.btnSearch.addActionListener(new ActionListener() {
       		@Override
       		public void actionPerformed(ActionEvent e) {
       			// TODO Auto-generated method stub
       			add(reportDisplayReaderGui);
       			reportDisplayReaderGui.setVisible(true);
       			reportSearchAccuntGui.setVisible(false);
      		}
      		});		
         reportSearchAccuntGui.btnBack.addActionListener(new ActionListener() {
        		@Override
        		public void actionPerformed(ActionEvent e) {
        			// TODO Auto-generated method stub
        			reportManuGui.setVisible(true);
        			reportSearchAccuntGui.setVisible(false);  
        		}
         });
         /////////////////////////////report reader Display/////////////////////////
         reportDisplayReaderGui.btnBack.addActionListener(new ActionListener() {
        		@Override
        		public void actionPerformed(ActionEvent e) {
        			// TODO Auto-generated method stub
        		
        			reportDisplayReaderGui.setVisible(false);
        			reportSearchAccuntGui.setVisible(true);
       		}
       		});		
         ////////////////report by book ////////////////////
         reportSearchBookGui.BackButton.addActionListener(new ActionListener() {
     		@Override
     		public void actionPerformed(ActionEvent e) {
     			// TODO Auto-generated method stub
     			reportManuGui.setVisible(true);
     			reportSearchBookGui.setVisible(false);  
     		}
      });
         reportSearchBookGui.SearchbtnNewButton.addActionListener(new ActionListener() {
      		@Override
      		public void actionPerformed(ActionEvent e) {
      			// TODO Auto-generated method stub
      			reportSearchBookResultGui.setVisible(true);
      			reportSearchBookGui.setVisible(false);  
      			add(reportSearchBookResultGui);
      		}
       });
         /////////////////////////////report search book result//////////////////
         reportSearchBookResultGui.BackButton.addActionListener(new ActionListener() {
       		@Override
       		public void actionPerformed(ActionEvent e) {
       			// TODO Auto-generated method stub
       			reportSearchBookResultGui.setVisible(false);
       			reportSearchBookGui.setVisible(true);  
       			
       		}
        });
         reportSearchBookResultGui.OKButton.addActionListener(new ActionListener() {
        		@Override
           		public void actionPerformed(ActionEvent e) {
           			// TODO Auto-generated method stub
           			reportSearchBookResultGui.setVisible(false);
           			reportBookDisplayGui.setVisible(true);
           			add(reportBookDisplayGui);
           			
           		}
            });
         /////////////////report book display///////////////////
         reportBookDisplayGui.BackButton.addActionListener(new ActionListener() {
        		@Override
           		public void actionPerformed(ActionEvent e) {
           			// TODO Auto-generated method stub
        			reportBookDisplayGui.setVisible(false);
        			reportSearchBookResultGui.setVisible(true);  
           			
           		}
            });
         
	}
      
	
	
	private void openPanelByjob()
	{
		int flag_check_user=0;  
		System.out.println(user.getstatus_blocked());
		if(user.getstatus_blocked().compareTo("1")==0)
		{
			JOptionPane.showMessageDialog(null,"The user account is blocked");
			flag_check_user=1;
		}
		else if(user.getlogin().compareTo("1")==0)
		{
			JOptionPane.showMessageDialog(null,"The user is allready connect from other devise ");
			flag_check_user=1;
		}
	    
		if(flag_check_user==0)
		{
		switch(user.getPrmission())
		{
		case "1":                 //Reader
		{
			add(reader_gui);
			reader_gui.setVisible(true);
			login_gui.setVisible(false);
			setSize(new Dimension(750, 650));
			reader_gui.lblHi.setText("Hi! "+user.getFirstName()+" "+user.getLastName());
		break;
		}
		case "2":                    //Editor
		{
			add(editor_gui);
			editor_gui.setVisible(true);
			login_gui.setVisible(false);
			setSize(new Dimension(750, 650));
			editor_gui.lblHi.setText("Hi! "+user.getFirstName()+" "+user.getLastName());
		break;	
		}
		case "3":                   //Librarian
		{   
			add(librarian_gui);
			librarian_gui.setVisible(true);
			login_gui.setVisible(false);
			setSize(new Dimension(750, 650));
			librarian_gui.lblHi.setText("Hi! "+user.getFirstName()+" "+user.getLastName());
		break;
		}
		case "4":  
		{                              //Library Manager
			add(libraryManager_gui);
			libraryManager_gui.setVisible(true);
			login_gui.setVisible(false);
			setSize(new Dimension(750, 650));
			libraryManager_gui.lblHi.setText("Hi! "+user.getFirstName()+" "+user.getLastName());
		break;
		}
		default:
		{
			JOptionPane.showMessageDialog(null,"The ID or the PASSWORD are incorrct");
		}
		
		
		}
		}
	}
	
	private void copyUser(User u)
	{
		System.out.println("1   "+u.toString());
		user.setId(u.getId());
		user.setFirstName(u.getFirstName());
		user.setLastName(u.getLastName());
		user.setEmail(u.getEmail());
		user.setpass(u.getpass());
		user.setCreditCardNum(u.getCreditCardNum());
		user.setlogin(u.getlogin());
		user.setPrmission(u.getPrmission());
		user.setaccout_type(u.getaccout_type());
		user.setstatus_blocked(u.getstatus_blocked());
		System.out.println("2   "+user.toString());
		
	}
	
}