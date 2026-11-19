package challenge6_game;

public class Warrior extends Character {
    private Weapon weapon;

    public Warrior(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println(name + " swings " + weapon.use());
    }
}
