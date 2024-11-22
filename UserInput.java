// Scanner library attached
import java.util.Scanner;

public class UserInput {
    // A new instance of Scanner
    private static final Scanner scanner = new Scanner(System.in);
    public static String getNumber() {
        boolean isValid = false; 
        String guess = "";

        // Checks if the user input is meeting criteria
        while (!isValid) {
            try {
                System.out.println("Please give me your best guess (just remember it has to be a 4-digit number!): ");
                guess = scanner.nextLine().trim();
    
                if (guess.matches("\\d{4}")) {
                    isValid = true;
                } else {
                    System.out.println("I'm sorry but this is an Invalid input.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred while reading your input. Please try again.");
            }
           
        }
        return guess;
    }

    // Checks whether the player would like to continue the game or not
    public static boolean playAgain() {
            while (true) { 
                try {
                    System.out.println("Would you like to play one more time? (type 'yes' to continue or any key to finish)");
                    String answer = scanner.nextLine().trim();
        
                    if (answer.equalsIgnoreCase("yes")) {
                        return true;
                    } else {
                        return false;
                    } 
                }  catch (Exception e) {
                    System.out.println("An error occurred while reading your input. Please try again.");
                }
            }
    }

    // Closes the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
