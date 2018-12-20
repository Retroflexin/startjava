import java.util.Scanner;
import java.util.Random;

public class MyFirstGame {

    public static void main(String[] args) {

        int random;
        int guess = 0;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        random = generator.nextInt(100) + 0; 

        System.out.print("I guessed an integer from 0 to 100, try to guess ");      

            do {
                guess = keyboard.nextInt(); 
                if (guess > random) {
            System.out.print("Less ");
            }  else if (guess < random) {
        System.out.print("More ");
    }
 } while (guess != random);
        System.out.print(random + " is correct answer");

    }        
}