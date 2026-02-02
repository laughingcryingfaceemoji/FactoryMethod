public abstract class Map {

    protected Tile[][] tiles; //Using tiles gotten from Tiles class
    protected int rows;
    protected int cols;

    public Map(int rows, int cols) { //how big the map is
        this.rows = rows;
        this.cols = cols;
        tiles = new Tile[rows][cols];
    }

    protected abstract Tile createTile(); //takes the tile from citymap/wildernessmap

    protected void generateMap() { //fills the map with tiles
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tiles[i][j] = createTile(); //positioning of the tiles
            }
        }
    }

    public void display() { //fills the tiles with characters.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println(); //new row
        }
    }
}
