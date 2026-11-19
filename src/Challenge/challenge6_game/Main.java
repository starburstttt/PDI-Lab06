package challenge6_game;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior("Arthur", new Weapon("Excalibur", 50));
        Character wizard = new Wizard("Merlin", new Spell("Fireball", 30));

        warrior.attack();
        wizard.attack();
    }
}
