package characters;

import interfaces.IWeapon;

public abstract class Enemy {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

//    public void enemyDamage(Fighter fighter){
//        setHealth(getHealth() - fighter.attack());
//    }

}
