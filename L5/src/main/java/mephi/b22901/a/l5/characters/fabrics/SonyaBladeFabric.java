package mephi.b22901.a.l5.characters.fabrics;

import mephi.b22901.a.l5.characters.ActionType;
import mephi.b22901.a.l5.characters.Player;
import mephi.b22901.a.l5.characters.SonyaBlade;

import javax.swing.*;


public class SonyaBladeFabric extends EnemyAbsractFabric {

    @Override
    public Player create(int level) {
        Player enemy =  new SonyaBlade(level, 80, 16, ActionType.HIT,
                new ImageIcon(getClass().getResource("/images/sonya blade.gif")));
        return enemy;
    }
}
