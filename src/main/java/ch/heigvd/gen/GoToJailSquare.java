package ch.heigvd.gen;

public class GoToJailSquare extends Square {

    public GoToJailSquare(String name, int positionInBoard) {
        super(name, positionInBoard);
    }

    @Override
    public void landedOn(Player player) {
        player.setLocation("jail");
    }
}
