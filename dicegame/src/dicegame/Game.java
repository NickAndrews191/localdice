package dicegame;
import java.util.*;

public class Game {
  
   public void play() {
   
	   Scanner myObj = new Scanner(System.in);
	   System.out.println("would you like to play for 5 times the amount yes or no?");
	   String userinput = myObj.nextLine();
	 	   
	String yes =  "yes";
	if (yes.equals(userinput)) {  
      // get input from user
      Scanner scnr = new Scanner(System.in);
      System.out.print("How much do you want to bet? ");                                                 
      int enteredBet = scnr.nextInt(); 
      System.out.print("What number do you choose ? ");
      int enteredNum = scnr.nextInt(); 
   
      // generate the die roll 
      Random randGen = new Random();
      int dieNum1  = randGen.nextInt(6) + 1;
      int dieNum2  = randGen.nextInt(6) + 1;
      System.out.println("The die is a " + dieNum1 +" and " + dieNum2);
      
      
      if ( ( enteredBet == dieNum1) && (enteredBet == dieNum2 )) {
    	  int amountwon = enteredBet * 50;
    	  System.out.println("you win " + amountwon+" dollars!");    	  
      }
      
      else {   	  
    	  System.out.println("you lose");
      }
        
	}
	
	else {
	
		Scanner scnr = new Scanner(System.in);
	      System.out.print("How much do you want to bet? ");                                                 
	      int enteredBet = scnr.nextInt(); 
	      System.out.print("What number do you choose ? ");
	      int enteredNum = scnr.nextInt(); 
	   
	      // generate the die roll 
	      Random randGen = new Random();
	      int dieNum1  = randGen.nextInt(6) + 1;
	     
	      System.out.println("The die is a " + dieNum1 );
	      
	      
	      if ( enteredBet == dieNum1) {
	    	  int amountwon = enteredBet * 10;
	    	  System.out.println("you win " + amountwon+" dollars!");    	  
	      }
	      
	      else {   	  
	    	  System.out.println("you lose");
	      }
		
		
	}
      
      
   }
}
