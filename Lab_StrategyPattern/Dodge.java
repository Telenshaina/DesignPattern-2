package Lab_StrategyPattern;

public class Dodge implements DefenseStrategy {
    public String defend(){
        return "Dodgin to avoid attack!\n";
    }
}
