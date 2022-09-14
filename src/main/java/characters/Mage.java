package characters;

import interfaces.IDefend;

public abstract class Mage extends Player{

    private IDefend defend;

    public Mage(String name, int health, IDefend defend) {
        super(name, health);
        this.defend = defend;
    }

    public void defend(Enemy enemy){
        enemy.setHealth(enemy.getHealth() - defend.defend());
    }

    public void changeDefend(IDefend defend) {
        this.defend = defend;
    }

    public IDefend getDefend() {
        return defend;
    }
}
