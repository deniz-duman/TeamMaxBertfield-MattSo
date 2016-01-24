//Driver Class
import java.util.ArrayList;
public class GamePlay {
  public static Location[][] map = new Location[9][9];
  public static User DT = new User(); //makes user
  public static int searches = 3;
  //public static InputStreamReader isr;
  //public static BufferedReader in;
  
  public static void Run() {
    CreateWorld();
    Intro();
    play();
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
        +"search - look around at your surroundings; you only can use it three times during the course of the game.\n"
        +"use - uses specified item on a target \n"
        +"move - go to desired location \n"
        +"eat - eat food\n"
        +"talk - talk\n"
        +"inventory - view inventory \n"
        +"pick up - pick up specified object\n"
        +"drop - drop item from inventory\n\n"
        +"Use these commands for your advantage. Good luck.");
      }
      else {
        System.out.println("invalid command");
      }
    }
  }
  
  public static void play() { //play method to dictate gameplay
    while (DT.isAlive) {
      System.out.println(map[DT.getXcoor()][DT.getYcoor()]);
      System.out.println("Choose something to do:");
      String response = Keyboard.readString();
      if (response.equals("move")) {
	        move();
      }
      else if (response.equals("inventory")) {
            inventory();
      }
      else if (response.equals("drop")) {
            drop();
      }
      else if (response.equals("pick up")) {
            pickup();
      }
      else if (response.equals("attack")) {
      	    attack();
      }
      else if (response.equals("search")) {
      	    if (searches > 0) {
      	    	System.out.println("Entities at this location:" + map[DT.getXcoor()][DT.getYcoor()].printEnt());
      	    	System.out.println("Objects at this location:" + map[DT.getXcoor()][DT.getYcoor()].printObj());
      	    	searches -= 1;
      	    }
      	    else {
      	    	System.out.println("You do not have any searches left ya lazy.");
      	    }
      }
      else if (response.equals("eat")) {
      	eat();
      }
      else if (response.equals("use")) {
      	
      }
      else if (response.equals("talk")) {
      	talk();
      }
      else {
      	System.out.println("That is not a valid action.");
      }
    }
  }
  
  public static void use(){}
  
  public static void eat(){
  	System.out.println("Choose item to eat");
  	System.out.println(DT.toStringInv());
        String response = Keyboard.readString();	
  	for (Objects o : DT.getInv()) {
        	if (o instanceof Food && o.getType().equals(response)) {
              Food f = (Food)o;
            	DT.setHun(f.getFillinglvl());
            	DT.setHP(DT.getHP() + (double)(f.getFillinglvl() * 5.0));
            	return;
        	}
        	else {
            System.out.println("Don't eat that...that's not food."); 
            return;
          }
        }
        System.out.print(response + " is not in your inventory.");
  }

  
  public static void talk(){
  	System.out.println("Choose entity to talk to:");
  	String response = Keyboard.readString();
  	for (AI e: map[DT.getXcoor()][DT.getYcoor()].getEntArr()) {
  		if (e.getName().equals(response) && e.isFriend) {
  			System.out.println(e.getInfo());
  			return;
  		}
  		else {System.out.println("You can not talk to " + response + "."); return;}
  	}
  	System.out.println(response + " does not exist here.");
  }
  
  public static void attack(){
  	double dam = DT.getDMG(), dam2;
  	System.out.println("Choose weapon to use:");
  	System.out.println(DT.toStringInv());
  	String response = Keyboard.readString();
  	for (Objects o : DT.getInv()) {
        	if (o instanceof Weapons && o.getType().equals(response)) {
        		dam += ((double)(Math.random() * ((((Weapons)o).getDMG() + 4) - (((Weapons)o).getDMG() - 4)) + (((Weapons)o).getDMG() - 4)));
        	}
        	else {
        		System.out.println(response + " is not a weapon in your inventory.");
        	}
  	}
  	System.out.println(response + "is now equipped. Choose enemy to attack:");
  	for (AI e: map[DT.getXcoor()][DT.getYcoor()].getEntArr()) {
  		if (!e.getName().equals(response) || !e.isFriend) {
  			dam2 = (double)(Math.random() * ((e.getDMG() + 4) - (e.getDMG() - 4)) + (e.getDMG() - 4));
  			DT.attack(dam, e);
  			System.out.println(dam + " points of damage done to " + response);
  			e.attack(dam2, DT);
  			System.out.println(dam2 + " points of damage taken.");
  			if (DT.getHP() <= 0) {
          DT.die();
        }
  			if (e.getHP() <= 0) {
          e.die(); 
          dropAI(e); 
          map[DT.getXcoor()][DT.getYcoor()].DelEnt(e);
        }
  			return;
  		}
  		else {System.out.println(response + " is not an enemy."); return;}
  	}
  	System.out.println(response + " does not exist here.");
  }
  
  //move: go in desired direction
  public static void move(){
	System.out.println("Choose a cardinal direction:");
	String response = Keyboard.readString();
		if (response.equals("north")) {
			if (map[DT.getXcoor()][DT.getYcoor()+1].getPass()) {
				DT.setYcoor(DT.getYcoor()+1);
			}
			else {System.out.println("Cant go.");}
		}
		else if (response.equals("south")) {
			if (map[DT.getXcoor()][DT.getYcoor()-1].getPass()) {
				DT.setYcoor(DT.getYcoor()-1);
			}
			else {System.out.println("Cant go.");}
		}	
		
		else if (response.equals("east")) {
			if (map[DT.getXcoor()+1][DT.getYcoor()].getPass()) {
				DT.setXcoor(DT.getXcoor()+1);
			}
			else {System.out.println("Cant go.");}
		}
		else if (response.equals("west")) {
			if (map[DT.getXcoor()-1][DT.getYcoor()].getPass()) {
				DT.setXcoor(DT.getXcoor()-1);
			}
			else {System.out.println("Cant go.");}
		}
		else {
			System.out.println("That is not a cardinal direction.");
		}
  }

  //inventory: view inventory
  public static void inventory() {
    System.out.println(DT.toStringInv());
  }

  //drop: drop item from inventory
  public static void drop() {
     System.out.println("Choose an item in your inventory to drop:");
  	 System.out.println(DT.toStringInv());
     String response = Keyboard.readString();
     for (Objects o : DT.getInv()) {
        if (o.getType().equals(response)) {
            DT.delInv(o);
            map[DT.getXcoor()][DT.getYcoor()].AddtoObj(o);
            System.out.println("You have dropped your" + response);
            return;
        }
     }
    System.out.println("You have no " + response + " in your inventory");  
  }

  //pickup: pick up item from inventory
  public static void pickup() {
     System.out.println("Choose an item to pick up:");
     String response = Keyboard.readString();
     for (Objects o : map[DT.getXcoor()][DT.getYcoor()].getObjArr()) {
        if (o.getType().equals(response)) {
            DT.addInv(o);
            map[DT.getXcoor()][DT.getYcoor()].DelObj(o);
            System.out.println("You have picked up a " + response);
            return;
        }
     }
    System.out.println("There are no " + response + " around these parts");  
  }
  
    //drop: drop item from inventory
  public static void dropAI(AI a) {
     for (Objects o : a.getInv()) {
        map[DT.getXcoor()][DT.getYcoor()].AddtoObj(o);
        }
        System.out.println(a + "has been killed. Its items have been dropped.");
  }
  
  public static void main(String [] args) {
    Run();
}
}
