/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class MonopolyGameTest {

    @Test
    void testNoCrash() {
        MonopolyGame mp = new MonopolyGame(4, 20);
        assertTimeout(Duration.ofSeconds(5), mp::playGame);
    }
}