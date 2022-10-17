import java.util.Scanner;

public class Game {
    private static int mapSize = 15; // Change this to change overall size of map
    private static int[][] mapArray = new int[mapSize][mapSize]; // Map of mapSize*mapSize
    private static int numBoats = 1; // Do not change, changed after boats are initialized

    public static void main(String[] args) {
        
        // Boat initializations
        Boat boat1 = new Boat(2);
        placeBoat(boat1);
        numBoats++;
        Boat boat2 = new Boat(3);
        placeBoat(boat2);
        numBoats++;
        Boat boat3 = new Boat(6);
        placeBoat(boat3);
        numBoats++;
        Boat boat4 = new Boat(5);
        placeBoat(boat4);
        numBoats++;
        Boat boat5 = new Boat(3);
        placeBoat(boat5);
        numBoats++;
        Boat boat6 = new Boat(2);
        placeBoat(boat6);
        numBoats++;
        Boat boat7 = new Boat(4);
        placeBoat(boat7);
        numBoats++;

        boolean playGame = true;
        while (playGame) {
            // Printing full map array after boats placed
            for (int i = 0; i < mapSize; i++) {
                for (int j = 0; j < mapSize; j++) {
                    System.out.print(mapArray[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

    //FIXME: get input and fire on specified tile
    //Probably need boat array
    public static void fireOn() {
    }   

    // Creates map of mapSize filled with 0s
    public static void createBlankMap(int mapSize) {
        for (int row = 0; row < mapSize; row++) {
            for (int column = 0; column < mapSize; column++) {
                mapArray[row][column] = 0;
            }
        }
    }

    // Places boat param to their locations in the map array (overlaps handled in
    // boat constructor)
    public static void placeBoat(Boat boat) {
        for (int i = 0; i < boat.getLength(); i++) {
            if (boat.getOrientation() == 0) { // vert
                mapArray[boat.getInitRow() + i][boat.getInitCol()] = numBoats;
            } else {
                mapArray[boat.getInitRow()][boat.getInitCol() + i] = numBoats;
            }
        }
    }

    public static int getMapSize() {
        return mapSize;
    }

    public static int[][] getGameMap() {
        return mapArray;
    }
}
