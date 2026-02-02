import java.util.Random;

public class CityMap extends Map {

    private Random random = new Random();

    public CityMap(int rows, int cols) {
        super(rows, cols);
        generateMap();
    }

    @Override
    protected Tile createTile() {

        int choice = random.nextInt(3);

        switch (choice) {
            case 0: return new RoadTile();
            case 1: return new ForestTile();
            case 2: return new BuildingTile();
            default: return new RoadTile(); // without default, would need to use "return null;" which is not ideal.
        }
    }
}
