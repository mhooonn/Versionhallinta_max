import java.util.Scanner;  

public class App {
    public static void main(String[] args) throws Exception {
         
        // adding variables
    Scanner in = new Scanner (System.in);
    String name = "";       
    int counter = 0;
        
        // loop to guess name
    while (!name.equalsIgnoreCase("Emma")) {
        System.out.println("Guess my name (type stop to exit)");        
        name = in.nextLine();
                   
        if (name.equalsIgnoreCase("stop")) {
                break;
        }
        counter++;
        if (name.equalsIgnoreCase("Emma")) {
        System.out.println("Congratulations!");
                break; 
        }
    } // end of loop
        
    System.out.println("You guessed " + counter + " times.");
    }// end of main
}
