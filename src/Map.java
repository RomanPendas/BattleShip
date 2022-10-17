public class Map {
    private int[][] mapArray;

    public Map(int mapSize) {
        mapArray = new int[mapSize][mapSize];
        for(int row = 0; row < mapSize; row++) {
            for(int column = 0; column < mapSize; column++) {
                mapArray[row][column] = 0;
            }
        }
    }
    public void setBoatPosition(Boat boat) {
        for(int row = 0; row < mapArray.length; row++) {
            for(int column = 0; column < mapArray.length; column++) {
                if (row == boat.getRanRow() && column == boat.getRanColumn()){
                    switch(boat.getVertOrHor()) {
                        case 1:
                            for (int i = 0; i < boat.getLength(); i++) {
                                mapArray[boat.getRanRow() + i][boat.getRanColumn()] = 1;
                            }
                            break;
                        case 2:
                            for (int i = 0; i < boat.getLength(); i++) {
                                mapArray[boat.getRanRow()][boat.getRanColumn() + i] = 1;
                            }
                            break;
                    }
                }
            }
        }
    }
    @Override
    public String toString(){
        String str = "";
        for(int row = 0; row < mapArray.length; row++) {
            for(int column = 0; column < mapArray.length; column++) {
                str = str + String.valueOf(mapArray[row][column]);
            }
            str = str + "\n";
        }
        return str;
    }
    public int getMapArrayLength(){
        return mapArray.length;
    }
    public int[][] getMapArray(){
        return mapArray;
    }
}
