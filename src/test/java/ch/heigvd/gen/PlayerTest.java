package ch.heigvd.gen;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @RepeatedTest(100)
    void playerShouldMoveCorrectDistance() {

        Board board = new Board();
        Dice dices[] = new Dice[]{new Dice(), new Dice()};
        Player player = new Player("playername", board, dices);

        player.takeTurn();

        int dicesValue = 0;
        for (Dice d : dices) {
            dicesValue += d.getFaceValue();
        }

        String squareName = "Square ";
        assertEquals(board.getNewPosition(board.getGoSquare(), dicesValue).getName(), player.getPiece().getCurrentPosition().getName());
    }
}