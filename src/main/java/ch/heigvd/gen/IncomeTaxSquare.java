/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;

import static java.lang.Integer.min;

public class IncomeTaxSquare extends Square {
    private double tax;

    public IncomeTaxSquare(double tax) {
        super("IncomeTax");
        this.tax = tax;
    }

    @Override
    public void landedOn(Player player) {
        int playerWorth = player.getNetWorth();
        player.decreaseCash(min(200, (int)(playerWorth * tax)));
    }
}
