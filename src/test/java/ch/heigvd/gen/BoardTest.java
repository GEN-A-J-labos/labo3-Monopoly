/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(strings = {"Go", "IncomeTax", "Jail", "GoToJail"})
    void BoardShouldHaveAtLeastListedSquares(String squareToTest) {

        boolean found = false;
        Square go = board.getGoSquare();
        Square tmp;

        for (int i = 0; i < 40; i++) {
            tmp = board.getNewPosition(go, i);
            if (tmp.getName().equals(squareToTest)) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }
}