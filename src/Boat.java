import java.util.Random;

public class Boat {
    Random rng = new Random();
    private int length;
    private int hP;

    private int[][] mapArr = Game.getGameMap(); //getting map at time of initialization for checking overlaps

    private int initRow;    //initial row to be randomly set
    private int initCol;    //initial column to be randomly set
    private final int orientation; // 0 for vert, 1 for horizontal

    public Boat(int size) {
        length = size;
        hP = size;
        orientation = rng.nextInt(2);   //random from 0 to 1, 0=vert 1=hori

        boolean placable = false;

        //Checks if boat is able to be placed at initRow and initCol with their orientation
        while (!placable) { //loops until suitable initial location is found
            if (orientation == 0) { // for vertical
                initRow = rng.nextInt(Game.getMapSize()-size);
                initCol = rng.nextInt(Game.getMapSize());
                for (int i = 0; i < length; i++) {
                    if (mapArr[initRow + i][initCol] == 0) {
                        placable = true;
                    } else {
                        placable = false;
                        break;
                    }
                }
            } else if (orientation == 1) { // for horizontal
                initRow = rng.nextInt(Game.getMapSize());
                initCol = rng.nextInt(Game.getMapSize() - size);
                for (int i = 0; i < length; i++) {
                    if (mapArr[initRow][initCol + i] == 0) {
                        placable = true;
                    } else {
                        placable = false;
                        break;
                    }
                }
            }
        }
    }

    public int getLength() {
        return length;
    }
    public int getHP() {
        return hP;
    }
    public void hitTaken() {
        hP--;
    }

    public int getInitRow() {
        return initRow;
    }
    public int getInitCol() {
        return initCol;
    }
    public int getOrientation() {
        return orientation;
    }
}
