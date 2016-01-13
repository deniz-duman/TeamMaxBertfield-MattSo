//class Entities: superclass for the players and all living things in the game.
public interface Entities {
  
  String getName();
  String getDesc();
  String getDialogue();
  
  int getHealth();
  int setHealth(int newHealth); //should return old health
  
  int[] getLoc();
  int[] setLoc(int newX int newY); //should return old location
  
  
}
