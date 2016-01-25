//Driver Class
import java.util.ArrayList;
public class GamePlay {
  public static Location[][] map = new Location[9][9];
  public static User DT = new User(); //makes user
public static Items nothing = new Items("nothing", "nothing", false);
    public static Items ladder = new Items("ladder", "tall ladder", true);
    public static Items box = new Items("box", "a box", false);
    public static Items fire = new Items("fire", "fire for cooking", false);
    public static Items fire2 = new Items("box", "fire for cooking", false);
    public static Items oak = new Items("oak", "oak tree", false);
    public static Items tree = new Items("tree", "tree with parachute", false);
    public static Items parachute = new Items("parachute", "a parachute", false);
    public static Items shinycoin = new Items("shiny coin", "shiny coin", true);
    public static Items knife = new Items("knife", "a sharp knife", true);
    public static Items rawvenison = new Items("rawvenison", "raw meat", true);
    public static Items rawvenison2 = new Items("rawvenison", "raw meat", true);
    public static Items cliff = new Items("Cliff", "Steep cliff; at the bottom is freedom", false);
    public static Items rope = new Items("Rope", "Cut from the parachute", true);
    public static Items axe = new Items("Axe", "Good for chopping wood", true);

    public static Weapons machinegun = new Weapons("mg", "deadly weapon", 15);
    public static Weapons chainsaw = new Weapons("chainsaw", "deadly weapon", 30);
    public static Weapons rpg = new Weapons("rpg", "deadly weapon", 50);
    public static Weapons sniper = new Weapons("sniper", "deadly weapon", 20);
    public static Weapons rifle = new Weapons("rifle", "deadly weapon", 15);
    public static Weapons smg = new Weapons("smg", "deadly weapon", 10);
    public static Weapons pistol = new Weapons("pistol", "deadly weapon", 5);
    public static Weapons pistol2 = new Weapons("pistol", "deadly weapon", 5);
    public static Weapons pistol3 = new Weapons("pistol", "deadly weapon", 5);
    public static Weapons pistol4 = new Weapons("pistol", "deadly weapon", 5);


