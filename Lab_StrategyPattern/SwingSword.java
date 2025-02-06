package Lab_StrategyPattern;

public class SwingSword implements AttackStrategy {
    @Override
    public String attack() {
        return "Knight attacks with a sword!";
    }
}
