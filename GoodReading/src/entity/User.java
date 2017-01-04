package entity;


public class User {

	    private String id;
	    private String firstName;
	    private String lastName;
	    private String pass;
	    private String email;
	    private String creditCardNum; 
	    private String log_in;
	    private String prmission;
	    private String accout_type;
	    private String status_blocked;

	    public User(String id, String firstName, String lastName,String pass,String email,String creditCardNum,String login,String prmission,String status_blocked,String accout_type )
	    {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.pass = pass;
	        this.email= email;
	        this.creditCardNum = creditCardNum;
	        this.log_in=login;
	        this.prmission= prmission;
	        this.accout_type=accout_type;
	        this.status_blocked=status_blocked;
	    }
	    public User()
	    {
	    	    this.id = "0";
		        this.firstName = "0";
		        this.lastName = "0";
		        this.pass = "0";
		        this.email="0" ;
		        this.creditCardNum = "0";
		        this.log_in="0";
		        this.prmission= "0";
		        this.accout_type="0";
		        this.status_blocked="0";
	    }

public String getpass() {
return pass;
}


public void setpass(String pass) {
this.pass = pass;
}////////////////////////

	    public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getCreditCardNum() {
			return creditCardNum;
		}


		public void setCreditCardNum(String creditCardNum) {
			this.creditCardNum = creditCardNum;
		}

		public void setlogin(String log_in) {
			this.log_in =log_in ;
		}
		public void setPrmission(String prmission) {
			this.prmission =prmission ;
		}
		
		public void setaccout_type(String accout_type) {
			this.accout_type=accout_type;
		}
		
		public void setstatus_blocked(String status_blocked) {
			 this.status_blocked="0";
		}
		
		
		
		
		
		public String getlogin() {
			return log_in;
		}
		public String getPrmission() {
			return prmission;
		}
		
		public String getaccout_type() {
			return accout_type;
		}
		public String getstatus_blocked() {
			return status_blocked;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", pass=" + pass
					+ ", email=" + email + ", creditCardNum=" + creditCardNum+ 
					"log_in=" + log_in + ", prmission=" + prmission+", accout_type=" +accout_type + ", status_blocked=" +status_blocked+ "]";
		}
}
