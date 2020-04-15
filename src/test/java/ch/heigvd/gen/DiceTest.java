/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    // 1000 should be enough to be sure
    @RepeatedTest(1000)
    public void numbersShouldBeBetweenOneAndSix() {

        Dice dice = new Dice();

        dice.roll();

        if (dice.getFaceValue() > 6 || dice.getFaceValue() < 1) {
            fail();
        }
    }
}