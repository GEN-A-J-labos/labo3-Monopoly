/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

public class Player {

    private String name;
    private Board board;
    private Dice[] dices;
    private Piece piece;

    public Player(String name, Board board, Dice[] dices) {

        this.name = name;
        this.board = board;
        this.dices = dices;
        this.piece = new Piece("Piece" + name, board.getGoSquare());
    }

    public void takeTurn() {

        int totalRollValue = 0;

        for (Dice d : dices) {
            d.roll();
            totalRollValue += d.getFaceValue();
        }

        Square oldPosition = piece.getCurrentPosition();
        Square newPosition = board.getNewPosition(oldPosition, totalRollValue);
        piece.setCurrentPosition(newPosition);
    }

    public Piece getPiece() {
        return piece;
    }
}