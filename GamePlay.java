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
    Location AA = new Location ("Sea", String "Nothing but ocean", {0,0}, [], [], false, false)
    Location AB = new Location ("Sea", String "Nothing but ocean", {0,1}, [], [], false, false)
    Location AC = new Location ("Sea", String "Nothing but ocean", {0,2}, [], [], false, false)
    Location AD = new Location ("Sea", String "Nothing but ocean", {0,3}, [], [], false, false)
    Location AE = new Location ("Sea", String "Nothing but ocean", {0,4}, [], [], false, false)
    Location AF = new Location ("Sea", String "Nothing but ocean", {0,5}, [], [], false, false)
    Location AG = new Location ("Sea", String "Nothing but ocean", {0,6}, [], [], false, false)
    Location AH = new Location ("Sea", String "Nothing but ocean", {0,7}, [], [], false, false)
    Location AI = new Location ("Sea", String "Nothing but ocean", {0,8}, [], [], false, false)
    //Row 1
    Location BA = new Location ("Sea", String "Nothing but ocean", {1,0}, [], [], false, false)
    Location BB = new Location ("Sea", String "Nothing but ocean", {1,1}, [], [], false, false)
    Location BC = new Location ("Sea", String "Nothing but ocean", {1,2}, [], [], false, false)
    Location BD = new Location ("Sea", String "Nothing but ocean", {1,3}, [], [], false, false)
    Location BE = new Location ("Sea", String "Nothing but ocean", {1,4}, [], [], false, false)
    Location BF = new Location ("Sea", String "Nothing but ocean", {1,5}, [], [], false, false)
    Location BG = new Location ("Sea", String "Nothing but ocean", {1,6}, [], [], false, false)
    Location BH = new Location ("Sea", String "Nothing but ocean", {1,7}, [], [], false, false)
    Location BI = new Location ("Sea", String "Nothing but ocean", {1,8}, [], [], false, false)
    //Row 2
    Location CA = new Location ("Sea", String "Nothing but ocean", {2,0}, [], [], false, false)
    Location CB = new Location ("Sea", String "Nothing but ocean", {2,1}, [], [], false, false)
    Location CC = new Location ("Sea", String "Nothing but ocean", {2,2}, [], [], false, false)
    Location CD = new Location ("Sea", String "Nothing but ocean", {2,3}, [], [], false, false)
    Location CE = new Location ("Sea", String "Nothing but ocean", {2,4}, [], [], false, false)
    Location CF = new Location ("Sea", String "Nothing but ocean", {2,5}, [], [], false, false)
    Location CG = new Location ("Sea", String "Nothing but ocean", {2,6}, [], [], false, false)
    Location CH = new Location ("Sea", String "Nothing but ocean", {2,7}, [], [], false, false)
    Location CI = new Location ("Sea", String "Nothing but ocean", {2,8}, [], [], false, false)
    //Row 
    Location DA = new Location ("Sea", String "Nothing but ocean", {3,0}, [], [], false, false)
    Location DB = new Location ("Sea", String "Nothing but ocean", {3,1}, [], [], false, false)
    Location DC = new Location ("Sea", String "Nothing but ocean", {3,2}, [], [], false, false)
    Location DD = new Location ("Sea", String "Nothing but ocean", {3,3}, [], [], false, false)
    Location DE = new Location ("Sea", String "Nothing but ocean", {3,4}, [], [], false, false)
    Location DF = new Location ("Sea", String "Nothing but ocean", {3,5}, [], [], false, false)
    Location DG = new Location ("Sea", String "Nothing but ocean", {3,6}, [], [], false, false)
    Location DH = new Location ("Sea", String "Nothing but ocean", {3,7}, [], [], false, false)
    Location DI = new Location ("Sea", String "Nothing but ocean", {3,8}, [], [], false, false)
    //Row 4
    Location EA = new Location ("Sea", String "Nothing but ocean", {4,0}, [], [], false, false)
    Location EB = new Location ("Sea", String "Nothing but ocean", {4,1}, [], [], false, false)
    Location EC = new Location ("Sea", String "Nothing but ocean", {4,2}, [], [], false, false)
    Location ED = new Location ("Sea", String "Nothing but ocean", {4,3}, [], [], false, false)
    Location EE = new Location ("Sea", String "Nothing but ocean", {4,4}, [], [], false, false)
    Location EF = new Location ("Sea", String "Nothing but ocean", {4,5}, [], [], false, false)
    Location EG = new Location ("Sea", String "Nothing but ocean", {4,6}, [], [], false, false)
    Location EH = new Location ("Sea", String "Nothing but ocean", {4,7}, [], [], false, false)
    Location EI = new Location ("Sea", String "Nothing but ocean", {4,8}, [], [], false, false)
    //Row 5
    Location FA = new Location ("Sea", String "Nothing but ocean", {5,0}, [], [], false, false)
    Location FB = new Location ("Sea", String "Nothing but ocean", {5,1}, [], [], false, false)
    Location FC = new Location ("Sea", String "Nothing but ocean", {5,2}, [], [], false, false)
    Location FD = new Location ("Sea", String "Nothing but ocean", {5,3}, [], [], false, false)
    Location FE = new Location ("Sea", String "Nothing but ocean", {5,4}, [], [], false, false)
    Location FF = new Location ("Sea", String "Nothing but ocean", {5,5}, [], [], false, false)
    Location FG = new Location ("Sea", String "Nothing but ocean", {5,6}, [], [], false, false)
    Location FH = new Location ("Sea", String "Nothing but ocean", {5,7}, [], [], false, false)
    Location FI = new Location ("Sea", String "Nothing but ocean", {5,8}, [], [], false, false)
    //Row 6
    Location GA = new Location ("Sea", String "Nothing but ocean", {6,0}, [], [], false, false)
    Location GB = new Location ("Sea", String "Nothing but ocean", {6,1}, [], [], false, false)
    Location GC = new Location ("Sea", String "Nothing but ocean", {6,2}, [], [], false, false)
    Location GD = new Location ("Sea", String "Nothing but ocean", {6,3}, [], [], false, false)
    Location GE = new Location ("Sea", String "Nothing but ocean", {6,4}, [], [], false, false)
    Location GF = new Location ("Sea", String "Nothing but ocean", {6,5}, [], [], false, false)
    Location GG = new Location ("Sea", String "Nothing but ocean", {6,6}, [], [], false, false)
    Location GH = new Location ("Sea", String "Nothing but ocean", {6,7}, [], [], false, false)
    Location GI = new Location ("Sea", String "Nothing but ocean", {6,8}, [], [], false, false)
    //Row 7
    Location HA = new Location ("Sea", String "Nothing but ocean", {7,0}, [], [], false, false)
    Location HB = new Location ("Sea", String "Nothing but ocean", {7,1}, [], [], false, false)
    Location HC = new Location ("Sea", String "Nothing but ocean", {7,2}, [], [], false, false)
    Location HD = new Location ("Sea", String "Nothing but ocean", {7,3}, [], [], false, false)
    Location HE = new Location ("Sea", String "Nothing but ocean", {7,4}, [], [], false, false)
    Location HF = new Location ("Sea", String "Nothing but ocean", {7,5}, [], [], false, false)
    Location HG = new Location ("Sea", String "Nothing but ocean", {7,6}, [], [], false, false)
    Location HH = new Location ("Sea", String "Nothing but ocean", {7,7}, [], [], false, false)
    Location HI = new Location ("Sea", String "Nothing but ocean", {7,8}, [], [], false, false)
    //Row 8
    Location IA = new Location ("Sea", String "Nothing but ocean", {8,0}, [], [], false, false)
    Location IB = new Location ("Sea", String "Nothing but ocean", {8,1}, [], [], false, false)
    Location IC = new Location ("Sea", String "Nothing but ocean", {8,2}, [], [], false, false)
    Location ID = new Location ("Sea", String "Nothing but ocean", {8,3}, [], [], false, false)
    Location IE = new Location ("Sea", String "Nothing but ocean", {8,4}, [], [], false, false)
    Location IF = new Location ("Sea", String "Nothing but ocean", {8,5}, [], [], false, false)
    Location IG = new Location ("Sea", String "Nothing but ocean", {8,6}, [], [], false, false)
    Location IH = new Location ("Sea", String "Nothing but ocean", {8,7}, [], [], false, false)
    Location II = new Location ("Sea", String "Nothing but ocean", {8,8}, [], [], false, false)
  
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
    Run();
}
}
