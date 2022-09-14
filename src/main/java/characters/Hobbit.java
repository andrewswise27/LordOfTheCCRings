package characters;

import interfaces.IWeapon;

public class Hobbit extends Fighter{

    public Hobbit(String name, int health, IWeapon weapon) {
        super(name, health, weapon);
    }

    public void hide(){
        setHealth(getHealth() + 20);
    }

}
