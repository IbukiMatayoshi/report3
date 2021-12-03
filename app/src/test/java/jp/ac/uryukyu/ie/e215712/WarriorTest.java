package jp.ac.uryukyu.ie.e215712;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class WarriorTest {
    /**
     * WarriorクラスのattackWithWeaponSkill()メソッドが予想通り実行できているか検証。
     * 検証手順
     * (1)WarriorクラスとEnemyクラスからそれぞれオブジェクトを生成する。
     * (2)Warriorは攻撃力を10に設定し、EnemyはHPを45に設定してWarriorが3回で倒せるようにする。
     * (3)attackWithWeaponSkill()は攻撃力の150%の固定ダメージを与えるメソッド。
     *    つまり、実行後EnemyのHPが0になっていることを期待。これを検証する。
     */
    @Test
    void attackTest(){
        Warrior demoWarrior = new Warrior("デモウォーリアー", 100, 10);
        Enemy demoEnemy = new Enemy("デモエネミー", 45, 1);
        int expectedValue = 0;
        for (int i = 0; i < 3; i++ ){
            demoWarrior.attackWithWeaponSkill(demoEnemy);
        }
        assertEquals(expectedValue, demoEnemy.getHitPoint());
    }
}
