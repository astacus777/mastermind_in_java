import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);
    public static String getNumber() {
        boolean isValid = false; 
        String guess = "";
        int steps = 0;
        while (!isValid) {
            System.out.println("Please give me your best guess(just remember it has to be a 4-digit number!): ");
            guess = scanner.nextLine().trim();

            if (guess.matches("\\d{4}")) {
                steps++;
                System.out.println("This is your " + steps + " attempt"); 
                isValid = true;
            } else {
                System.out.println("I'm sorry but this is an Invalid input. Please Try again.");  
                steps++;
                System.out.println("This is your " + steps + " attempt");     
            }
        }
        return guess;
    }

    public static boolean playAgain() {
            while (true) { // Pętla do obsługi odpowiedzi użytkownika
                System.out.println("Would you like to play one more time? (type 'yes' to coninue or any key to finish)");
                String answer = scanner.nextLine().trim();
    
                if (answer.equalsIgnoreCase("yes")) {
                    return true;
                } else {
                    return false;
                }
            }
    }

    public static void closeScanner() {
        scanner.close();
    }
}
