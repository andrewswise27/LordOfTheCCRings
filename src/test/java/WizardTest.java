import characters.Wizard;
import defenders.Dragon;
import defenders.Phoenix;
import org.junit.Before;
import org.junit.Test;
import weapons.Fireball;
import weapons.LightningStrike;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Dragon dragon;
    Phoenix phoenix;
    LightningStrike lightningStrike;
    Fireball fireball;

    @Before
    public void before(){
        dragon = new Dragon();
        phoenix = new Phoenix();
        lightningStrike = new LightningStrike();
        fireball = new Fireball();
        wizard = new Wizard("Gandalf", 200, dragon, lightningStrike);
    }

    @Test
    public void canChangeDefense(){
        wizard.changeDefend(phoenix);
        assertEquals(phoenix, wizard.getDefend());
    }

    @Test
    public void canChangeSpell(){
        wizard.changeSpell(fireball);
        assertEquals(fireball, wizard.getSpell());
    }
}
