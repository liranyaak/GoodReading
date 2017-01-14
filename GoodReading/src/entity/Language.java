package entity;


public class Language {

	    private String id;
	    private String name;
	    
	    
	    public Language(Language s){
			this.id=s.getId();
			this.name=s.getName();
		}

	    public Language(String id, String name)
	    {
	        this.id = id;
	        this.name = name;
	       
	    }
	    public Language()
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
			return "Language [id=" + id + ", name=" + name + "]";
		}
}
