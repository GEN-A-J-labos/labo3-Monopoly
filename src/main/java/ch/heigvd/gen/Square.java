/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

public abstract class Square {

    private String name;

    public Square (String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void landedOn(Player player);
}
