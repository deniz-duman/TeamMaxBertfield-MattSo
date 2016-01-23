//Weapons; subclass of Objects
public class Weapons implements Objects{
	private String _type = "";
  	private String _desc = "";
  	private int _dmg;
  	private boolean isGun?;

  	public Weapons(String type, String desc, int dmg, boolean gun){
    	isGun? = gun;
    	_type = type;
    	_desc = desc;
    	_dmg = dmg;
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
  
 	public boolean getIsGun?() {
 		return isGun?;
 	}
 	}

}