    public static Food venison = new Food("venison", "yummy meat", 10);
    public static Food venison2 = new Food("venison", "yummy meat", 10);
    public static Food mre = new Food("meals ready to eat", "soo filling", 20);
  public static int searches = 5;
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
    Location AA = new Location ("Sea", "You try to go that way but the waves halt your advance, don't try to swim.",false, false);
    Location AB = new Location ("Sea", "You try to go that way but the waves halt your advance, don't try to swim.",false, false);
    Location AC = new Location ("Sea", "You try to go that way but the waves halt your advance, don't try to swim.",false, false);
    Location AD = new Location ("Landmine",  "You probably shouldn't go that way unless you want to blow up.",false, false);
    Location AE = new Location ("Landmine",  "You probably shouldn't go that way unless you want to blow up.",false, false);
    Location AF = new Location ("Landmine",  "You probably shouldn't go that way unless you want to blow up.",false, false);
    Location AG = new Location ("Landmine",  "You probably shouldn't go that way unless you want to blow up.",false, false);
    Location AH = new Location ("Landmine",  "You probably shouldn't go that way unless you want to blow up.",false, false);
    Location AI = new Location ("Landmine",  "You probably shouldn't go that way unless you want to blow up.",false, false);
    //Row 1
    Location BA = new Location ("Sea", "You try to go that way but the waves halt your advance, don't try to swim.",false, false);
    Location BB = new Location ("Cliff",  "If you feel like killing yourself, then yes run off that cliff.",false, false);
    Location BC = new Location ("Abandoned Warehouse", "This abandoned warehouse probably has a ladder. Theres a barbed wire field to the east...That would probably hurt a lot. You also hear a chainsaw start up. OH NO GOD HELP YOU ITS A NAZI CHAINSAW BEAR OR NCB FOR SHORT, KILL IT.",true, false);
    Location BD = new Location ("Barbed Wire",  "A field of barbed wire... Pretty hard to go through.",true, false);
    Location BE = new Location ("Destroyed Camp",  "This camp has been raided by a Nazi patrol. There is a survivor here.",true, false);
    Location BF = new Location ("Destryoed Camp",  "This camp has been raided by a nazi patrol. There might be weapons here.",true, false);
    Location BG = new Location ("Lake",  "Such a beautiful lake...probably filled with snakes, go somewhere else.",false, false);
    Location BH = new Location ("Cave",  "This is the hermit's cave you have heard about.",true, false);
    Location BI = new Location ("Landmine",  "You probably shouldn't go that way unless you want to blow up.",false, false);
    //Row 2
    Location CA = new Location ("Sea", "You try to go that way but the waves halt your advance, don't try to swim.",false, false);
    Location CB = new Location ("Cliff",  "If you feel like killing yourself, then yes run off that cliff.",false, false);
    Location CC = new Location ("Forest",  "You are in a dark forest, you hear some deer running around.",true, false);
    Location CD = new Location ("Nazi patrol",  "There is a Nazi Patrol here, they seem to be searching for some bear of some sorts...You probably shouldnt stay around to find out why.", true, false);
    Location CE = new Location ("Road",  "There is a road heading north from here. ",true, false);
    Location CF = new Location ("Abandoned House",  "This houe has been empty for pretty long. I could probably find a knife here.",true, false);
    Location CG = new Location ("Lake",  "Such a beautiful lake...probably filled with snakes, go somewhere else.",false, false);
    Location CH = new Location ("Forest",  "This forest is very dark, you see a rustling in the trees...probably a sniper.", true, false);
    Location CI = new Location ("Landmine",  "You probably shouldn't go that way unless you want to blow up.", false, false);
    //Row 
    Location DA = new Location ("Sea", "You try to go that way but the waves halt your advance, don't try to swim.", false, false);
    Location DB = new Location ("Beach", "You look around and as far as you can see, you see death, the thousands mowed down during the initial assault.", true, false);
    Location DC = new Location ("Cliff",  "If you feel like killing yourself, then yes run off that cliff.", false, false);
    Location DD = new Location ("Vantage Point",  "You climb the hill to see what you can see. To the northeast, by the river, you see an abandoned house. You could probably find utensils of sorts there.", true, false);
    Location DE = new Location ("Road",  "There is a road heading north. To the West you see a hill you could probably climb to look around.", true, false);
    Location DF = new Location ("River",  "That river is moving awefully fast, don't try to cross that dummy.", false, false);
    Location DG = new Location ("Forest",  "A dark forest...no point in being here.", true, false);
    Location DH = new Location ("Outpost",  "You find safe sanctuary here. There is a survivor here. There is also a fire you could probably use to cook food with.", true, false);
    Location DI = new Location ("Landmine",  "You probably shouldn't go that way unless you want to blow up.", false, false);
    //Row 4
    Location EA = new Location ("Boat", "After days of wandering and hardships, you finally arrive at a ship to take you to your squadron. YOU WIN!", true, true);
    Location EB = new Location ("Pier", "The pier is abandoned and covered with barbed wire...but at the end of the pier you spot your salvation, a boat!", true, false);
    Location EC = new Location ("Cliff",  "Hmm, this cliff seems to have a rock you can probably grapple down...", false, false);
    Location ED = new Location ("Cliffside",  "You arrive at the cliffside. There is a rock you could probably use to grapple down...if you had rope. There is also a nazi here...probably should do something about that.", true, false);
    Location EE = new Location ("Riveside",  "You are on the other side of the river, there is a road going north-south. There is also a fire you could use to cook here. There is a nazi camp to the South.",true, false);
    Location EF = new Location ("River",  "This river is moving awefully fast...but there seems to be a tree you can cut down to pass.",false, false);
    Location EG = new Location ("Forest",  "You are in a dark forest. There is an oak here. You also see a nazi.", true, false);
    Location EH = new Location ("Field",  "You land in a big open field, in the distance you hear gunshots. You check your pack and you seem to have lost your weapons. To the north you see an outpost.", true, false);
    Location EI = new Location ("Thick Forest",  "You probably shouldn't go in the forest, there are probably bears, or witches *shudders*.", false, false);
    //Row 5
    Location FA = new Location ("Sea", "You try to go that way but the waves halt your advance, don't try to swim.", false, false);
    Location FB = new Location ("Beach", "You look around and as far as you can see, you see death, the thousands mowed down during the initial assault.", true, false);
    Location FC = new Location ("Cliff",  "If you feel like killing yourself, then yes run off that cliff.", false, false);
    Location FD = new Location ("Road",  "There is a road here. It seems to turn West.", true, false);
    Location FE = new Location ("Road",  "There is a road here. It seems to turn South.", true, false);
    Location FF = new Location ("River",  "That river is moving awefully fast, don't try to cross that dummy.", false, false);
    Location FG = new Location ("Hunting Grounds",  "You see deer tracks everywhere. You also happen to see a deer.", true, false);
    Location FH = new Location ("Forest",  "A dark forest...no point in being here.", true, false);
    Location FI = new Location ("Thick Forest",  "You probably shouldn't go in the forest, there are probably bears, or witches *shudders*.", false, false);
    //Row 6
    Location GA = new Location ("Sea", "You try to go that way but the waves halt your advance, don't try to swim.", false, false);
    Location GB = new Location ("Cliff",  "If you feel like killing yourself, then yes run off that cliff.", false, false);
    Location GC = new Location ("Nazi Camp",  "Better be quiet...the Nazi's are sleeping. There are probably weapons here. There is a bunker to the South.", true, false);
    Location GD = new Location ("Nazi Camp",  "You arrive at the doors of a nazi camp. There is a guard...probably should kill him.", true, false);
    Location GE = new Location ("River",  "That river is moving awefully fast, don't try to cross that dummy.", true, false);
    Location GF = new Location ("Town",  "You arrive at a town. As you arrive , you see a nazi pick up a shiny coin. there is a bakery to the South.", true, false);
    Location GG = new Location ("Forest",  "A dark forest...no point in being here.",true, false);
    Location GH = new Location ("Forest",  "A dark forest. There is a nazi here.", true, false);
    Location GI = new Location ("Thick Forest",  "You probably shouldn't go in the forest, there are probably bears, or witches *shudders*.", false, false);
    //Row 7
    Location HA = new Location ("Sea", "You try to go that way but the waves halt your advance, don't try to swim.", false, false);
    Location HB = new Location ("Cliff",  "If you feel like killing yourself, then yes run off that cliff.", false, false);
    Location HC = new Location ("Bunker",  "You enter an abandoned bunker. There is probably some food here you can take.", true, false);
    Location HD = new Location ("Nazi Camp",  "You enter prisoner quarters. There is a prisoner here.", true, false);
    Location HE = new Location ("River",  "That river is moving awefully fast, don't try to cross that dummy.", false, false);
    Location HF = new Location ("Bakery",  "You enter the bakery. It seems pillaged, no food here. The baker is still here, he looks devastated.", true, false);
    Location HG = new Location ("Town",  "An abandoned town. The townspeople must have left when the invasion began. There is an armory to the East.", true, false);
    Location HH = new Location ("Armory",  "You find an armory. It seems to be mostly empty except for a pistol.", true, false);
    Location HI = new Location ("Thick Forest",  "You probably shouldn't go in the forest, there are probably bears, or witches *shudders*.", false, false);
    //Row 8
    Location IA = new Location ("Sea", "You try to go that way but the waves halt your advance, don't try to swim.", false, false);
    Location IB = new Location ("Mountain",  "If you try to climb the mountain, you will probably starve or freeze or both. Go somewhere else.",false, false);
    Location IC = new Location ("Mountain",  "If you try to climb the mountain, you will probably starve or freeze or both. Go somewhere else.", false, false);
    Location ID = new Location ("Mountain",  "If you try to climb the mountain, you will probably starve or freeze or both. Go somewhere else.", false, false);
    Location IE = new Location ("Mountain",  "If you try to climb the mountain, you will probably starve or freeze or both. Go somewhere else.", false, false);
    Location IF = new Location ("Mountain",  "If you try to climb the mountain, you will probably starve or freeze or both. Go somewhere else.", false, false);
    Location IG = new Location ("Mountain",  "If you try to climb the mountain, you will probably starve or freeze or both. Go somewhere else.", false, false);
    Location IH = new Location ("Thick Forest",  "You probably shouldn't go in the forest, there are probably bears, or witches *shudders*.", false, false);
    Location II = new Location ("Thick Forest",  "You probably shouldn't go in the forest, there are probably bears, or witches *shudders*.", false, false);
    
