/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.a.l5.characters.fabrics;

import mephi.b22901.a.l5.characters.ActionType;
import mephi.b22901.a.l5.characters.Goro;
import mephi.b22901.a.l5.characters.Player;

import javax.swing.*;
import java.awt.*;
import java.net.URL;


import javax.swing.*;
import java.awt.*;
import java.net.URL;



public class GoroFabric extends EnemyAbsractFabric{
    @Override
    public Player create(int level) {
        Player enemy =  new Goro(level, 110, 32, ActionType.HIT,
                new ImageIcon(getClass().getResource("/images/Goro.gif")));
        enemy.setBoss(true);
        return enemy;
    }
}
