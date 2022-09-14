package weapons;

import interfaces.IWeapon;

public class Club implements IWeapon {

    @Override
    public int attack() {
        return 10;
    }
}
