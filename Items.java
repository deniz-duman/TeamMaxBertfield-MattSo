//Items; subclass of Objects
public class Items implements Objects{

	private String _type = "";
  	private String _desc = "";
  	private ArrayList<Objects> Compatible = new ArrayList<Objects>();

  	public Items(String type, String desc){
    
    		_type = type;
    		_desc = desc;
  }
	public Items(Items I) {
		Compatible.add(I);	
	}
	public String getType() {
    	return _type;
  }
  
  	public String getDesc() {
    	return _desc;
  }
   	public String ToString() {
   		return getType();
  }
  	public boolean isCompatible(Items I) {
  		return if (Compatible.contains(I))
  		}
  	}
}
