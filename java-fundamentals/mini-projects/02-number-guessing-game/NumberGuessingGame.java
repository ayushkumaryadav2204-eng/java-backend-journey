import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;

        // Generate a random number between min and max (inclusive)
        // Formula: random.nextInt(max - min + 1) + min
        int secretNumber = random.nextInt(max - min + 1) + min;

        int guess;
        int attempts = 0;

        System.out.println("===== Number Guessing Game =====");
        System.out.println("I have selected a number between " + min + " and " + max + ".");
        System.out.println("Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } 
            else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } 
            else {
                System.out.println("Congratulations! 🎉");
                System.out.println("You guessed the number in " + attempts + " attempts.");
            }

        } while (guess != secretNumber);

        scanner.close();
    }
}
