package jp.ac.uryukyu.ie.e215712;


public class Enemy extends LivingThing{
    public Enemy(String _name, int _hitPoint, int _attack){
        super(_name, _hitPoint, _attack);
    }

    @Override
    public void wounded(int damage){
        int enemyHP = this.getHitPoint() - damage;
        this.setHitPoint(enemyHP);
        if (enemyHP <0){
            this.setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", this.getName());
        }

    }
}