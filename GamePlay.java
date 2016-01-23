//Driver Class
public class GamePlay {
  public static Location[][] map = new Location[9][9];
  //public static InputStreamReader isr;
  //public static BufferedReader in;
  
  public static void Run() {
    CreateWorld();
    Intro();
    User Bob = new User(); //makes user
    play(Bob);
  }
  
  public static void CreateWorld() {
    //hardcodes each location on the map
    //Row 0
    Location AA = new Location ("Sea", "Nothing but ocean",false, false);
    Location AB = new Location ("Sea", "Nothing but ocean",false, false);
    Location AC = new Location ("Sea", "Nothing but ocean",false, false);
    Location AD = new Location ("Sea",  "Nothing but ocean",false, false);
    Location AE = new Location ("Sea",  "Nothing but ocean",false, false);
    Location AF = new Location ("Sea",  "Nothing but ocean",false, false);
    Location AG = new Location ("Sea",  "Nothing but ocean",false, false);
    Location AH = new Location ("Sea",  "Nothing but ocean",false, false);
    Location AI = new Location ("Sea",  "Nothing but ocean",false, false);
    //Row 1
    Location BA = new Location ("Sea",  "Nothing but ocean",false, false);
    Location BB = new Location ("Sea",  "Nothing but ocean",false, false);
    Location BC = new Location ("Sea",  "Nothing but ocean",false, false);
    Location BD = new Location ("Sea",  "Nothing but ocean",false, false);
    Location BE = new Location ("Sea",  "Nothing but ocean",false, false);
    Location BF = new Location ("Sea",  "Nothing but ocean",false, false);
    Location BG = new Location ("Sea",  "Nothing but ocean",false, false);
    Location BH = new Location ("Sea",  "Nothing but ocean",false, false);
    Location BI = new Location ("Sea",  "Nothing but ocean",false, false);
    //Row 2
    Location CA = new Location ("Sea",  "Nothing but ocean",false, false);
    Location CB = new Location ("Sea",  "Nothing but ocean",false, false);
    Location CC = new Location ("Sea",  "Nothing but ocean",false, false);
    Location CD = new Location ("Sea",  "Nothing but ocean", false, false);
    Location CE = new Location ("Sea",  "Nothing but ocean",false, false);
    Location CF = new Location ("Sea",  "Nothing but ocean",false, false);
    Location CG = new Location ("Sea",  "Nothing but ocean",false, false);
    Location CH = new Location ("Sea",  "Nothing but ocean", false, false);
    Location CI = new Location ("Sea",  "Nothing but ocean", false, false);
    //Row 
    Location DA = new Location ("Sea",  "Nothing but ocean", false, false);
    Location DB = new Location ("Sea",  "Nothing but ocean", false, false);
    Location DC = new Location ("Sea",  "Nothing but ocean", false, false);
    Location DD = new Location ("Sea",  "Nothing but ocean", false, false);
    Location DE = new Location ("Sea",  "Nothing but ocean", false, false);
    Location DF = new Location ("Sea",  "Nothing but ocean", false, false);
    Location DG = new Location ("Sea",  "Nothing but ocean", false, false);
    Location DH = new Location ("Sea",  "Nothing but ocean", false, false);
    Location DI = new Location ("Sea",  "Nothing but ocean", false, false);
    //Row 4
    Location EA = new Location ("Sea",  "Nothing but ocean",false, false);
    Location EB = new Location ("Sea",  "Nothing but ocean", false, false);
    Location EC = new Location ("Sea",  "Nothing but ocean", false, false);
    Location ED = new Location ("Sea",  "Nothing but ocean", false, false);
    Location EE = new Location ("Sea",  "Nothing but ocean",false, false);
    Location EF = new Location ("Sea",  "Nothing but ocean",false, false);
    Location EG = new Location ("Sea",  "Nothing but ocean", false, false);
    Location EH = new Location ("Sea",  "Nothing but ocean", false, false);
    Location EI = new Location ("Sea",  "Nothing but ocean", false, false);
    //Row 5
    Location FA = new Location ("Sea",  "Nothing but ocean", false, false);
    Location FB = new Location ("Sea",  "Nothing but ocean", false, false);
    Location FC = new Location ("Sea",  "Nothing but ocean", false, false);
    Location FD = new Location ("Sea",  "Nothing but ocean", false, false);
    Location FE = new Location ("Sea",  "Nothing but ocean", false, false);
    Location FF = new Location ("Sea",  "Nothing but ocean", false, false);
    Location FG = new Location ("Sea",  "Nothing but ocean", false, false);
    Location FH = new Location ("Sea",  "Nothing but ocean", false, false);
    Location FI = new Location ("Sea",  "Nothing but ocean", false, false);
    //Row 6
    Location GA = new Location ("Sea",  "Nothing but ocean", false, false);
    Location GB = new Location ("Sea",  "Nothing but ocean", false, false);
    Location GC = new Location ("Sea",  "Nothing but ocean", false, false);
    Location GD = new Location ("Sea",  "Nothing but ocean", false, false);
    Location GE = new Location ("Field",  "Just a field.", true, false);
    Location GF = new Location ("Sea",  "Nothing but ocean", false, false);
    Location GG = new Location ("Sea",  "Nothing but ocean",false, false);
    Location GH = new Location ("Sea",  "Nothing but ocean", false, false);
    Location GI = new Location ("Sea",  "Nothing but ocean", false, false);
    //Row 7
    Location HA = new Location ("Sea",  "Nothing but ocean", false, false);
    Location HB = new Location ("Sea",  "Nothing but ocean", false, false);
    Location HC = new Location ("Sea",  "Nothing but ocean", false, false);
    Location HD = new Location ("Field",  "Just a field.", true, false);
    Location HE = new Location ("Field",  "You land in a field.", true, false);
    Location HF = new Location ("Field",  "Just a field.", true, false);
    Location HG = new Location ("Sea",  "Nothing but ocean", false, false);
    Location HH = new Location ("Sea",  "Nothing but ocean", false, false);
    Location HI = new Location ("Sea",  "Nothing but ocean", false, false);
    //Row 8
    Location IA = new Location ("Sea",  "Nothing but ocean", false, false);
    Location IB = new Location ("Sea",  "Nothing but ocean",false, false);
    Location IC = new Location ("Sea",  "Nothing but ocean", false, false);
    Location ID = new Location ("Sea",  "Nothing but ocean", false, false);
    Location IE = new Location ("Sea",  "Nothing but ocean", false, false);
    Location IF = new Location ("Sea",  "Nothing but ocean", false, false);
    Location IG = new Location ("Sea",  "Nothing but ocean", false, false);
    Location IH = new Location ("Sea",  "Nothing but ocean", false, false);
    Location II = new Location ("Sea",  "Nothing but ocean", false, false);
    
    //Assign each Location to a position on map
    map[0][0] = AA;
    map[0][1] = AB;
    map[0][2] = AC;
    map[0][3] = AD;
    map[0][4] = AE;
    map[0][5] = AF;
    map[0][6] = AG;
    map[0][7] = AH;
    map[0][8] = AI;
    
    map[1][0] = BA;
    map[1][1] = BB;
    map[1][2] = BC;
    map[1][3] = BD;
    map[1][4] = BE;
    map[1][5] = BF;
    map[1][6] = BG;
    map[1][7] = BH;
    map[1][8] = BI;
    
    map[2][0] = CA;
    map[2][1] = CB;
    map[2][2] = CC;
    map[2][3] = CD;
    map[2][4] = CE;
    map[2][5] = CF;
    map[2][6] = CG;
    map[2][7] = CH;
    map[2][8] = CI;
    
    map[3][0] = DA;
    map[3][1] = DB;
    map[3][2] = DC;
    map[3][3] = DD;
    map[3][4] = DE;
    map[3][5] = DF;
    map[3][6] = DG;
    map[3][7] = DH;
    map[3][8] = DI;
    
    map[4][0] = EA;
    map[4][1] = EB; 
    map[4][2] = EC;
    map[4][3] = ED;
    map[4][4] = EE;
    map[4][5] = EF;
    map[4][6] = EG;
    map[4][7] = EH;
    map[4][8] = EI;
    
    map[5][0] = FA;
    map[5][1] = FB;
    map[5][2] = FC;
    map[5][3] = FD;
    map[5][4] = FE;
    map[5][5] = FF;
    map[5][6] = FG;
    map[5][7] = FH;
    map[5][8] = FI;
    
    map[6][0] = GA;
    map[6][1] = GB;
    map[6][2] = GC;
    map[6][3] = GD;
    map[6][4] = GE;
    map[6][5] = GF;
    map[6][6] = GG;
    map[6][7] = GH;
    map[6][8] = GI;
    
    map[7][0] = HA;
    map[7][1] = HB;
    map[7][2] = HC;
    map[7][3] = HD;
    map[7][4] = HE;
    map[7][5] = HF;
    map[7][6] = HG;
    map[7][7] = HH;
    map[7][8] = HI;
    
    map[8][0] = IA;
    map[8][1] = IB;
    map[8][2] = IC;
    map[8][3] = ID;
    map[8][4] = IE;
    map[8][5] = IF;
    map[8][6] = IG;
    map[8][7] = IH;
    map[8][8] = II;
    
  }

