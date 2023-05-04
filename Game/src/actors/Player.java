package actors;

import java.util.ArrayList;
import inventory.*;

public class Player extends Actor{
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    private ArrayList<Armor> armors = new ArrayList<Armor>();

    public Player(Inventory inventory) {
        super(inventory);
    }

    public String toString(){
        return "Player with inventory: " + this.inv.toString();
    }
}
