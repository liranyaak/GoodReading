package entity;


public class Range {

	    private String id;
	    private String name;
	    
	    public Range(Range r){
			this.id=r.getId();
			this.name=r.getName();
		}
	    
	    public Range(String id, String name)
	    {
	        this.id = id;
	        this.name = name;
	       
	    }
	    public Range()
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
			return "Range [id=" + id + ", name=" + name + "]";
		}
}
