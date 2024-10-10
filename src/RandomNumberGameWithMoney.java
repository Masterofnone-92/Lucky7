import java.util.Random;
import java.util.Scanner;

public class RandomNumberGameWithMoney {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Initialize player's money
        int money = 5;

        System.out.println("Welcome to the game! You have 5€ to start. Each game costs 1€.");

        // Game loop continues until the player runs out of money
        while (money > 0) {
            // Deduct 1€ for each game played
            money--;

            // Generate 3 random numbers between 1 and 10
            int[] randomNumbers = new int[3];
            int countSevens = 0;

            for (int i = 0; i < 3; i++) {
                randomNumbers[i] = random.nextInt(10) + 1;
                if (randomNumbers[i] == 7) {
                    countSevens++;
                }
            }

            // Print the three random numbers
            System.out.println("\nRandom numbers:");
            for (int num : randomNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Calculate winnings based on the number of 7s
            if (countSevens == 3) {
                System.out.println("Congratulations! All three numbers are 7. You win 10€!");
                money += 10;
            } else if (countSevens == 2) {
                System.out.println("Great! Two numbers are 7. You win 5€!");
                money += 5;
            } else if (countSevens == 1) {
                System.out.println("Good! One number is 7. You win 3€!");
                money += 3;
            } else {
                System.out.println("You lost this round.");
            }

            // Display remaining money
            System.out.println("You now have " + money + "€ left.");

            // Check if the player wants to continue or not
            if (money > 0) {
                System.out.println("Do you want to play again? (yes/no)");
                String playAgain = scanner.next();
                if (!playAgain.equalsIgnoreCase("yes")) {
                    break;
                }
            }
        }

        // End of game
        if (money == 0) {
            System.out.println("You have run out of money. Game over!");
        } else {
            System.out.println("Thanks for playing! You leave with " + money + "€.");
        }
      //Scanner closed
        scanner.close();
    }
}
