package jp.ac.uryukyu.ie.e215712;

public class Hero extends LivingThing{
    public Hero(String _name, int _hitPoint, int _attack){
        super(_name, _hitPoint, _attack);   
    }

    @Override
    public void wounded(int damage){
        int heroHP = this.getHitPoint() - damage;
        this.setHitPoint(heroHP);
        if (heroHP <0){
            this.setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", this.getName());
        }
        
    }
}