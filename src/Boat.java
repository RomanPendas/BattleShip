import java.util.Random;
public class Boat{
    Random rng = new Random();
    private int length;
    private int hP;
    private int[][] boatPosition;

    private int ranRow;
    private int ranColumn;
    private final int vertOrHor;

    public Boat(int size){
        length = size;
        hP = size;
        vertOrHor = rng.nextInt(2) + 1;
        if (vertOrHor == 1) { //for vertical
            ranRow = rng.nextInt(9);
            ranColumn = rng.nextInt(12);
        }
        else if (vertOrHor == 2) { // for horizontal
            ranRow = rng.nextInt(12);
            ranColumn = rng.nextInt(9);
        }
        switch(vertOrHor) {
            case 1:
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        boatPosition[i][j] = {ranRow + i},{ranColumn;
                        boatPosition[++i] = ranColumn;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < length; i++) {
                    boatPosition[i] = ranRow;
                    boatPosition[++i] = ranColumn + i;
                }
                break;
        }
    }
    public void setBoatPositionArray(int ranRow, int ranColumn){
        this.ranRow = ranRow;
        this.ranColumn = ranColumn;
        switch(vertOrHor) {
            case 1:
                for (int i = 0; i < length;i++) {
                    boatPosition[i] = ranRow + i;
                    boatPosition[++i] = ranColumn;
                }
                break;
            case 2:
                for (int i = 0; i < length; i++) {
                    boatPosition[i] = ranRow;
                    boatPosition[++i] = ranColumn + i;
                }
                break;
        }
    }
    public int getLength(){
        return length;
    }
    public int getHP() {
        return hP;
    }
    public void hitTaken() {
        hP--;
    }
    public int getRanRow() {
        return ranRow;
    }
    public void setRanRow(int ranRow) {
        this.ranRow = ranRow;
    }
    public int getRanColumn() {
        return ranColumn;
    }
    public void setRanColumn(int ranColumn) {
        this.ranColumn = ranColumn;
    }

    public int getVertOrHor() {
        return vertOrHor;
    }

    public int[][] getBoatPositionArray() {
        return boatPosition;
    }


}
