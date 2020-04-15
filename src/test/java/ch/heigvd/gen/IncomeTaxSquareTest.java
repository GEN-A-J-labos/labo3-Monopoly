package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Math.min;
import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 500, 510, 1500})
    void playerShouldPayCorrectAmountOfTaxes(int playerWorthAdjustment) {
        Board board = new Board();
        Player player = new Player("PlayerName",board,null);
        player.addCash(playerWorthAdjustment);
        int startWorth = player.getNetWorth();
        player.setLocation(board.getNewPosition(board.getGoSquare(), 4));
        assertEquals(startWorth - min((int)(startWorth*0.1),200), player.getNetWorth());
    }

}