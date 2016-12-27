package Controllers;


public class User {

	    private String id;
	    private String firstName;
	    private String lastName;
	    private String pass;
	    private String email;
	    private String creditCardNum; 

	    public User(String id, String firstName, String lastName,String pass,String email,String creditCardNum)
	    {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.pass = pass;
	        this.pass = email;
	        this.pass = creditCardNum;
	    }
	    public User()
	    {
	    	
	    }
////////////////////////Shay-what to do? private??
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


		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", pass=" + pass
					+ ", email=" + email + ", creditCardNum=" + creditCardNum
					+ "]";
		}
}
