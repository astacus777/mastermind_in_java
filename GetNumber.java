import java.util.Scanner;

public class GetNumber {
    private static final Scanner scanner = new Scanner(System.in);
    public static String getNumber() {
        boolean isValid = false; 
        String guess = "";
        while (!isValid) {
            System.out.println("Please give me your best guess(just remember it has to be a 4-digit number!): ");
            guess = scanner.nextLine();

            if (guess.matches("\\d{4}")) {
                isValid = true;
                //System.out.println("Well done, your number is  " + guess + " is correct.");
            } else {
                System.out.println("I'm sorry but this is an Invalid input. Please Try again.");       
            }
        }
        return guess;
    }
    public static void closeScanner() {
        scanner.close();
    }
}
