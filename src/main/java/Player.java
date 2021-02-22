public class Player {

    private int shipCount = 0;

    public int shipCount() {
        return shipCount;
    }

    public void addShip(int[] startCoord, int[] endCoord) {
        shipCount++;
    }

    public boolean hasShipAt(int[] coord) {
        return false;
    }
}
