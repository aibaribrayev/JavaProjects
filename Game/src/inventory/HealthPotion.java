package inventory;

public class HealthPotion extends Consumable {
    private int healingPower;

    public HealthPotion(int hp){
        healingPower = hp;
    }

    public String toString(){
        return "Health Potion " + healingPower;
    }
}
