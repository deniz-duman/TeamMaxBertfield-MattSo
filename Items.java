//Items; subclass of Objects
import java.util.ArrayList;

public class Items implements Objects{

  private String _type = "";
    private String _desc = "";
    private ArrayList<Objects> Compatible = new ArrayList<Objects>();
    private boolean take?;
    public Items(String type, String desc, Items I, boolean take){
        take? = take;
        _type = type;
        _desc = desc;
      Compatible.add(I);  
  }
  public String getType() {
      return _type;
  }

  public void setType(String newType) {
    _type = newType;
  }
  
  public boolean getTake?() {
    return take?;
  }
  
  public void setTake?(boolean t) {
    take? = t;
  }
  
    public String getDesc() {
      return _desc;
  }
    public String ToString() {
      return getType();
  }
    public boolean isCompatible(Items I) {
      return Compatible.contains(I);
  }

}
