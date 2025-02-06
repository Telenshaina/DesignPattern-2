package Lab_StrategyPattern;
public class CastSpell implements AttackStrategy {
    @Override
    public String attack() {
        return "Wizard casts a spell!";
    }
}