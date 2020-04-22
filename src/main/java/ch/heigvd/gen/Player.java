/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;


public class Player {

    private String name;
    private Board board;
    private Cup cup;
    private Piece piece;
    private int cash;

    public Player(String name, Board board, Cup cup) {
        this.cash = 1500;
        this.name = name;
        this.board = board;
        this.cup = cup;
        this.piece = new Piece("Piece" + name, board.getGoSquare());
    }

    public void takeTurn() {
        cup.roll();
        System.out.println(name + " rolled " + cup.getTotal() + (cup.getTotal()==12?" they see me roolin'":""));
        Square oldPosition = piece.getCurrentPosition();
        Square newPosition = board.getNewPosition(oldPosition, cup.getTotal());
        piece.setCurrentPosition(newPosition);
        newPosition.landedOn(this);
        System.out.println(name + " arrived on square: " + piece.getCurrentPosition().getName());
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