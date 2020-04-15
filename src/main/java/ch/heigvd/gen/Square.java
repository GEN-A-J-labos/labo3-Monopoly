/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

public abstract class Square {

    private String name;
    private int positionInBoard;

    public Square (String name, int positionInBoard) {

        this.name = name;
        this.positionInBoard = positionInBoard;
    }

    public String getName() {
        return name;
    }

    public int getPositionInBoard() {
        return positionInBoard;
    }

    public abstract void landedOn(Player player);
}
