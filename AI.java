//class AI; subclass of Entities.java
public class AI implements Entities{
  private String name, desc, info;
  public boolean isAlive? = true, isFriend;
  private double hp, dmg;
  private ArrayList<Objects> inventory = new ArrayList<Objects>();
  
  public AI (String n, String d, boolean fr, double hel, double dam, Objects o, String i) {
    name = n;
    desc = d;
    info = i;
    isFriend = fr;
    hp = hel;
    dmg = dam;
    inventory.add(o);
  }
  
  public String getInfo() {
    return info;
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

  public ArrayList<Objects> getInv() {
    return inventory;
  }

  public double setHP(double newHealth) { 
    double temp = hp;
    hp = newHealth;
    return temp;
  }
  
  public double getDMG() {
    return dmg;
  }
  
  public double setDMG(double newDMG) {
    double temp = dmg;
    dmg = newDMG;
    return dmg;
  }
  
   public void attack(double dam, User u) {
    u.setHP(u.getHP() - dam);
  }
  
}
