package Refactored;

public class Character{
    private Type type;

    public Character(Type type) {
        this.type = type;
    }

    public void setCharacterType(Type type) {
        this.type = type;
    }

    public void attack() {
        System.out.println(type.attack());
    }

    public void defend() {
        System.out.println(type.defend());
    }
}