    //Assign each Location to a position on map
    map[0][0] = AA;
    map[1][0] = AB;
    map[2][0] = AC;
    map[3][0] = AD;
    map[4][0] = AE;
    map[5][0] = AF;
    map[6][0] = AG;
    map[7][0] = AH;
    map[8][0] = AI;
    
    map[0][1] = BA;
    map[1][1] = BB;
    map[2][1] = BC;
    map[3][1] = BD;
    map[4][1] = BE;
    map[5][1] = BF;
    map[6][1] = BG;
    map[7][1] = BH;
    map[8][1] = BI;
    
    map[0][2] = CA;
    map[1][2] = CB;
    map[2][2] = CC;
    map[3][2] = CD;
    map[4][2] = CE;
    map[5][2] = CF;
    map[6][2] = CG;
    map[7][2] = CH;
    map[8][2] = CI;
    
    map[0][3] = DA;
    map[1][3] = DB;
    map[2][3] = DC;
    map[3][3] = DD;
    map[4][3] = DE;
    map[5][3] = DF;
    map[6][3] = DG;
    map[7][3] = DH;
    map[8][3] = DI;
    
    map[0][4] = EA;
    map[1][4] = EB; 
    map[2][4] = EC;
    map[3][4] = ED;
    map[4][4] = EE;
    map[5][4] = EF;
    map[6][4] = EG;
    map[7][4] = EH;
    map[8][4] = EI;
    
