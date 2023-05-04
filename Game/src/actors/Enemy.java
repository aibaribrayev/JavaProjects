package actors;
import inventory.*;
public class Enemy extends Actor{
    public String toString(){
        return "Enemy with inventory: " + super.inv.toString();
    };
    public Enemy(Inventory inventory){
        super(inventory);
    }
}
