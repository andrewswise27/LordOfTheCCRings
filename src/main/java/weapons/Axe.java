package weapons;

import interfaces.IWeapon;

public class Axe implements IWeapon {

    @Override
    public int attack() {
        return 25;
    }
}
