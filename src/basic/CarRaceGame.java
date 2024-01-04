package basic;
import java.util.Random;
import java.util.Scanner;

public class CarRaceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int roadWidth = 10;
        int carPosition = roadWidth / 2;
        int score = 0;

        while (true) {

        	// Clear the console
            clearConsole();

            // Generate a random obstacle position
            int obstaclePosition = random.nextInt(roadWidth);

            // Display the road
            for (int i = 0; i < roadWidth; i++) {
                if (i == carPosition) {
                    System.out.print("C"); // Display the car
                } else if (i == obstaclePosition) {
                    System.out.print("X"); // Display the obstacle
                } else {
                    System.out.print("-"); // Display an empty road
                }
            }

            System.out.println("\nScore: " + score);
            System.out.println("Press 'L' to move left, 'R' to move right, or 'Q' to quit.");

            char userInput = scanner.nextLine().toUpperCase().charAt(0);

            // Update car position based on user input
            if (userInput == 'L' && carPosition > 0) {
                carPosition--;
            } else if (userInput == 'R' && carPosition < roadWidth - 1) {
                carPosition++;
            } else if (userInput == 'Q') {
                break; // Quit the game
            }

            // Move the obstacle down the road
            obstaclePosition++;

            // Check for collision
            if (obstaclePosition == carPosition) {
                System.out.println("Game Over! Your Score: " + score);
                break;
            }

            // Increment the score
            score++;

            // Delay for a short time to control game speed
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }

    // Helper method to clear the console screen
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
