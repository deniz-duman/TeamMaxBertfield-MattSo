//class User; subclass of Entities
public class User implements Entities{
  double hunger;
  public User(){
    
    name = "DT 24601";
    desc = "You are Droptrooper 24601";
    inventory.add(Weapon gun);
    inventory.add(Weapon ammo);
    isAlive = true;
    hp = 100.0;
    dmg = 100.0;
    hunger = 0;
    
  }
}
