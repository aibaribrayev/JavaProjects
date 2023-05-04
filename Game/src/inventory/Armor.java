package inventory;

public class Armor extends Equipment {
    private int defencePower;
    public Armor(int dp){
        defencePower = dp;
    }

    public String toString() {
        return "Armor " + defencePower;
    }
}
