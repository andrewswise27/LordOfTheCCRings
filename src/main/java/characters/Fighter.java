package characters;

import interfaces.IWeapon;
import quest.Exits;

public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - weapon.attack());
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
