//Driver Class
public class GamePlay {
  
  public static void Run() {
    CreateWorld();
    Intro();
    play();
  }
  
  public static void CreateWorld() {
    User Bob = new User(); //makes user
    //hardcodes each location on the map
    //Row 0
    Location A = Location ("Sea", String "Nothing but ocean", {0,0}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {0,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {0,2}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {0,3}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {0,4}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {0,5}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {0,6}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {0,7}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {0,8}, [], [], false, false)
    //Row 1
    Location A = Location ("Sea", String "Nothing but ocean", {1,0}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,2}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,3}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,4}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,5}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,6}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,7}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,8}, [], [], false, false)
    //Row 2
    Location A = Location ("Sea", String "Nothing but ocean", {2,0}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {2,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {2,2}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {2,3}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {2,4}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {2,5}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {2,6}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {2,7}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {2,8}, [], [], false, false)
    //Row 
    Location A = Location ("Sea", String "Nothing but ocean", {3,0}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {3,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {3,2}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {3,3}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {3,4}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {3,5}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {3,6}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {3,7}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {3,8}, [], [], false, false)
    //Row 4
    Location A = Location ("Sea", String "Nothing but ocean", {4,0}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {4,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {4,2}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {4,3}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {4,4}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {4,5}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {4,6}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {4,7}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {4,8}, [], [], false, false)
    //Row 5
    Location A = Location ("Sea", String "Nothing but ocean", {5,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {5,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    //Row 6
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    //Row 7
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    //Row 8
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location A = Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    
  }
  public static void Intro() { //Intro Screen: Gives user choice of playing or seeing help menu
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
  
  public static void play() { //play method to dictate gameplay
    while 
  }
  public static String whatJustHappened(){
    String retStr = "You have just";
    return retStr;
  }
  public static void main(String[] args) {
    Intro();
    play();
}
}
