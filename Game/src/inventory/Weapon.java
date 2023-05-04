package inventory;

public class Weapon extends Equipment {
    private int attackPower;
    public Weapon(int ap){
        attackPower = ap;
    }

    public String toString() {
        return "Weapon with power " + attackPower;
    }


}
