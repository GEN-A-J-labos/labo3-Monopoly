package ch.heigvd.gen;

public class GoSquare extends Square {
    private static final int CASH_REVENUE = 200;
    public GoSquare() {
        super("Go");
    }

    @Override
    public void landedOn(Player player) {
        player.addCash(CASH_REVENUE);
    }
}
