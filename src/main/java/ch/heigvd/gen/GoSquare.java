/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;

public class GoSquare extends Square {
    private static final int CASH_REVENUE = 200;
    public GoSquare() {
        super("Go");
    }

    @Override
    public void landedOn(Player player) {
        player.addCash(CASH_REVENUE);
    }
}
