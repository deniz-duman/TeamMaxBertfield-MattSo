//class Food; subclass of Objects
public class Food implements Objects{

	private String _type = "";
  	private String _desc = "";
  	private int fillinglvl;

  	public Food(String type, String desc, int fill){
    
    	_type = type;
    	_desc = desc;
    	fillinglvl = fill;
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
  
  	public int getFillinglvl() {
  		return fillinglvl;
  }

}
