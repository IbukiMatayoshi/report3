package jp.ac.uryukyu.ie.e215712;

public class Warrior extends Hero {
    
    public Warrior(String _name, int _hitPoint, int _attack){
        super(_name, _hitPoint, _attack);
    }

    public void attackWithWeaponSkill(LivingThing opponent){
        if (this.isDead() == false){
            String eName = opponent.getName();
            int damage = (int)(this.getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", this.getName(),eName,damage);
            opponent.wounded(damage);
        }
    }
}
