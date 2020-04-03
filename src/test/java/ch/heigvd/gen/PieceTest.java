package ch.heigvd.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PieceTest {

    @Test
    public void currentPositionShouldBeSetCorrectly() {
        // TODO Can't test it without Square class and GO pos
    }

    @Test
    public void nameShouldBeSetCorrectly() {

        Piece piece = new Piece("this is great", new Square());
        assertEquals("this is great", piece.getName());
    }

}