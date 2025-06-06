package mephi.b22901.a.l5.actions;


import mephi.b22901.a.l5.characters.Player;
import mephi.b22901.a.l5.gameComponents.Game;

public class DebuffAction extends GameAction{
    public void performAction(Game game) {
        if (enemyMoves.isEmpty()) {
            setEnemyMoves(game);
        }
        game.getCurrentEnemy().setAttack(enemyMoves.pollFirst());
        playerUseDebaff(game);

        endRoundCheck(game);
    }

    /**
     * Метод, вызывающийся при нажатии игроком кнопки "дебафф"
     * @param game объект текущей игры
     */
    public void playerUseDebaff(Game game) {
        Player enemy = game.getEnemies().get(game.getRound());
        Player human = game.getHuman();
        switch (enemy.getAttack()) {
            case BLOCK -> {
                int i = (int) (Math.random() * 100);
                if (i <= 70) {
                    enemy.setDebuffed(true);
                    enemy.setDebufferedCount(human.getLevel());
                    game.setTurnResult(enemy.getName() + " debuffed");
                }
            }
            case HIT -> {
                human.setHealth((int) (human.getHealth() - ((enemy.getDamage()) * 1.15)));
                game.setTurnResult(enemy.getName() + "Enemy debuffed");
            }
        }
    }

}