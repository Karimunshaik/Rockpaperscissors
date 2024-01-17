package javaApplication;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorsgame {
	public static void main(String[] args) {
     
        String[] choices = {"Rock", "Paper", "Scissors"};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get user choice
            System.out.print("Enter your choice (Rock/Paper/Scissors) or 'exit' to quit: ");
            String userChoice = scanner.nextLine();

            // Check if the user wants to exit
            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            // Validate user input
            if (!userChoice.equalsIgnoreCase("Rock") && !userChoice.equalsIgnoreCase("Paper") &&
                !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            // Generate computer choice
            Random random = new Random();
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            // Display choices
            System.out.println("Player's choice: " + userChoice);
            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        scanner.close();
    }
}
