import java.util.Scanner;

public class Game {
    // Rules of the game
    // rock beats scissors
    // paper beats rock
    // scissors beats paper
    public static void main(String[] args) {

        // we will want to take an input from the user - user choice
        // variables
        Scanner console = new Scanner(System.in);
        String userChoice;
        System.out.println("Please select your move [rock, paper, or scissors]: ");
        userChoice = console.nextLine();



        // randomly generate a choice - computer choice
        int random = (int)Math.floor(Math.random() * 3); // a random number between 0 and 2
        String computerChoice = null;

        switch (random){
            case 0:
                computerChoice = "rock";
                break;
            case 1:
                computerChoice = "paper";
                break;
            case 2:
                computerChoice = "scissors";
                break;
            default: // this will never happen
                computerChoice = null;
        }
        System.out.println(computerChoice);
        // compare the choices and determine a winner

        //tie
        if(computerChoice.equalsIgnoreCase(userChoice)){
            System.out.printf("You both picked %s, it's a tie!%n", userChoice);
        } else if (computerChoice.equalsIgnoreCase("rock") && userChoice.equalsIgnoreCase("paper")) {
            System.out.printf("the computer picked %s and you picked %s - You win!! Yay!%n", computerChoice, userChoice);
        } else if (computerChoice.equalsIgnoreCase("paper") && userChoice.equalsIgnoreCase("scissors")) {
            System.out.printf("the computer picked %s and you picked %s - You win!! Yay!%n", computerChoice, userChoice);
        } else if (computerChoice.equalsIgnoreCase("scissors") && userChoice.equalsIgnoreCase("rock")) {
            System.out.printf("the computer picked %s and you picked %s - You win!! Yay!%n", computerChoice, userChoice);
        } else {
            System.out.printf("the computer picked %s and you picked %s - You Lose! :(%n", computerChoice, userChoice);
        }


    } // this closes the main method
} // this closes the class
