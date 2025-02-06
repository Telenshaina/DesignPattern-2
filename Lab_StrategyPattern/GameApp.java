package Lab_StrategyPattern;

import java.util.Arrays;
public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character("Knight",
                new SwingSword(),
                Arrays.asList(new Shield(), new Dodge(), new CreateMagicBarrier()));
        knight.attack();
        knight.defend();

        System.out.println();
        Character wizard = new Character("Wizard",
                new CastSpell(),
                Arrays.asList(new CreateMagicBarrier()));
        wizard.attack();
        wizard.defend();

        System.out.println();
        
        Character archer = new Character("Archer",
                new ShootArrow(),
                Arrays.asList(new Dodge()));
        archer.attack();
        archer.defend();
    }
}
