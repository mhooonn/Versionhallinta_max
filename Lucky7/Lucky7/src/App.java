import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int randomNumber1 = 0;
        int randomNumber2 = 0;
        int randomNumber3 = 0;
        int raha = 5;
        int panos;
        String pelaaUudestaan;
        
        while (true) {
        System.out.println("Syötä panos 1-5$");
        panos = in.nextInt();
        System.out.println("Panos " + panos + "$");
        randomNumber1 = random.nextInt(10)+1;
        System.out.println(randomNumber1);        
        randomNumber2 = random.nextInt(10)+1;
        System.out.println(randomNumber2);
        randomNumber3 = random.nextInt(10)+1;
        System.out.println(randomNumber3);
        raha-=panos;

        
        if (randomNumber1 == 7 && randomNumber2 == 7 || randomNumber2 == 7 && randomNumber3 == 7 || randomNumber1 == 7 && randomNumber3 == 7) {
            System.out.println("voitit 5$");
            raha+=5;
        }                
        else if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7) {
            System.out.println("voitit 3$");
            raha+=3;
            System.out.println("saldo " + raha + "$");
        }                 
        else {
            System.out.println("saldo " + raha + "$");
        }
        
        System.out.println("Haluatko pelata uudestaan? Jos haluat pelata, paina Enter. Jos et halua pelata, kirjoita e ja paina Enter");
        pelaaUudestaan = in.nextLine();
        
        if (pelaaUudestaan.equalsIgnoreCase("e")) {
            break;
        }

    }


    }
}
