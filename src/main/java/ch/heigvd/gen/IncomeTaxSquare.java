package ch.heigvd.gen;

import static java.lang.Integer.min;

public class IncomeTaxSquare extends Square {
    private static final double TAX = 0.1;

    public IncomeTaxSquare(String name, int positionInBoard) {
        super(name, positionInBoard);
    }

    @Override
    public void landedOn(Player player) {
        int playerWorth = player.getNetWorth();
        player.decreaseCash(min(200, (int)(playerWorth * TAX)));
    }
}
