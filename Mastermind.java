import java.util.Random;

// Main class to play the game
public class Mastermind {
    private String secretNumber = getRandomNumber();
    private boolean isEquel = false;

        // Method to start the game
        public void startGame() {

        // Uncomment to display the secret number for debugging
        // System.out.println("Random number (for debugging): " + secretNumber);
        int steps = 0;

        while (!isEquel) {
            String usersGuess = UserInput.getNumber();
            int clue1 = 0;
            int clue2 = 0;
            
            try {
                // Check if the user's guess matches the secret number
                
                int userNumber = Integer.parseInt(usersGuess);
                if (userNumber == Integer.parseInt(secretNumber)) {
                    isEquel = true;
                    steps ++;
                    System.out.println("Congratulations! You guessed the number: " + secretNumber);
                    System.out.println("Your score is: " + steps);
                } else {
                    // Provide clues
                    clue1 = correctPlacedNumbers(usersGuess, secretNumber);
                    clue2 = correctNumbers(usersGuess, secretNumber);
                    steps++;
                    System.out.println("This is your " + steps + " attempt");
                    System.out.println("Unfortunately, this is a wrong guess! Please try again.");
                    System.out.println("Here are some clues: ");
                    System.out.println(" - Correct digits in correct places: " + clue1);
                    System.out.println(" - Correct digits in any position:   " + clue2);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("ERROR.");
            }
        }
        
    }

    // Generates a random secret number
     private static String getRandomNumber() {
        Random rand =  new Random();
        int number = rand.nextInt(10000);
        return String.format("%04d", number);
    }
    
    // Function to check the number of correct digits in the correct positions
    private static int correctPlacedNumbers(String user, String secret) {
        int number = 0;
        for (int i = 0; i< user.length(); i++) {
            if (user.charAt(i) == secret.charAt(i)) {
                number++;
            }
        }
        return number;
    }

    // Function to check the total number of guessed digits, regardless of position
    private static int correctNumbers(String user, String secret) {
        int number = 0;
        boolean[] arr = new boolean[user.length()];

        for (int i=0; i<user.length(); i++){
            for (int j=0; j<secret.length(); j++ ) {
                if (user.charAt(i) == secret.charAt(j)  && !arr[j]) {
                    arr[j] = true;
                    number++;
                    break;
                }
            }
        }
        return number;
    }  
}
