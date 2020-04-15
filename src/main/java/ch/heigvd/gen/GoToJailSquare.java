package ch.heigvd.gen;

public class GoToJailSquare extends Square {

    private Square jail;
    public GoToJailSquare(Square jail) {
        super("GoToJail");
        this.jail = jail;
    }

    @Override
    public void landedOn(Player player) {
        player.setLocation(jail);
    }
}
