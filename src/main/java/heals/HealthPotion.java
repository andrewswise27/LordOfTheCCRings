package heals;

import interfaces.IHeal;

public class HealthPotion implements IHeal {

    @Override
    public int heal() {
        return 40;
    }
}
