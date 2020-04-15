/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

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