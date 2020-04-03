/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void SquareZeroShouldBeCalledGo() {

        Board board = new Board();

        assertEquals("Go", board.getGoSquare().getName());
    }

    @Test
    void SquareZeroShouldHaveIndexZeroOnBoard() {

        Board board = new Board();

        assertEquals(0, board.getGoSquare().getPositionInBoard());
    }

    @Test
    void NextSquareShouldReturnCorrectIndex() {

        Board board = new Board();

        Square square = board.getGoSquare();
        Square newSquare = board.getNewPosition(square, 6);

        // Test normal position update
        assertEquals(6, newSquare.getPositionInBoard());

        // Get on last cell
        newSquare = board.getNewPosition(square, 39);
        // Pass over Go position
        newSquare = board.getNewPosition(newSquare, 3);

        assertEquals(2, newSquare.getPositionInBoard());
    }

    @Test
    void NextSquareShouldReturnCorrectName() {

        Board board = new Board();

        Square square = board.getGoSquare();
        Square newSquare = board.getNewPosition(square, 6);

        // Test normal position update
        assertEquals("Square 6", newSquare.getName());

        // Get on last cell
        newSquare = board.getNewPosition(square, 39);
        // Pass over Go position
        newSquare = board.getNewPosition(newSquare, 1);

        assertEquals("Go", newSquare.getName());
    }
}