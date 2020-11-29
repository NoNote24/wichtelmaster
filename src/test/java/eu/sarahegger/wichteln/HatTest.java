package eu.sarahegger.wichteln;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HatTest {
    Hat hat;

    @BeforeEach
    void beforeEach() {
        hat = new Hat();
    }

    @org.junit.jupiter.api.Test
    void addPlayerToHat() {
        Player player = new Player("Sarah", "sarah@sarahegger.eu");
        hat.addPlayerToHat(player);
        assertFalse(hat.getAllPlayers().isEmpty());
        assertTrue(hat.getAllPlayers().contains(player));
    }

    @Test
    void mixPlayers() {
        Player player1 = new Player("Sarah", "sarah@sarahegger.eu");
        Player player2 = new Player("OnThe", "first@dayOf.Christmas");
        Player player3 = new Player("MyTrue", "Love@gaveTo.me");
        Player player4 = new Player("APartridge", "inA@Pair.tree");
        Player player5 = new Player("OnTheSecond", "dayOf@Christmas.my");

        hat.addPlayerToHat(player1);
        hat.addPlayerToHat(player2);
        hat.addPlayerToHat(player3);
        hat.addPlayerToHat(player4);
        hat.addPlayerToHat(player5);

        HashMap<Player, Player> pairs = hat.mixPlayers();

        assertFalse(pairs.isEmpty());
        Iterator iterator = pairs.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            assertNotEquals(pair.getKey().toString(), pair.getValue().toString());
            assertNotNull(pair.getKey());
            assertNotNull(pair.getValue());
//            System.out.println(pair.getKey().toString() + " will get " + pair.getValue().toString() + " a present.");
        }
    }
}