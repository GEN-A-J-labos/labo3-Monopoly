/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;

import java.util.ArrayList;

public class Cup {

    private ArrayList<Dice> dices;
    private int total;

    public Cup(int nbDiceInCup) {

        dices = new ArrayList<>();

        for (int i = 0; i < nbDiceInCup; i++) {

            dices.add(new Dice());
        }
    }

    public void roll() {

        total = 0;

        for (Dice d : dices) {
            d.roll();
            total += d.getFaceValue();
        }
    }

    public int getTotal() {
        return total;
    }
}
