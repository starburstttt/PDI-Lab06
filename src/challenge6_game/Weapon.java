package challenge6_game;

public class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String use() {
        return name + " (Damage: " + damage + ")";
    }
}
