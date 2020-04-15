package ch.heigvd.gen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularSquareTest {
    @Test
    public void SquareNameShouldBeInitCorrectly() {
        Square square = new RegularSquare("Test");
        assertEquals("Test", square.getName());
    }
}