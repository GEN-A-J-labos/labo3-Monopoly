/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @RepeatedTest(100)
    void playerShouldMoveCorrectDistance() {

        Board board = new Board();
        Cup cup = new Cup(2);
        Player player = new Player("playername", board, cup);

        player.takeTurn();

        // Teste la position courante avec la position voulue
        assertEquals(board.getNewPosition(board.getGoSquare(), cup.getTotal()).getName(),
                     player.getPiece().getCurrentPosition().getName());
    }
}