    map[0][5] = FA;
    map[1][5] = FB;
    map[2][5] = FC;
    map[3][5] = FD;
    map[4][5] = FE;
    map[5][5] = FF;
    map[6][5] = FG;
    map[7][5] = FH;
    map[8][5] = FI;
    
    map[0][6] = GA;
    map[1][6] = GB;
    map[2][6] = GC;
    map[3][6] = GD;
    map[4][6] = GE;
    map[5][6] = GF;
    map[6][6] = GG;
    map[7][6] = GH;
    map[8][6] = GI;
    
    map[0][7] = HA;
    map[1][7] = HB;
    map[2][7] = HC;
    map[3][7] = HD;
    map[4][7] = HE;
    map[5][7] = HF;
    map[6][7] = HG;
    map[7][7] = HH;
    map[8][7] = HI;
    
    map[0][8] = IA;
    map[1][8] = IB;
    map[2][8] = IC;
    map[3][8] = ID;
    map[4][8] = IE;
    map[5][8] = IF;
    map[6][8] = IG;
    map[7][8] = IH;
    map[8][8] = II;
    

    AI ncb = new AI("ncb", "A crazy bear with a chainsaw", false, 100, 20, chainsaw, "");
    AI survivor = new AI("survivor", "A survivor", true, 100, 100, nothing, "As the Nazi's were attacking, our commander escaped to the shore and escaped on a boat. He left a boat for any survivors. The boat is on the pier to the West, down the cliffs.");
    AI hermit = new AI("hermit", "A lonely hermit who lives in a cave", true, 100, 100, nothing, "INEEEDSMAHSHINEEYYCOINSSESISEESNAHTZIWITITGOTOTOWNANDGETMICOINNNNNPUTINBOXANDIHASPRESENTFORYOUSE");
    AI deer = new AI("deer", "deer is alone in the forest", false, 20, 0, rawvenison, "");
    AI deer2 = new AI("deer", "deer is alone in the forest", false, 20, 0, rawvenison2, "");
    AI patrol = new AI("patrol", "He has a machine gun", false, 50, 10, machinegun, "");
    AI snipernazi = new AI("sniper", "Sniper dude", false, 40, 15, sniper, "");
    AI ranger = new AI("ranger", "Ally looking to help", true, 100, 100, nothing, "You probably want to return to your squadron. Well you're going to have to wait till night. In the meanwhile get some food. There's a bakery in the town to the south. After you get food, you should go North, there is a hermit who knows these lands. Be careful though, there is a sniper.");
    AI nazi1 = new AI("nazi", "Nazi with rifle", false, 30, 10, rifle, "");
    AI nazi2 = new AI("nazi", "Nazi with pistol", false, 30, 5, pistol2, "");
    AI nazi3 = new AI("nazi", "Nazi with pistol", false, 30, 5, pistol3, "");
    AI guard = new AI("guard", "Nazi guarding the base", false, 50, 5, pistol4, "");
    AI naziwithcoin = new AI("nazi", "Nazi soldier", false, 30, 10, shinycoin, "");
    AI prisoner = new AI("prisoner", "prisoner", true, 100, 100, nothing, "There was an American camp to the north along the road. But I heard the Nazi's were snding a patrol there to check it out. You should get there asap. Also you might wanna check the camp.");
    AI baker = new AI("baker", "a sad baker", true, 100, 100, nothing, "There is no food here but there is a hunting ground to the North in the forest. Watch out for Nazi's.");


