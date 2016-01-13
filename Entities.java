//class Entities: superclass for the players and all living things in the game.
public interface Entities {
  protected double hp, dmg;
  protected String name, desc;
  protected ArrayList<Objects> inventory;
  protected boolean isAlive;
  String getName();
  String getDesc();
  
  double getHP();
  double setHP(double newHealth); //should return old health
  double getDMG();
  double setDMG(double newDMG);
  void attack(double damage, Entities ent);
  
}
