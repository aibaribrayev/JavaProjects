import actors.Player;
import inventory.Inventory;

public class Main {
    public static void main(String[] args) {
        Inventory playerInv = new Inventory();
        playerInv.addNewItems();//adding random items to the inventory
        Player player = new Player(playerInv);//new player instance
        Game game = new Game(2, 2, 4, player);
        game.fillGamemap();
        System.out.print(game);
    }
}