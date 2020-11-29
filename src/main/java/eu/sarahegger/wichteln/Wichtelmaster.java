package eu.sarahegger.wichteln;

import lombok.NoArgsConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@NoArgsConstructor
public class Wichtelmaster {
    private Hat hat = new Hat();

    public void introduce() {
        System.out.println("Welcome, dear friend, to ye olde game of Wichteln.\n" +
                "The rules are simple: \n" +
                "Thou shalt choose a number of friends to play with. \n" +
                "Thou wilt tell me all your names. And all ye olde eMail addresses.\n" +
                "I shall write them all on individual pieces of parchment.\n" +
                "I will throw them into my magical hat and give it a hearty toss.\n" +
                "                                                  \n" +
                "                                                  \n" +
                "               ``.---:+syhdddhy+`                 \n" +
                "            `+ydmmmmNNNNNNNNNNNNd`                \n" +
                "            sNNNNNNNNNNNNNNNNNNNNh`               \n" +
                "            hNNNNNNNNNNNNNNNNNNNNNh`              \n" +
                "           :NNNNNNNNNNNNNNNNNNNNNNNy`             \n" +
                "           yNNNNNNNNNNNNNNNNNNNNNNNNo             \n" +
                "           mNNNNNNNNmmmdddhhyyso++oo+`            \n" +
                "           dhhyyssoo+++//++++ooo+osyyysso+/:-`    \n" +
                "         `./+++oossyyhdddmmmmmNNNNNNNMMMMMMMNmh/  \n" +
                "     -/shddmmmmNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMd/  \n" +
                "   /hmNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmdddhhyso/.`   \n" +
                "  oNNNNNNNNNNNNNNNmdyo/-....```````````           \n" +
                "  `/+osssssoo+/:-```                              \n" +
                "                                                  \n" +
                "                                                  \n" +
                "Then I will send an eMail to everyone, \n" +
                "telling them for whom they will get a little Christmas present.");

        System.out.println("The rest is up to thee, folks: \n" +
                "How the presents will be handed over with this rotten pandemic going on,\n" +
                "What a present is allowed to cost at max, so that no socioeconomic injustice may arise;\n" +
                "And whatever else thou canst think of.");

        System.out.println("So, tell me their names and eMail addresses now.\n");
    }

    /**
     * Engages the organizer in a dialogue to enter all players and their email adresses.
     *
     * @return the mixed HashMap of all player pairs
     * @throws IOException if something goes wrong with reading from the console
     */
    protected HashMap<Player, Player> collectPlayerData() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is the Player's name?\n");

        Player player = new Player();
        String name = in.readLine();
        player.setName(name);

        System.out.println("Fabulous. And their eMail address?");

        String email = in.readLine();
        player.setEmail(email);

        hat.addPlayerToHat(player);
        System.out.println("Most wonderful. I shall throw the parchment into the hat now.\n" +
                "Do you wish to add another Player? (y/n)");

        String choice = in.readLine();
        if (choice.toLowerCase().equals("y"))
            collectPlayerData();
        else {
            System.out.println("Delightful. Let's shake the hat around a bit now...\n");
            hat.mixPlayers();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Oh dear, that thread was interrupted....");
                e.printStackTrace();
            } finally {
                return hat.getPairs();
            }
        }
        return hat.getPairs();
    }

    /**
     * Charges the postwoman with sending a letter to each person, telling them to whom they will give a present
     * @param pairs the mixed list of players
     */
    protected void sendLetter(HashMap<Player, Player> pairs) {
        Iterator i = pairs.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry pair = (Map.Entry) i.next();
            Player giver = (Player) pair.getKey();
            Player receiver = (Player) pair.getValue();

            Postwoman postwoman = new Postwoman();
            postwoman.setRecipient(giver.getEmail());
            postwoman.sendEmail(giver.getName(), receiver.getName());
        }
    }

}
