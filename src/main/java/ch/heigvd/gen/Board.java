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

        squares.add(new GoSquare());
        Square jail = new RegularSquare("Jail");

        for (int i = 1; i < NB_SQUARES; i++) {
            if(i == 10){
                squares.add(jail);
            }else if(i == 30) {
                squares.add(new GoToJailSquare(jail));
            }else if(i == 4){
                squares.add(new IncomeTaxSquare(0.1));
            }else{
                squares.add(new RegularSquare("Square " + i));
            }
        }
    }

    public Square getGoSquare() {

        return squares.get(0);
    }

    public Square getNewPosition(Square oldPosition, int diceValue) {

        int newIndex = (squares.indexOf(oldPosition) + diceValue) % NB_SQUARES;

        return squares.get(newIndex);
    }

}
