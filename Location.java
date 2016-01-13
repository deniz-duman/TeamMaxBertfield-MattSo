//class Location
import java.util.ArrayList;

public class Location {
  private String _name, _desc;
  private int[] _coor;
  private ArrayList<Objects> _objects;
  private ArrayList<Entities> _entities;
  private boolean isPassable;
  
  public Location(){
    boolean isPassable = false;
  }
  
  public Location (String name, String desc, int[] coor, ArrayList<Objects> objs, ArrayList<Entities> ents; boolean pass) {
    _name = name;
    _desc = desc;
    _coor = coor;
    _objects = new ArrayList<Objects>();
    _entities = new ArrayList<Entities>();
    isPassable = pass;
  }
  
  public static String toString() {
    String retStr = _name + "\n\n" + _desc;
    return retStr;
    
  }
  
  
}