    box.addComp(shinycoin);
    oak.addComp(axe);
    tree.addComp(ladder);
    parachute.addComp(knife);
    cliff.addComp(rope);
    rawvenison.addComp(fire);

    
    BC.AddtoObj(ladder);
    BF.AddtoObj(rpg);
    BH.AddtoObj(box);
    CF.AddtoObj(knife);
    DH.AddtoObj(fire);
    EE.AddtoObj(fire2);
    EG.AddtoObj(oak);
    EH.AddtoObj(tree);
    EH.AddtoObj(parachute);
    GC.AddtoObj(smg);
    HC.AddtoObj(mre);
    HH.AddtoObj(pistol);
    CH.AddtoObj(axe);
    
    BC.AddtoEnt(ncb);
    BE.AddtoEnt(survivor);
    BH.AddtoEnt(hermit);
    CC.AddtoEnt(deer);
    CD.AddtoEnt(patrol);
    CH.AddtoEnt(snipernazi);
    DH.AddtoEnt(ranger);
    ED.AddtoEnt(nazi1);
    EG.AddtoEnt(nazi2);
    FG.AddtoEnt(deer2);
    GD.AddtoEnt(guard);
    GF.AddtoEnt(naziwithcoin);
    GH.AddtoEnt(nazi3);
    HD.AddtoEnt(prisoner);
    HF.AddtoEnt(baker);
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
    while (DT.isAlive && !map[DT.getXcoor()][DT.getYcoor()].getGoal()) {
      System.out.println(map[DT.getXcoor()][DT.getYcoor()]);
      System.out.println("HP: " + DT.getHP());
      System.out.println("Hunger: " + DT.getHun());
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
        use();
      }
      else if (response.equals("talk")) {
        talk();
      }
      else if (response.equals("help")) {
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
        System.out.println("That is not a valid action.");
      }
      if (DT.getHun() <= 0) {DT.die();}
    }
    if (DT.getHun() <= 0) {System.out.println("You have died. You have failed the US Army.");}
    else {
      System.out.println("You Win! Here's the map: \n" + mapper());
    }
  }
  
  public static void use(){
    System.out.println("What do you want to use?");
    System.out.println(DT.toStringInv());
    String response = Keyboard.readString();
    //if item selected is food
    for (Objects o : DT.getInv()) {
      if (o instanceof Food && o.getType().equals(response)) {
        Food f = (Food)o;
        DT.setHun(f.getFillinglvl());
        DT.setHP(DT.getHP() + (double)(f.getFillinglvl() * 5.0));
        return;
      }
    //if item selected is gun
      else if (o instanceof Weapons && o.getType().equals(response)) {
        double dam = DT.getDMG(), dam2;
        dam += ((double)(Math.random() * ((((Weapons)o).getDMG() + 4) - (((Weapons)o).getDMG() - 4)) + (((Weapons)o).getDMG() - 4)));
        System.out.println(response + "is now equipped. Choose enemy to attack:");
        String response2 = Keyboard.readString();
        for (AI e: map[DT.getXcoor()][DT.getYcoor()].getEntArr()) {
          if (!e.getName().equals(response2) || !e.isFriend) {
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
          }
          System.out.println(response2 + " is not an enemy."); 
          return;
      }
      else if (o instanceof Items && o.getType().equals(response)) {
        System.out.println("Use " + response + " with:");
        String response2 = Keyboard.readString();
        for (Objects O: map[DT.getXcoor()][DT.getYcoor()].getObjArr()) {
          if (O instanceof Items && O.getType().equals(response2)) {
            Items i = (Items)O;
            if (i.isCompatible((Items)o)) {
              System.out.println("You used " + response + " on " + response2);
              //calling specific consequence methods:
              if (o.getType().equals("fire") && i.getType().equals("raw venison")) {
                firerawvenison();
              }
              if (o.getType().equals("shiny coin") && i.getType().equals("box")) {
                shinycoinbox();
              }
              if (o.getType().equals("axe") && i.getType().equals("oak")) {
                axeoak();
              }
              if (o.getType().equals("ladder") && i.getType().equals("tree")) {
                laddertree();
              }
              if (o.getType().equals("knife") && i.getType().equals("parachute")) {
                axeoak();
              }
              if (o.getType().equals("rope") && i.getType().equals("cliff")) {
                ropecliff();
              }
            }
          }
        }
      }
    }
  }



  public static void firerawvenison() {
    DT.delInv(rawvenison);
    DT.addInv(venison);
    System.out.println("You cooked the venison, you can safely eat it now.");
  }

  public static void shinycoinbox() {
    DT.delInv(shinycoin);
    DT.addInv(axe);
    System.out.println("You put the shiny coin in the box. In return, the hermit rewards  you with an axe. \nHe tells you to go to chop down the tall tree near the river and use it to get to the other side.");
  }

  public static void axeoak() {
    map[4][5].setPass(true);
    System.out.println("You chop down the tree, which falls across the river, allowing you to cross it.");
    map[4][5].setDesc("The fallen oak has created a path across the rushing river; be careful, don't fall in.");
    map[4][5].DelObj(oak);
  }

  public static void laddertree() {
    DT.delInv(ladder);
    DT.addInv(parachute);
    map[4][7].setDesc("This is where you crashed.");
    System.out.println("You climbed up the ladder to get the parachute. Its torn, but some parts can come in really handy.");
  }

  public static void knifeparachute() {
    DT.delInv(parachute);
    DT.addInv(rope);
    System.out.println("You use the knife to get the rope from the parachute. You now have what you need to get down the cliff.");
  }

  public static void ropecliff() {
    DT.delInv(rope);
    map[4][2].setPass(true);
    System.out.println("You use the rope to rappel down the cliff. You have reached the beach. In the east is the pier. You are so close to safety.");
  }
  
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
    System.out.println(response + " is now equipped. Choose enemy to attack:");
    response = Keyboard.readString();
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
      if (map[DT.getXcoor()][DT.getYcoor()-1].getPass()) {
        DT.setYcoor(DT.getYcoor()-1);
        DT.setHun(-1);
      }
      else {System.out.println(map[DT.getXcoor()][DT.getYcoor()-1].getDesc());}
    }
    else if (response.equals("south")) {
      if (map[DT.getXcoor()][DT.getYcoor()+1].getPass()) {
        DT.setYcoor(DT.getYcoor()+1);
        DT.setHun(-1);
      }
      else {System.out.println(map[DT.getXcoor()][DT.getYcoor()+1].getDesc());}
    } 
    
    else if (response.equals("east")) {
      if (map[DT.getXcoor()+1][DT.getYcoor()].getPass()) {
        DT.setXcoor(DT.getXcoor()+1);
        DT.setHun(-1);
      }
      else {System.out.println(map[DT.getXcoor()+1][DT.getYcoor()].getDesc());}
    }
    else if (response.equals("west")) {
      if (map[DT.getXcoor()-1][DT.getYcoor()].getPass()) {
        DT.setXcoor(DT.getXcoor()-1);
        DT.setHun(-1);
      }
      else {System.out.println(map[DT.getXcoor()-1][DT.getYcoor()].getDesc());}
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
  
  public static String mapper(){
    String retstr = "";
    for (Location[] m: map) {
    for (Location l: m) {
            retstr += l.getName() + "\t";}
    }
    return retstr;
  }
  
  public static void main(String [] args) {
    Run();
}
}
