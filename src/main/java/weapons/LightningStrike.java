package weapons;

import interfaces.ISpell;

public class LightningStrike implements ISpell {

    @Override
    public int cast() {
        return 50;
    }
}
