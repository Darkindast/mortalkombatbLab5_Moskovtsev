package mephi.b22901.a.l5.characters.fabrics;

import mephi.b22901.a.l5.characters.ActionType;
import mephi.b22901.a.l5.characters.Player;
import mephi.b22901.a.l5.characters.ShaoKahn;

import javax.swing.*;


public class ShaoKahnFabric extends EnemyAbsractFabric {

    @Override
    public Player create(int level) {
        Player enemy =  new ShaoKahn(level, 100, 30, ActionType.HIT,
                new ImageIcon(getClass().getResource("/images/shao kahn.gif")));
        enemy.setBoss(true);
        return enemy;
    }
}