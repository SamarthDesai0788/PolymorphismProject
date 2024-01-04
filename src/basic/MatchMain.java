package basic;
import java.util.*;
public class MatchMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the match format");
        
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        
        int formatChoice = scanner.nextInt();

        System.out.println("Enter the Current score");
        int currentScore = scanner.nextInt();

        System.out.println("Enter the current Over");
        float currentOver = scanner.nextFloat();

        System.out.println("Enter the Target Score");
        int target = scanner.nextInt();  
        Match match = null;
        switch (formatChoice) {
            case 1:
                match = new ODIMatch(currentScore, currentOver, target);
                break;
            case 2:
                match = new T20Match(currentScore, currentOver, target);
                break;
            case 3:				
                match = new TestMatch(currentScore, currentOver, target);
                break;
            default:
                System.out.println("Invalid format choice");
                break;
        }
        
        

        if (match != null) {
            float reqRunRate = match.calculateRunRate();
            int reqBalls = match.calculateBalls();
            match.display(reqRunRate, reqBalls);
        }
        scanner.close();
    }
}
