import characters.Elf;
import characters.Wizard;
import org.junit.Before;
import org.junit.Test;
import quest.Exits;
import quest.Quest;
import quest.Room;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    Room room;
    Room room2;
    Quest quest;
    Exits exits;
    Elf elf;
    Axe axe;
    Elf elf2;

    @Before
    public void before(){
        axe = new Axe();
        elf = new Elf("Frodo", 100, axe);
        elf2 = new Elf("Legolas", 100, axe);
        room = new Room(exits);
        room2 = new Room(exits);
        quest = new Quest();
        quest.addRoomToArray(room);
        quest.addRoomToArray(room2);
        room.addPlayerToRoom(elf);
    }

    @Test
    public void canAddPlayerToRoom(){
        room.addPlayerToRoom(elf2);
        assertEquals(2, room.getPlayerList());
    }

    @Test
    public void canMoveRoom(){
        quest.movePlayersToRoom(room, room2, Exits.NORTH, elf);
        assertEquals(1, room2.getPlayerList());
    }

    @Test
    public void movingRoomsRemovesRoom(){
        quest.movePlayersToRoom(room, room2, Exits.NORTH, elf);
        assertEquals(1, quest.getRoomsSize());
    }
//    @Test
//    public void roomHasExits(){
//        assertEquals(0, room.getExitArray());
//    }
}
