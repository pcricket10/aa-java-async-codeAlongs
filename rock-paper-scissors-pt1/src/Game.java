import java.util.Scanner;

public class Game {
    static Scanner console = new Scanner(System.in);
    // Rules of the game
    // rock beats scissors
    // paper beats rock
    // scissors beats paper
    public static void main(String[] args) {


        // we will want to take an input from the user - user choice
        // variables


        boolean exit = false;
        // human vs computer
        do {
            int userMove = getUserChoice();
            int computerMove = computerChoice();
            String userChoice = generateMove(userMove);
            String computerChoice = generateMove(computerMove);
            determineWinner(userChoice, computerChoice);
            exit = playAgain();



        } while (!exit);


//        // Human vs human
//        do{
//            int userOneMove = getUserChoice();
//            int userTwoMove = getUserChoice();
//            String userOneChoice = generateMove(userOneMove);
//            String userTwoChoice = generateMove(userTwoMove);
//            determineWinner(userOneChoice, userTwoChoice);
//            exit = playAgain();
//        } while(!exit);
//
//        // computer vs computer
//        int computerOneMove = computerChoice();
//        int computerTwoMove = computerChoice();
//        String computerOneChoice = generateMove(computerOneMove);
//        String computerTwoChoice = generateMove(computerTwoMove);
//        determineWinner(computerOneChoice, computerTwoChoice);

    } // this closes the main method

    // Refactor our game
    // grab the user choice
    public static int getUserChoice() {

            // variable for our validChoice
            boolean validChoice = false;
            int userChoice;
            // Get User Choice
            do {
                System.out.println("Please select your move [rock, paper, or scissors]: ");
                System.out.println("0. Rock");
                System.out.println("1. Paper");
                System.out.println("2. Scissors");
                userChoice = Integer.parseInt(console.nextLine());
                if (userChoice == 0 || userChoice == 1 || userChoice == 2 ){
                    validChoice = true;
                } else {
                    System.out.println("Error: invalid choice");
                }
            } while (!validChoice); // the loop will run as long as validChoice remains false
        return userChoice;
    }
    // grab the computer choice
    public static int computerChoice() {
        int random = (int) Math.floor(Math.random() * 3); // a random number between 0 and 2
        return random;

    }

    // generate a move
public static String generateMove(int playerChoice) {
        String move = null;
    switch (playerChoice) {
        case 0:
            move = "rock";
            break;
        case 1:
            move = "paper";
            break;
        case 2:
            move = "scissors";
            break;
        default: // this will never happen
            move = null;
    }
    return move;
}
    // determine a winner
    public static void determineWinner(String userOneChoice, String userTwoChoice) {
        String graphic = "L O A D I N G";
        for (int i = 0; i < graphic.length(); i++) {
            System.out.println(graphic.charAt(i));
        }

        //tie
        if (userTwoChoice.equalsIgnoreCase(userOneChoice)) {
            System.out.printf("You both picked %s, it's a tie!%n", userOneChoice);
        } else if (userTwoChoice.equalsIgnoreCase("rock") && userOneChoice.equalsIgnoreCase("paper")) {
            System.out.printf("the computer picked %s and you picked %s - You win!! Yay!%n", userTwoChoice, userOneChoice);
        } else if (userTwoChoice.equalsIgnoreCase("paper") && userOneChoice.equalsIgnoreCase("scissors")) {
            System.out.printf("the computer picked %s and you picked %s - You win!! Yay!%n", userTwoChoice, userOneChoice);
        } else if (userTwoChoice.equalsIgnoreCase("scissors") && userOneChoice.equalsIgnoreCase("rock")) {
            System.out.printf("the computer picked %s and you picked %s - You win!! Yay!%n", userTwoChoice, userOneChoice);
        } else {
            System.out.printf("the computer picked %s and you picked %s - You Lose! :(%n", userTwoChoice, userOneChoice);
        }
    }

    // play again
    public static boolean playAgain() {
        System.out.println("Would you like to play again? [y/n]:");
        String playAgain = console.nextLine();
        if (playAgain.equalsIgnoreCase("n")) {
            System.out.println("Thanks for playing! Goodbye!");
            return true;
        } else {
            return false;
        }
    }
} // this closes the class
