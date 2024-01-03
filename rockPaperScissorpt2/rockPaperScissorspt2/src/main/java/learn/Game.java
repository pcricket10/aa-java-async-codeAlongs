package learn;

import learn.players.Computer;
import learn.players.Human;
import learn.players.Player;
import learn.players.PlayerHelper;

public class Game {
    // we need to create a play method to start the game
    public void play(){
        System.out.printf("Welcome to | %s | %s | %s | %n", PlayerHelper.ROCK, PlayerHelper.PAPER, PlayerHelper.SCISSORS);
        System.out.println();

        // create my players
        Player human = new Human();
        Player computer = new Computer();

        // prompt the human for a move
        String humanMove = human.generateMove();
        System.out.println();
        System.out.println("Good Luck.....");
        System.out.println();

        // randomly generate computer move
        String computerMove = computer.generateMove();
        System.out.println(determineWinner(humanMove, computerMove));
    }

    // need to determine the winner
    public String determineWinner(String humanMove, String computerMove){
        // ties
        if(computerMove.equalsIgnoreCase(humanMove)){
            return String.format("You both picked %s -- it's a tie!", humanMove);

        } else if (computerMove.equals(PlayerHelper.PAPER) && humanMove.equals(PlayerHelper.SCISSORS) ||
        computerMove.equals(PlayerHelper.ROCK) && humanMove.equals(PlayerHelper.PAPER) ||
        computerMove.equals(PlayerHelper.SCISSORS) && humanMove.equals(PlayerHelper.ROCK)){
            return String.format("The computer picked %s and you picked %s, you WIN🎉", computerMove, humanMove);
        } else {
            return String.format("The computer picked %s and you picked %s, you LOSE😢", computerMove, humanMove);
        }
    }
}
