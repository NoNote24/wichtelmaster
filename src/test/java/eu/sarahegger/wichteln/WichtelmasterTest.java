package eu.sarahegger.wichteln;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WichtelmasterTest {
    Wichtelmaster wichtelmaster = new Wichtelmaster();

    /**
     * Unfortunately, the dialogue doesn't work in the test class.
     * Copy the test content to main for testing.
     */
    @Ignore
    @Test
    void collectPlayerData() {
        try {
            HashMap<Player, Player> pairs = wichtelmaster.collectPlayerData();
            Iterator i = pairs.entrySet().iterator();
            while (i.hasNext()) {
                Map.Entry pair = (Map.Entry)i.next();
                System.out.println(pair.getKey().toString() + " will get " + pair.getValue().toString() + " a present.");
                Player giver = (Player) pair.getKey();
                Player receiver = (Player) pair.getValue();
                System.out.println(giver.getName()
                        + " will give a present to " +
                        receiver.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}