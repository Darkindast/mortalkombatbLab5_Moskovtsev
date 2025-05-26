package mephi.b22901.a.l5.characters.fabrics;

import mephi.b22901.a.l5.characters.Player;


public class EnemyFabric {

    /**
     * Метод, генерирующий случайного врага, характеристики которого зависят от уровня игрока
     * @return объект Player, являющийся врагом
     */
    public static Player createEnemy(int level) {
        EnemyAbsractFabric fabric = null;
        int i = (int) (Math.random() * 3);
        switch (i) {
            case 0 -> fabric = new BarakaFabric();
            case 1 -> fabric = new SubZeroFabric();
            case 2 -> fabric = new LiuKangFabric();
//            case 3 -> fabric = new SonyaBladeFabric();
        }
        return fabric.create(level);
    }

    /**
     * Метод, генерирующий случайного босса, характеристики которого зависят от уровня игрока
     * @return объект Player, являющийся врагом
     */
    public static Player createBoss(int level) {
        EnemyAbsractFabric fabric = null;
        int i = (int) (Math.random() * 2);
        switch (i) {
            case 0 -> fabric = new ShaoKahnFabric();
            case 1 -> fabric = new GoroFabric();
        }
        return fabric.create(level);
    }
}