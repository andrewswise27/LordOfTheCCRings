package characters;

import interfaces.IDefend;
import interfaces.ISpell;

public class Wizard extends Mage{

    private ISpell spell;

    public Wizard(String name, int health, IDefend defend, ISpell spell) {
        super(name, health, defend);
        this.spell = spell;
    }

    public void changeSpell(ISpell spell) {
        this.spell = spell;
    }

    public ISpell getSpell() {
        return spell;
    }
}
