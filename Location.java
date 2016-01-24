//class Location
import java.util.ArrayList;

public class Location {
  private String _name, _desc;
  private ArrayList<Objects> _objects = new ArrayList<Objects>();
  private ArrayList<AI> _entities = new ArrayList<AI>();
  private boolean isPassable, isGoal;
  //=========================================Constructors and ToString===================================================\\
  public Location(){
    boolean isPassable = false;
    boolean isGoal = false;
  }
  
  public Location(Objects O){
    _objects.add(O);
  }
  public Location (String name, String desc, boolean pass, boolean goal) {
    _name = name;
    _desc = desc;
    isPassable = pass;
    isGoal = goal;

  }
  
  public String toString() {
    String retStr = _name + "\n\n" + _desc;
    return retStr;
    
  }
  //========================================Mutators=====================================================================\\
  public void setPass(boolean boo) {
    isPassable = boo;
  }
  public void setDesc(String desc) {
    _desc = desc;
  }
  public Objects setObj(int i, Objects O) {
    return _objects.set(i, O);

  }
  public Entities setEnt(int i, AI E) {
    return _entities.set(i, E);
  }
  //=========================================Accessors=================================================================\\
  public String getName()              {return _name;}
  public String getDesc()              {return _desc;}
  public ArrayList<Objects> getObjArr(){return _objects;}
  public Objects getObj(int i)         {return _objects.get(i);}
  public ArrayList<AI> getEntArr(){return _entities;}
  public Entities getEnt(int i)        {return _entities.get(i);}
  public boolean getPass()             {return isPassable;}

  //========================================Methods===================================================================\\
  //Add to Objects ArrayList
  public void AddtoObj(Objects O) {
    _objects.add(O);
  }
  //Add to Entities ArrayList
  public void AddtoEnt(AI E) {
    _entities.add(E);
  }
  //Delete Object
  public Objects DelObj(Objects O) {
    _objects.remove(O);
    return O;
  }
  //Delete Entities
  public AI DelEnt(AI E) {
    _entities.remove(E);
    return E;
  }
  
  public String printEnt() {
    String retStr = " ";
    for (AI e: _entities) {
      retStr += e.getName() + " ";
    }
    return retStr;
  }
  
  public String printObj() {
    String retStr = " ";
    for (Objects o: _objects) {
      retStr += o.getType() + " ";
    }
    return retStr;
  }
  
}
