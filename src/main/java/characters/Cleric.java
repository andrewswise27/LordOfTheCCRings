package characters;

import interfaces.IHeal;

public class Cleric {

    private String name;
    private int health;
    private IHeal heal;

    public Cleric(String name, int health, IHeal heal) {
        this.name = name;
        this.health = health;
        this.heal = heal;
    }

    public void healPlayer(Player player){
        player.setHealth(player.getHealth() + heal.heal());
    }
}
