public class Main {
    public static void main(String[] args) {
        boolean play = true;

        System.out.println("Welcome to Mastermind where you have tu guess a 4-digit number.");

        // While loop to continue the game until the player decides to stop
        while(play) {
           // Creates a new instance of the Mastermind game
           Mastermind mastermind = new Mastermind();
           // Starts the game
           mastermind.startGame();
           // Checks if the player wants to play again
           play = UserInput.playAgain();
        }
        // Closes the Scanner resource
        UserInput.closeScanner();
        System.out.println("Thank you for playing!");
    }
}