/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    @Test
    void playerShouldGoToJailWhenGoToJailSquare() {
        Board board = new Board();
        Player player = new Player("PlayerName",board,null);
        player.setLocation(board.getNewPosition(board.getGoSquare(), 30));
        assertEquals("Jail", player.getPiece().getCurrentPosition().getName());
    }
    @Test
    public void GoSquareShouldBeNamedGoToJail() {
        Square square = new GoToJailSquare(null);
        assertEquals("GoToJail", square.getName());
    }
}