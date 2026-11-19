package challenge6_game;

public class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " prepares to attack.");
    }
}
