/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Board {

    private static final int NB_SQUARES = 40;

    private Square[] squares;

    public Board() {

        squares = new Square[NB_SQUARES];

        squares[0] = new Square("Go", 0);

        for (int i = 1; i < NB_SQUARES; i++) {
            squares[i] = new Square("Square " + i, i);
        }
    }

    public Square getGoSquare() {

        return squares[0];
    }

    public Square getNewPosition(Square oldPosition, int diceValue) {

        int newIndex = (oldPosition.getPositionInBoard() + diceValue) % NB_SQUARES;

        return squares[newIndex];
    }

    public Square getSquareByName(String name){
        throw new NotImplementedException();
    }
}
