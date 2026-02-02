import java.util.Random;

public class WildernessMap extends Map {

    private Random random = new Random();

    public WildernessMap(int rows, int cols) {
        super(rows, cols);
        generateMap();
    }

    @Override
    protected Tile createTile() {

        int choice = random.nextInt(3);

        switch (choice) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            case 2: return new ForestTile();
            default: return new ForestTile(); // without default, would need to use "return null;" which is not ideal.
        }
    }
}
