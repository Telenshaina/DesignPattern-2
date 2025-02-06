package Refactored;
public class Knight implements Type{
    public String attack(){
        return "Knight attacks with a sword!";
    }

    public String defend(){
        return "Using a shield to defend!\n" +
                   "Dodgin to avoid attack!\n"+
                   "Creating a magic barrier for defense!";
        
    }
}

