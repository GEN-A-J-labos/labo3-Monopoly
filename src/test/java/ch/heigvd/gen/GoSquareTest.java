package ch.heigvd.gen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest {

    @Test
    void testIncreaseAmount() {
        Board board = new Board();
        Player player = new Player("PlayerName",board,null);

        int worthBefore = player.getNetWorth();
        board.getGoSquare().landedOn(player);
        int worthAfter = player.getNetWorth();

        assertEquals(worthBefore + 200, worthAfter);
    }

    @Test
    public void GoSquareShouldBeNamedGO() {
        Square square = new GoSquare();
        assertEquals("Go", square.getName());
    }
}