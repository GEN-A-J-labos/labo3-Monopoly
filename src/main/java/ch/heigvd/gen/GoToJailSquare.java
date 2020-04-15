/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;

public class GoToJailSquare extends Square {

    private Square jail;
    public GoToJailSquare(Square jail) {
        super("GoToJail");
        this.jail = jail;
    }

    @Override
    public void landedOn(Player player) {
        player.setLocation(jail);
    }
}
