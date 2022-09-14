import characters.Cleric;
import characters.Elf;
import heals.HamHock;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Elf elf;
    Axe axe;
    HamHock hamHock;


    @Before
    public void before(){
        hamHock = new HamHock();
        axe = new Axe();
        cleric = new Cleric("Healing Guy",100, hamHock);
        elf = new Elf("Legolas", 80, axe);
    }

    @Test
    public void canHealPlayer(){
        cleric.healPlayer(elf);
        assertEquals(100, elf.getHealth());
    }
}
