/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;

import java.util.ArrayList;

public class Board {

    private static final int NB_SQUARES = 40;

    private ArrayList<Square> squares;

    public Board() {

        squares = new ArrayList<>();

        squares.add(new Square("Go"));

        for (int i = 1; i < NB_SQUARES; i++) {
            squares.add(new Square("Square " + i));
        }
    }

    public Square getGoSquare() {

        return squares.get(0);
    }

    public Square getNewPosition(Square oldPosition, int diceValue) {

        int newIndex = (squares.indexOf(oldPosition) + diceValue) % NB_SQUARES;

        return squares.get(newIndex);
    }

    public Square getSquareByName(String name){
        throw new NotImplementedException();
    }
}
