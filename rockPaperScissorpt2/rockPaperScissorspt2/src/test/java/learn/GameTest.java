package learn;

import learn.players.PlayerHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// 3 A's of Testing
// Arrange - set up our test environment
// Act - this is where we invoke our methods, run our code, etc.
// Assert - check that the output we get is what we are expecting
class GameTest {
    // arrange
    Game game = new Game();


    // ties are working
    @Test
    void twoOfTheSameInputsShouldTie(){
        // arrange
        String result = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.ROCK);
        // assert
        assertNotNull(result);
        assertEquals(String.format("You both picked %s -- it's a tie!", PlayerHelper.ROCK), result);

        // arrange
        result = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.PAPER);
        // assert
        assertNotNull(result);
        assertEquals(String.format("You both picked %s -- it's a tie!", PlayerHelper.PAPER), result);

        // arrange
        result = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.SCISSORS);
        // assert
        assertNotNull(result);
        assertEquals(String.format("You both picked %s -- it's a tie!", PlayerHelper.SCISSORS), result);

    }

    // happy path - win conditions are working
    @Test
    void rockShouldBeatScissors(){
        String result = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.SCISSORS);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you WIN🎉", PlayerHelper.SCISSORS, PlayerHelper.ROCK), result);
    }

    @Test
    void scissorsShouldBeatPaper(){
        String result = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.PAPER);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you WIN🎉", PlayerHelper.PAPER, PlayerHelper.SCISSORS), result);
    }

    @Test
    void paperShouldBeatRock(){
        String result = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.ROCK);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you WIN🎉", PlayerHelper.ROCK, PlayerHelper.PAPER), result);
    }

    // unhappy path - lose conditions are working

    @Test
    void RockShouldNotBeatPaper(){
        String result = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.PAPER);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you LOSE😢", PlayerHelper.PAPER, PlayerHelper.ROCK), result);
    }

    @Test
    void PaperShouldNotBeatScissors(){
        String result = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.SCISSORS);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you LOSE😢", PlayerHelper.SCISSORS, PlayerHelper.PAPER), result);
    }
    @Test
    void ScissorsShouldNotBeatRock(){
        String result = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.ROCK);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you LOSE😢", PlayerHelper.ROCK, PlayerHelper.SCISSORS), result);
    }

}