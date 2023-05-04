package game;

import actors.*;
import inventory.*;

import java.util.ArrayList;

public class Room{
    private ArrayList<Actor> actors = new ArrayList<>();
    private Inventory inv;
    public Room(Inventory inventory){
        inv = inventory;
    }

    public void addActor(Actor act){
        actors.add(act);
    }

    public void addInventories(){
        inv.addNewItems();
    }
    public String toString(){
        String res = "actors -- ";
        for(int i = 0; i < actors.size(); i++) {
            res += actors.get(i);
            res += "\n";
        }
        return res + "inventory: " + inv.toString();
    }
}
