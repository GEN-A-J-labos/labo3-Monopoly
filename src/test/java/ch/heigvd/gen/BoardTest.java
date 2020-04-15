/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;

    @BeforeEach
    void initBoard() {

        board = new Board();
    }

    @Test
    void SquareZeroShouldBeCalledGo() {

        assertEquals("Go", board.getGoSquare().getName());
    }

    @Test
    void NextSquareShouldReturnCorrectName() {

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