package mephi.b22901.a.l5.characters;

import javax.swing.*;


public class LiuKang extends Player {

    public LiuKang(int level, int health, int damage, ActionType attack, ImageIcon icon) {
        super(level, health, damage, attack, icon);
    }

    @Override
    public String getName() {
        return "Liu Kang";
    }
}