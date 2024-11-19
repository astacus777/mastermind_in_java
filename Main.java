import java.util.Random;


public class Main {
    
    
    public static void main(String[] args) {
        
        String randomStr = getRandomNumber();
        boolean isEquel = false;
        System.out.println("Guess the 4-digit number!");
        System.out.println("random number: " + randomStr);

        while (!isEquel) {
            String num = GetNumber.getNumber();
            int clue1 = 0;
            int clue2 = 0;
            try {
                int userNumber = Integer.parseInt(num);
                if (userNumber == Integer.parseInt(randomStr)) {
                    isEquel = true;
                    System.out.println("Congratulations! You guessed the number: " + randomStr);
                } else {
                    clue1 = correctNumbers(num, randomStr);
                    clue2 = correctNumbers1(num, randomStr);
                    System.out.println("Wrong guess! Try again.");
                    System.out.println("number of correct numbers in correct places: " + clue1);
                    System.out.println("number of correct numbers: " + clue2);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a 4-digit number.");
            }
        }
        GetNumber.closeScanner();
    }

    private static String getRandomNumber() {
        Random rand =  new Random();
        int number = rand.nextInt(9999);
        return String.format("%04d", number);
    }
    
    private static int correctNumbers(String num, String str) {
        int number = 0;
        for (int i = 0; i< num.length(); i++) {
            if (num.charAt(i) == str.charAt(i)) {
                number++;
            }
        }
        return number;
    }
    private static int correctNumbers1(String num, String str) {
        int number = 0;
        for (int i = 0; i< num.length(); i++) {
            if (num.charAt(0) == str.charAt(i) || num.charAt(1) == str.charAt(i) || num.charAt(2) == str.charAt(i) || num.charAt(3) == str.charAt(i)) {
                number++;
            }
        }
        return number;
    }  
}