package entity;


public class Subject {

	    private String id;
	    private String name;
	    
	    
	    public Subject(Subject s){
			this.id=s.getId();
			this.name=s.getName();
		}

	    public Subject(String id, String name)
	    {
	        this.id = id;
	        this.name = name;
	       
	    }
	    public Subject()
	    {
	    	    this.id = "0";
		        this.name = "NULL";
		      
	    }


	    public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Subject [id=" + id + ", name=" + name + "]";
		}
}
