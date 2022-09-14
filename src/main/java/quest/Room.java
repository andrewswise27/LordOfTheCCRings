package quest;

import characters.Player;
import java.util.ArrayList;
import java.util.Random;

public class Room {

    private ArrayList<Player> players;
    private Exits exits;
    private ArrayList<Exits> exitArray;

    public Room(Exits exits) {
        this.players = new ArrayList<>();
        this.exits = exits;
        this.exitArray = new ArrayList<>();
    }

    public ArrayList<Exits> getExitArray() {
        return exitArray;
    }

    public int getExitArraySize() {
        return exitArray.size();
    }

    public void addExitToArray() {
        Random random = new Random();
        int nxt = ((random.nextInt(4)) + 1);
        while(exitArray.size() < nxt){
//        for (int i = 0; i < nxt; i++) {
            Exits randomExit = Exits.getRandom();
            if (!exitArray.contains(randomExit)) {
                this.exitArray.add(randomExit);
            }
        }
    }

    public void addPlayerToRoom(Player player){
        this.players.add(player);
    }

    public int getPlayerList(){
        return this.players.size();
    }
    }
