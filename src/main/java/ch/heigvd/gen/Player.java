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
    private int cash;

    public Player(String name, Board board, Dice[] dices) {
        this.cash = 1500;
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
        newPosition.landedOn(this);
    }

    public void setLocation(Square square){
        piece.setCurrentPosition(square);
        square.landedOn(this);
    }

    public Piece getPiece() {
        return piece;
    }

    public void addCash(int amount){
        cash += amount;
    }

    public int getNetWorth(){
        return cash;
    }

    public void decreaseCash(int amount){
        cash -= amount;
    }
}