import org.junit.Before;
import org.junit.Test;
import quest.Exits;
import quest.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Exits exits;

    @Before
    public void before(){
        room = new Room(exits);
        room.addExitToArray();
    }

//    @Test
//    public void exitsOnExitArray(){
//        room.addExitToArray();
//        assertEquals(0, room.getExitArraySize());
//        assertEquals(1, room.getExitArray());
//    }



}
