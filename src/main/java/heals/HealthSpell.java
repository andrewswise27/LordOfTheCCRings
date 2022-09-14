package heals;

import interfaces.IHeal;

public class HealthSpell implements IHeal {

    @Override
    public int heal() {
        return 60;
    }
}
