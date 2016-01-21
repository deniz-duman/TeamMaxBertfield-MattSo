//class User; subclass of Entities
public class User implements Entities{
  private int ammo;
  private double hunger;
  private int[] currlocation;
  private int xcoor, ycoor;
  
  public User(){
    
    name = "DT 24601";
    desc = "You are Droptrooper 24601";
    isAlive = true;
    hp = 100.0;
    dmg = 10.0;
    hunger = 0;
    ammo = 0;
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
  
  public double setHP(double newHealth) {
    double oldhp = hp;
    hp = newHelth;
    return hp;
  }
  
  public double getDMG() {
    return dmg;
  }
  
  public double setDMG(double newDMG) {
    double olddmg = dmg;
    dmg = newDmg;
    return olddmg;
  }
  public void attack(Entities ent) {
    ent.setHp(ent.getHP() - dmg);
  }
  
  public void setLoc(int x, int y) {
    currlocation[7] = x;
    xcoor = x;
    currlocation[4] = y;
    ycoor = y;
  }
  
}
