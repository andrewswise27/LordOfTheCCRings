package characters;

import interfaces.IDefend;
import interfaces.ISpell;

public class Warlock extends Mage{

    private ISpell spell;

    public Warlock(String name, int health, IDefend defend, ISpell spell) {
        super(name, health, defend);
        this.spell = spell;
    }

    public void changeSpell(ISpell spell) {
        this.spell = spell;
    }
}
