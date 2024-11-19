import java.util.Scanner;

public class GetNumber {
    private static final Scanner scanner = new Scanner(System.in);
    public static String getNumber() {
        boolean isValid = false; 
        String guess = "";
        while (!isValid) {
            System.out.println("What is your number: ");
            guess = scanner.nextLine();

            if (guess.matches("\\d{4}")) {
                isValid = true;
                System.out.println("Hello, your number is  " + guess);
            } else {
                System.out.println("Invalid input. Try again.");       
            }
        }
        return guess;
    }
    public static void closeScanner() {
        scanner.close();
    }
}
