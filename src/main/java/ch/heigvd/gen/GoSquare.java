package ch.heigvd.gen;

public class GoSquare extends Square {
    private static final int CASH_REVENUE = 200;
    public GoSquare(String name, int positionInBoard) {
        super(name, positionInBoard);
    }

    @Override
    public void landedOn(Player player) {
        player.addCash(CASH_REVENUE);
    }
}
