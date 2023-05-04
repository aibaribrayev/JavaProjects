package inventory;

public class Poison extends Consumable{
    private int destroyPower;
    public Poison(int dp){
        destroyPower = dp;
    }

    public String toString() {
        return "Poison with destroypower " + destroyPower;
    }
}
