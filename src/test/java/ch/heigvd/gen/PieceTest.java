/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PieceTest {

    @Test
    public void currentPositionShouldBeInitCorrectly() {

        Square square = new GoSquare();
        Piece piece = new Piece("Test", square);

        assertEquals("Go", piece.getCurrentPosition().getName());
    }

    @Test
    public void currentPositionShouldBeSetCorrectly() {

        Square square1 = new RegularSquare("Bad");
        Square square2 = new RegularSquare("Good");
        Piece piece = new Piece("Test", square1);

        piece.setCurrentPosition(square2);

        assertEquals("Good", piece.getCurrentPosition().getName());
    }


    @Test
    public void nameShouldBeInitCorrectly() {

        Piece piece = new Piece("this is great", new GoSquare());
        assertEquals("this is great", piece.getName());
    }

    @Test
    public void nameShouldBeSetCorrectly() {

        Piece piece = new Piece("this is not great", new GoSquare());
        piece.setName("this is great");
        assertEquals("this is great", piece.getName());
    }

}