//Driver Class
public class GamePlay {
  public static void Intro() {
    boolean readyToStart = false;
    while (!readyToStart) {
      System.out.println("BEHIND ENEMY LINES \n Welcome behind enemy lines. Type 'play' to play game, type 'help' for instructions")
      String response  = Keyboard.readString();
      if (reponse.equals("play")) {
        readyToStart = true;
      }
      else if (response.equals("help")) {
        System.out.println("Once you are on the battlefield, you will have to fend for yourself. \n"
        +"Some commands that might help: \n\n"
        +"attack - attacks specified enemy \n"
        +"search - look around at your surroundings \n"
        +"use <item> on <target> - uses specified item on target \n"
        +"go <cardinal direction> - go to your desired location \n"
        +"pickup <item> - pick up specified object"
        +"drop - drop item \n\n"
        +"Use these commands for your advantage. Good luck.");
      }
      else {
        System.out.println("invalid command");
      }
    }
  }
  public static String whatJustHappened(){
    String retStr = "You have just";
    return retStr;
  }
  public static void main(String[] args) {
   
}
}
