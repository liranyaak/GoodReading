package Controllers;


public class User {

	    private String id;
	    private String firstName;
	    private String lastName;
	    private String pass;
	    private String email;
	    private String creditCardNum; 
	    private String status;
	    private String prmission;

	    public User(String id, String firstName, String lastName,String pass,String email,String creditCardNum,String status,String prmission)
	    {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.pass = pass;
	        this.pass = email;
	        this.pass = creditCardNum;
	        this.status=status;
	        this.prmission= prmission;
	    }
	    public User()
	    {
	    	    this.id = "1";
		        this.firstName = "1";
		        this.lastName = "1";
		        this.pass = "1";
		        this.pass = "1";
		        this.pass = "1";
	    	
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

		public void setStatus(String Status) {
			this.status =Status ;
		}
		public void setPrmission(String prmission) {
			this.prmission =prmission ;
		}
		public String getStatus() {
			return status;
		}
		public String getPrmission() {
			return prmission;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", pass=" + pass
					+ ", email=" + email + ", creditCardNum=" + creditCardNum+ 
					"status=" + status + ", prmission=" + prmission+"]";
		}
}
