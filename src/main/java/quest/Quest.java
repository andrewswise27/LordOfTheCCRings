package quest;

import characters.Player;

import java.util.ArrayList;

public class Quest {

    private ArrayList<Room> rooms;

    public Quest() {
        this.rooms = new ArrayList<>();
    }

    public void addRoomToArray(Room room){
        this.rooms.add(room);
        room.addExitToArray();
    }

    public void selectExit(Exits exits){
    }

    public void movePlayersToRoom(Room room, Room room2, Exits exits, Player player){
        selectExit(exits);
        room2.addPlayerToRoom(player);
        this.rooms.remove(room);
    }

    public int getRoomsSize() {
        return rooms.size();
    }
}
