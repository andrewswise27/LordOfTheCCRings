package weapons;

import interfaces.ISpell;

public class Fireball implements ISpell {

    @Override
    public int cast() {
        return 30;
    }
}
