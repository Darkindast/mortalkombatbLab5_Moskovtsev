package mephi.b22901.a.l5.general;

import mephi.b22901.a.l5.gameComponents.Game;
import mephi.b22901.a.l5.characters.Human;
import mephi.b22901.a.l5.characters.Player;



public class Manager {
    private Game game;
    public Manager() {
    }

    public void setLocationForGame(int location) {
        game = new Game(location);
    }
    public Game getGame() {
        return game;
    }
    public void attack() {
        game.attack(game);
    }
    public void defence() {
        game.defence(game);
    }

    public Player getEnemy(){
        return game.getEnemies().get(game.getRound());
    }
    public Human getPlayer(){
        return game.getHuman();
    }
}