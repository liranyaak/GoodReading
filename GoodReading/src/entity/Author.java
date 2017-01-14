package entity;


public class Author {

	    private String id;
	    private String firstName;
	    private String lastName;
	    
	    public Author(Author a)
	    {
	        this.id = a.getId();
	        this.firstName = a.getFirstName();
	        this.lastName = a.getLastName();
	        
	    }
	    public Author(String id, String firstName, String lastName)
	    {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        
	    }
	    public Author()
	    {
	    	    this.id = "0";
		        this.firstName = "0";
		        this.lastName = "0";
	    }


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


		
		@Override
		public String toString() {
			return firstName+ " " + lastName;
		}
		public String getFullName() {
			return firstName + " " + lastName;
		}
}
