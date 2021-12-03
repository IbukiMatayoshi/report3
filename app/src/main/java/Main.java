import jp.ac.uryukyu.ie.e215712.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("勇者", 10, 6);
        Enemy enemy = new Enemy("スライム", 6, 3);

        String heroName = warrior.getName();
        String enemyName = enemy.getName();

        System.out.printf("%s vs. %s\n", heroName, enemyName);

        int turn = 0;
        while( warrior.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeaponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}