  public static void Intro() { //Intro Screen; Gives user choice of playing or seeing help menu
    boolean readyToStart = false;
    while (!readyToStart) {
      System.out.println("BEHIND ENEMY LINES \n Welcome behind enemy lines. Type 'play' to play game, type 'help' for instructions");
       String response  = Keyboard.readString();
      if (response.equals("play")) {
        readyToStart = true;
      }
      else if (response.equals("help")) {//help menu
        System.out.println("`Once you are on the battlefield, you will have to fend for yourself. \n"
        +"Some commands that might help; \n\n"
        +"attack - attacks specified enemy \n"
        +"search - look around at your surroundings \n"
        +"use - uses specified item on a target \n"
        +"move - go to your desired location \n"
        +"pickup - pick up specified object"
        +"drop - drop item \n\n"
        +"Use these commands for your advantage. Good luck.");
      }
      else {
        System.out.println("invalid command");
      }
    }
  }
  
  public static void play(User b) { //play method to dictate gameplay
    while (b.isAlive) {
      System.out.println(map[b.getXcoor()][b.getYcoor()]);
      System.out.println("Choose something to do:");
      String response = Keyboard.readString();
      if (response.equals("move")) {
	move();
      }
      
      else if (response.equals("drop")) {
      	drop();
      }
      
    }
  }
  public void move(){
	System.out.println("Choose a cardinal direction:");
	String response = Keyboard.readString();
		if (response.equals("north")) {
			if (map[User.getXcoor()][User.getYcoor()+1].getPass()) {
				User.setYcoor(getYcoor()+1);
			}
			else {System.out.println(map[User.getXcoor()][User.getYcoor()+1].getDesc());}
		}
		else if (response.equals("south")) {
			if (map[User.getXcoor()][User.getYcoor()-1].getPass()) {
				User.setYcoor(getYcoor()-1);
			}
			else {System.out.println(map[User.getXcoor()][User.getYcoor()-1].getDesc());}
		}	
		
		else if (response.equals("east")) {
			if (map[User.getXcoor()+1][User.getYcoor()].getPass()) {
				User.setXcoor(getXcoor()+1);
			}
			else {System.out.println(map[User.getXcoor()+1][User.getYcoor()].getDesc());}
		}
		else if (response.equals("west")) {
			if (map[User.getXcoor()-1][User.getYcoor()].getPass()) {
				User.setXcoor(getXcoor()-1);
			}
			else {System.out.println(map[User.getXcoor()-1][User.getYcoor()].getDesc());}
		}
		else {
			System.out.println("That is not a cardinal direction.");
		}
  }
  
  public void drop() {
  	
  }
  
  



  public static void main(String [] args) {
    Run();
}
}
