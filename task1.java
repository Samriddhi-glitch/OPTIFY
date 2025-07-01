import java.util.Scanner;
import java.util.Random;

public class task1 {

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        boolean win = false;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Loop until the user guesses the number
        while (!win) {
            System.out.print("Enter your guess: ");
            // Get the user's guess
            guess = scanner.nextInt();
            numberOfTries++;

            // Check if the guess is correct
            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

        // Congratulate the user
        System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
        
        // Close the scanner
        scanner.close();
    }
}
