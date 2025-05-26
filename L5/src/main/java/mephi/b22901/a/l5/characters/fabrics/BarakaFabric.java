package mephi.b22901.a.l5.characters.fabrics;

import mephi.b22901.a.l5.characters.ActionType;
import mephi.b22901.a.l5.characters.Baraka;
import mephi.b22901.a.l5.characters.Player;

import javax.swing.*;
import java.awt.*;
import java.net.URL;


public class BarakaFabric extends EnemyAbsractFabric {

    @Override
    public Player create(int level) {
        Player enemy;
        URL iconUrl = this.getClass().getResource("/images/baraka.gif");
        Toolkit tk = Toolkit.getDefaultToolkit();
        enemy = new Baraka(level, 100, 12, ActionType.BLOCK,
                new ImageIcon(tk.getImage(iconUrl)));
        return enemy;
    }
}