/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void resultShouldBeInCorrectIntervalForDifferentAmountOfDice(int nbDiceInCup) {

        Cup cup = new Cup(nbDiceInCup);

        int minValue = nbDiceInCup;
        int maxValue = 6 * nbDiceInCup;

        for (int i = 0; i < 10000; i++) {

            cup.roll();
            assertFalse(cup.getTotal() > maxValue || cup.getTotal() < minValue);
        }
    }
}