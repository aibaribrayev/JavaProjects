package inventory;

import actors.Actor;
import java.util.Random;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public void addNewItems() {
        Random random = new Random();
        //adding weapons of random amount from 1 to 10
        int amount = random.nextInt(10) + 1;
        int power;
        //power of item will be randomized inside loop
        for(int i = 0; i < amount; i++)
        {
            power = random.nextInt(100) + 1;
            items.add(new Weapon(power));
        }

        //adding Armors of random amount from 1 to 10
        amount = random.nextInt(10) + 1;
        for(int i = 0; i < amount; i++){
            power = random.nextInt(100) + 1;
            items.add(new Armor(power));
        }

        //adding Poisons of random amount from 1 to 10
        amount = random.nextInt(10) + 1;
        for(int i = 0; i < amount; i++){
            power = random.nextInt(100) + 1;
            items.add(new Poison(power));
        }


        //adding healthPotions
        amount = random.nextInt(10) + 1;
        for(int i = 0; i < amount; i++){
            power = random.nextInt(100) + 1;
            items.add(new HealthPotion(power));
        }
    }

    public String toString(){
        String res = "";
        for(int i = 0; i < items.size(); i++) {
            res += items.get(i).toString();
            if(i != items.size() - 1)
                res += ", ";
        }
        return res;
    }
}
