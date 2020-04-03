/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

import java.util.Random;

public class Dice {

    private int faceValue;
    private Random random = new Random();

    public void roll() {

        // Random generates from 0 to 5. + 1 to get it from 1 to 6.
        faceValue = random.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
