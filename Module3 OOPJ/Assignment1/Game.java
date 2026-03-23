// Create a number guessing game.

import java.util.Scanner;
public class Game {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
      	int K = 5;

        System.out.println("A number is chosen between 1 and 100.");
        System.out.println("You have "+K+" attempts to guess the Correct Number.");

        for (int i = 0; i < K; i++) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            if (guess == number) {
                System.out.println("Correct Guess.");
            }
            else {
                System.out.println("Try Again");
            }
        }

        System.out.println("You've exhausted all attempts. The correct number was: "+ number);
    }
}
/*
Output:
A number is chosen between 1 and 100.
You have 5 attempts to guess the Correct Number.
Enter your guess: 4
Try Again
Enter your guess: 5
Try Again
Enter your guess: 6
Try Again
Enter your guess: 7
Try Again
Enter your guess: 8
Try Again
You've exhausted all attempts. The correct number was: 13
*/
