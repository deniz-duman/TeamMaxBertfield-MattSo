//class User; subclass of Entities
import java.util.ArrayList;

public class User implements Entities{
  private double hp = 0;
  private double dmg = 0;
  private String name = "";
  private String desc = "";
  public boolean isAlive = true;
  private int ammo;
  private double hunger;
  private int[] currlocation;
  private int xcoor, ycoor;
  private ArrayList<Objects> inventory = new ArrayList<Objects>();
  
  public User(){
    
    name = "DT 24601";
    desc = "You are Droptrooper 24601";
    isAlive = true;
    hp = 100.0;
    dmg = 10.0;
    hunger = 0;
    currlocation = new int[2];
    isAlive = true;
  }
  
  public String getName() {
      return name;
  }
  
  public String getDesc() {
    return desc;
  }
  
  public double getHP() {
    return hp;
  }
  
  public int getXcoor() {
    return xcoor;
  }
  
  public int getYcoor() {
    return ycoor;
  }

  public void setXcoor(int i) {
    xcoor = i;
  }

  public void setYcoor(int i) {
    ycoor = i;
  }

  public double setHP(double newHealth) {
    double oldhp = hp;
    hp = newHealth;
    return hp;
  }
  
  public double getDMG() {
    return dmg;
  }
  
  public double setDMG(double newDMG) {
    double olddmg = dmg;
    dmg = newDMG;
    return olddmg;
  }

  public void attack(double damage, AI ai) {
    ai.setHP(ai.getHP() - damage);
  }
  
  public void setLoc(int x, int y) {
    currlocation[7] = x;
    xcoor = x;
    currlocation[4] = y;
    ycoor = y;
  }
  
  public ArrayList<Objects> getInv() {
    return inventory;
  }

  public String toStringInv() {
    String retStr = "--{";
    for (Objects o : inventory) {
      retStr += " " + o + " ";
    }
    return retStr + "}--";
  }

  public void addInv(Objects o) {
    inventory.add(o);
  }

  public void delInv(Objects o) {
    inventory.remove(o);
  }
}
