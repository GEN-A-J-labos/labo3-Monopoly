/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    public void numbersShouldBeBetweenOneAndSix() {

        Dice dice = new Dice();

        // 100000 should be enough to be sure
        for (int i = 0; i < 100000; i++) {
            dice.roll();

            if (dice.getFaceValue() > 6 || dice.getFaceValue() < 1) {
                fail();
            }
        }
    }

}