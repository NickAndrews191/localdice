package dicegame;

import java.util.Scanner;

public class GameStart {
 
   public static void main(String[] args) {
      System.out.println("Let's play!");
      Game g = new Game();
      g.play();
      System.out.println("Would you like to play again yes or no?");
      Scanner myObj = new Scanner(System.in);
      String userinput = myObj.nextLine();
      String yes =  "yes";
      
      int i = 0;
      
     
      if (yes.equals(userinput)) { 
    	  g.play();
      }
      else {
    	  
    	 System.out.println("Thanks for playing");
    	
      }
   }
   
}
