//class Entities: superclass for the players and all living things in the game.
public interface Entities {
  
  String getName();
  String getDesc();
  
  double getHP();
  double setHP(double newHealth); //should return old health
  double getDMG();
  double setDMG(double newDMG);

  
}
