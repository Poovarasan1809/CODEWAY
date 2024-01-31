import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guess the Number game!!!");

        int maximumAttempts = 10;
        int roundsYouWon = 0;

        while (true) {
            // Generate a random number within the specified range
            int secretNumber = random.nextInt(100) + 1;

            // Limit the number of attempts by the Game Authority
            int attempts = 0;

            while (attempts < maximumAttempts) {
                // Entering the guess number of the user within specified range
                System.out.print("Guess the number (between 1 and 100): ");
                int userGuessNumber = scanner.nextInt();

                // Comparing user's guess to the secret number and provide feedback
                if (userGuessNumber == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber +
                            " in " + (attempts + 1) + " attempts.");
                    roundsYouWon++;
                    break;
                } else if (userGuessNumber < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            if (attempts == maximumAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " +
                        secretNumber + ".");
            }

            // Ask the user if they want to play this game again
            System.out.print("Do you want to play this curious game again? (Yes/No): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("Yes")) {
                break;
            }
        }

        // Display the user's score
        System.out.println("Rounds won: " + roundsYouWon);

        scanner.close();
    }
}
