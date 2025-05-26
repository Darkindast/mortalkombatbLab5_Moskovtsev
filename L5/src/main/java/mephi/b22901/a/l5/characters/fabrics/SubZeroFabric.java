package mephi.b22901.a.l5.characters.fabrics;

import mephi.b22901.a.l5.characters.ActionType;
import mephi.b22901.a.l5.characters.Player;
import mephi.b22901.a.l5.characters.SubZero;

import javax.swing.*;
import mephi.b22901.a.l5.characters.ActionType;
import mephi.b22901.a.l5.characters.Player;
import mephi.b22901.a.l5.characters.SubZero;


public class SubZeroFabric extends EnemyAbsractFabric {

    @Override
    public Player create(int level) {
        Player enemy;
        enemy = new SubZero(level, 60, 16, ActionType.HIT,
                new ImageIcon(getClass().getResource("/images/subzero.gif")));
        return enemy;
    }
}
