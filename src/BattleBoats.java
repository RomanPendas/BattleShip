import java.util.Random;

public class BattleBoats {


    public static void main(String[] args) {
        Map map = new Map(12);
        Boat boat = new Boat(3);
        Boat boat2 = new Boat(2);
        Boat boat3 = new Boat(4);
        samePositionCheck(boat, boat2);
        samePositionCheck(boat, boat3);
        samePositionCheck(boat2, boat3);
        map.setBoatPosition(boat);
        map.setBoatPosition(boat2);
        map.setBoatPosition(boat3);
        System.out.println(map);

    }
    //method to make sure boats don't overlap doesn't fully work though
    public static void samePositionCheck(Boat boat, Boat boat2) {
        Random rng = new Random();
        int [] sBoat = boat.getBoatPositionArray();
        int [] lBoat = boat2.getBoatPositionArray();
        for(int i=0; i < boat.getLength(); i++){
            for(int j=0; j < boat2.getLength(); j++){
                if (sBoat[i] == lBoat[j]){
                    boat.setBoatPositionArray(rng.nextInt(7), rng.nextInt(7));
                }
            }
        }

    }
}
