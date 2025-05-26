package mephi.b22901.a.l5.characters.fabrics;

import mephi.b22901.a.l5.characters.ActionType;
import mephi.b22901.a.l5.characters.LiuKang;
import mephi.b22901.a.l5.characters.Player;

import javax.swing.*;
import java.awt.*;
import java.net.URL;


import javax.swing.*;
import java.awt.*;
import java.net.URL;


public class LiuKangFabric extends EnemyAbsractFabric {

    @Override
    public Player create(int level) {
        Player enemy;
//        Toolkit tk = Toolkit.getDefaultToolkit();
        enemy = new LiuKang(level, 70, 20, ActionType.HIT,
                new ImageIcon(getClass().getResource("/images/Liu_Kang.gif")));
        return enemy;
    }
}