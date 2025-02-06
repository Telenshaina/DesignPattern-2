package Lab_StrategyPattern;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Knight: Swings a sword and uses Shield, Dodge, and Magic Barrier for defense
        Character knight = new Character("Knight",
                new SwingSword(),
                Arrays.asList(new Shield(), new Dodge(), new CreateMagicBarrier()));
        knight.attack();
        knight.defend();

        System.out.println();

        // Wizard: Casts spells and uses Magic Barrier for defense
        Character wizard = new Character("Wizard",
                new CastSpell(),
                Arrays.asList(new CreateMagicBarrier()));
        wizard.attack();
        wizard.defend();

        System.out.println();

        // Archer: Shoots arrows and uses Dodge for defense
        Character archer = new Character("Archer",
                new ShootArrow(),
                Arrays.asList(new Dodge()));
        archer.attack();
        archer.defend();
    }
}
