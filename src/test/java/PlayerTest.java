import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player;

    @BeforeEach
    void setupPlayer() {
        player = new Player();
    }

    @Test
    void afterCreation_PlayerShipCountIsZero() {
        assertEquals(0, player.shipCount());
    }

    @Test
    void afterCreation_ReportNoShipAtCoordinate() {
        int[] coord = {9,9};
        assertFalse(player.hasShipAt(coord));
    }

    @Test
    void afterAddingOneShip_ShipCountIsOne() {
        int[] startCoord = {3, 5};
        int[] endCoord = {3, 7};
        player.addShip(startCoord, endCoord);
        assertEquals(1, player.shipCount());
    }
}