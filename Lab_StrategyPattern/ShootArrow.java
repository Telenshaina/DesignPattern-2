package Lab_StrategyPattern;

public class ShootArrow implements AttackStrategy {
    public String attack() {
        return "Archer shoots an arrow!";
    }
}
