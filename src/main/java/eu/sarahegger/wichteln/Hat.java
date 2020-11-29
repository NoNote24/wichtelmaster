package eu.sarahegger.wichteln;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * The Wichtelmaster's hat. The parchments with the player names will get thrown and mixed in here.
 */
@Getter
@Setter
@NoArgsConstructor
public class Hat {
    private ArrayList<Player> allPlayers = new ArrayList<Player>();
    private HashMap<Player, Player> pairs = new HashMap<Player, Player>();

    public void addPlayerToHat(Player player) {
        allPlayers.add(player);
    }

    /**
     * Ensures that every giver will have a random receiver that does not yet receive from anyone else.
     * @return the pairs of givers and receivers, bound together by destiny for this yuletide
     */
    public HashMap<Player, Player> mixPlayers() {
        ArrayList<Player> hasNotGiven = new ArrayList<Player>();
        ArrayList<Player> hasNotReceived = new ArrayList<Player>();
        for (Player player : allPlayers) {
            hasNotGiven.add(player);
            hasNotReceived.add(player);
        }

        while (!hasNotGiven.isEmpty() && !hasNotReceived.isEmpty()) {
            Random random1 = new Random();
            int index1 = random1.nextInt(hasNotGiven.size());
            Player player1 = hasNotGiven.get(index1);
            hasNotGiven.remove(player1);
            for (int j = 0; j < hasNotReceived.size(); j++) {
                Random random2 = new Random();
                int index2 = random2.nextInt(hasNotReceived.size());
                Player player2 = hasNotReceived.get(index2);
                if (player2.getEmail().equals(player1.getEmail()) == false) {
                    hasNotReceived.remove(player2);
                    pairs.put(player1, player2);
                    break;
                } else
                    continue;
            }
        }
        return pairs;
    }

}
