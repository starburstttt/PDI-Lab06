package challenge6_game;

public class Wizard extends Character {
    private Spell spell;

    public Wizard(String name, Spell spell) {
        super(name);
        this.spell = spell;
    }

    @Override
    public void attack() {
        System.out.println(name + " casts " + spell.cast());
    }
}
