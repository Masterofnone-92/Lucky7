import java.util.Random;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate 3 random numbers between 1 and 10
        int[] randomNumbers = new int[3];
        for (int i = 0; i < 3; i++) {
            randomNumbers[i] = random.nextInt(10) + 1;
        }

        // Print the three random numbers
        System.out.println("Random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Check if one of the numbers is 7
        boolean won = false;
        for (int num : randomNumbers) {
            if (num == 7) {
                won = true;
                break;
            }
        }

        // Print the result
        if (won) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}