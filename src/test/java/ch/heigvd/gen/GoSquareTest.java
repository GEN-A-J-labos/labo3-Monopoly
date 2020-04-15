package ch.heigvd.gen;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest {

    @Test
    void testIncreaseAmount() {
        Player player = new Player("PlayerName",null,null);
        GoSquare goSquare = new GoSquare("GoSquare", 0);
        int worthBefore = player.getNetWorth();
        goSquare.landedOn(player);
        int worthAfter = player.getNetWorth();
        assertEquals(worthAfter, worthBefore + 200);
    }
}