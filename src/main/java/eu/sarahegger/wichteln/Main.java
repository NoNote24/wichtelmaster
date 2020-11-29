package eu.sarahegger.wichteln;

import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Wichtelmaster wichtelmaster = new Wichtelmaster();

        try {
            wichtelmaster.introduce();
            HashMap<Player, Player> pairs = wichtelmaster.collectPlayerData();
            wichtelmaster.sendLetter(pairs);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
