package weapons;

import interfaces.IWeapon;

public class Sword implements IWeapon {

    @Override
    public int attack() {
        return 20;
    }
}
