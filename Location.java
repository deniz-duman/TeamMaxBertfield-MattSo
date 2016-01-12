//class Location
import java.util.ArrayList;

public class Location {
  private String _name, _desc;
  private int[] _coor;
  private ArrayList<Objects> _objects;
  private ArrayList<Entities> _entities;
  private boolean empty;
  
  public Location(){
    boolean empty = true;
  }
  
  public Location (String name, String desc, int[] coor, ArrayList<Objects> objs, ArrayList<Entities> ents) {
    _name = name;
    _desc = desc;
    
    _objects = new ArrayList<Objects>;
 
}
