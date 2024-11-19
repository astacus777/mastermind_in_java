import java.util.Random;


public class Main {
    
    
    public static void main(String[] args) {
        int number = getRandomNumber();
        String randomStr = String.valueOf(number);
        int userNumber = 0;
        boolean isEquel = false;

        System.out.println("Guess the 4-digit number!");
        //System.out.println("random number: " + number);

        while (!isEquel) {
            String num = GetNumber.getNumber();
            int clue1 = 0;
            int clue2 = 0;
            try {
                userNumber = Integer.parseInt(num);
                if (userNumber == number) {
                    isEquel = true;
                    System.out.println("Congratulations! You guessed the number: " + number);
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

    private static int getRandomNumber() {
        Random rand =  new Random();
        return   rand.nextInt(9999);
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