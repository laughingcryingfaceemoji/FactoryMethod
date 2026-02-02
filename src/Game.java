import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        Map map = game.createMap("wildeRneSs", 5, 5);
        map.display();
    }

    public Map createMap(String type, int rows, int cols) {
        if (type.equalsIgnoreCase("city")) { //equalsignorecase = removes the capital letter differences
            return new CityMap(rows, cols);
        } else if (type.equalsIgnoreCase("wilderness")) { //equalsignorecase = removes the capital letter differences
            return new WildernessMap(rows, cols);
        } else {
            throw new IllegalArgumentException("Unknown map type");
        }
    }
}
