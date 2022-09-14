package heals;

import interfaces.IHeal;

public class HamHock implements IHeal {

    @Override
    public int heal() {
        return 20;
    }
}
