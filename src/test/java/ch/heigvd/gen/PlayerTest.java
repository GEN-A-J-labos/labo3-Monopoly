package ch.heigvd.gen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void playerShouldMoveCorrectDistance() {
        Board board = new Board();
        Dice dices[] = new Dice[]{new Dice(), new Dice()};
        Player player = new Player("playername", board, dices);

        player.takeTurn();
        int dicesValue = 0;
        for (Dice d : dices) {
            dicesValue += d.getFaceValue();
        }
        assertEquals(player.getPiece().getCurrentPosition().getPositionInBoard(), dicesValue);
    }
}