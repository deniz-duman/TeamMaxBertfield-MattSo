//Items; subclass of Objects
public class Items implements Objects{

	private String _type = "";
  	private String _desc = "";

  	public Items(String type, String desc){
    
    	_type = type;
    	_desc = desc;
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

}
