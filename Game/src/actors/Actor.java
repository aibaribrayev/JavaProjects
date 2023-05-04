package actors;

import inventory.*;

import java.util.ArrayList;

public abstract class Actor{
    private ArrayList<Consumable> consumables = new ArrayList<>();
    protected Inventory inv;


    public Actor(Inventory inventory){
        inv = inventory;
    }
}
