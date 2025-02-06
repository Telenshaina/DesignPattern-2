package Lab_StrategyPattern;

import java.util.List;

// Character Class with Composable Strategies
public class Character {
    private String name;
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Character(String name, AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategies) {
        this.name = name;
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    public void attack() {
        System.out.println(name + ": " + attackStrategy.attack());
    }

    public void defend() {
        System.out.println(name + " defends:");
        for (DefenseStrategy defenseStrategy : defenseStrategies) {
            System.out.println(" - " + defenseStrategy.defend());
        }
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategies(List<DefenseStrategy> defenseStrategies) {
        this.defenseStrategies = defenseStrategies;
    }
}
