import characters.Elf;
import characters.Troll;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class ElfTest {

    Elf elf;
    Axe axe;
    Sword sword;

    Troll troll;

    @Before
    public void before(){
        axe = new Axe();
        sword = new Sword();
        elf = new Elf("Frodo", 100, axe);
        troll = new Troll(100);

    }

    @Test
    public void canDamageEnemy(){
        elf.attack(troll);
        assertEquals(75, troll.getHealth());
    }

    @Test
    public void canChangeWeapon(){
        elf.changeWeapon(sword);
        assertEquals(sword, elf.getWeapon());
    }
}
