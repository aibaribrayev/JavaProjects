import game.*;
import actors.*;
public class Game {
    private GameMap gameMap;
    private Player player;

    public Game(int width, int height, int maxenemies, Player player) {
        gameMap = new GameMap(width, height, maxenemies);
        this.player = player;
    }

    public void fillGamemap(){
        gameMap.addEnemiesAndItems();
        gameMap.addPlayer(player);
    }

    public String toString(){
        return gameMap.toString();
    }
}
