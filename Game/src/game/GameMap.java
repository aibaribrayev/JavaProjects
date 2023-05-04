package game;


import java.util.ArrayList;
import java.util.Random;
import actors.*;
import inventory.*;

public class GameMap {
    private Room[][] rooms;
    private int maxEnemy;

    public GameMap(int w, int h, int enemylim) {
        rooms = new Room[h][w];
        for(int i = 0; i <  h; i++){
            for(int j = 0; j < w; j++){
                Inventory roomInv = new Inventory();
                rooms[i][j] = new Room(roomInv);
            }
        }
        maxEnemy = enemylim;
    }

    public void addEnemiesAndItems(){
        Random random = new Random();
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[i].length; j++){
                int amount = random.nextInt(maxEnemy) + 1;
                for(int k = 0; k < amount; k++){
                    Inventory enemyinv = new Inventory();
                    enemyinv.addNewItems();
                    rooms[i][j].addActor(new Enemy(enemyinv));}//rundom amount of enemies from 1 to maxEnemy
                rooms[i][j].addInventories();
            }
        }
    }

    public void addPlayer(Player player){
        Random random = new Random();
        int roomRow = random.nextInt(rooms.length);
        int roomColumn = random.nextInt(rooms[0].length);
        rooms[roomRow][roomColumn].addActor(player);
    }

    public String toString(){
        String res = "";
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[i].length; j++) {
                res += "room " + i + "x" + j + ": " + rooms[i][j].toString() + '\n';
            }
        }
        return res;
    }
}
