//class AI; subclass of Entities.java
public class AI implements Entities{
  private String name, desc;
  private boolean isAlive? = true, isFriend?;
  private double hp, dmg;
  private ArrayList<Objects> inventory = new ArrayList<Objects>();
  
  public AI (String n, String d, boolean fr, double hel, double dam, Objects o) {
    name = n;
    desc = d;
    isFriend? = fr;
    hp = hel;
    dmg = dam;
    inventory.add(o);
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
  
   public void attack(User u) {
    u.setHP(u.getHP() - ((double)(Math.random() * ((dmg + 4) - (dmg - 4)) + (dmg - 4))));
  }
  
}
