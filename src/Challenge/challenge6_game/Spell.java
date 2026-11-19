package challenge6_game;

public class Spell {
    private String name;
    private int manaCost;

    public Spell(String name, int manaCost) {
        this.name = name;
        this.manaCost = manaCost;
    }

    public String cast() {
        return name + " (Mana: " + manaCost + ")";
    }
}
