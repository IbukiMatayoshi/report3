package jp.ac.uryukyu.ie.e215712;

/**
 *  LivingThingクラス。
 *  String name; //自身の名前
 *  int hitPoint; //自身のHP
 *  int attack; //自身の攻撃力
 *  boolean dead; //自身の生死状態。true=死亡。
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、HP、攻撃力を指定する。
     * @param _name 自身の名前
     * @param _hitPoint 自身のHP
     * @param _attack 自身の攻撃力
     */
    public LivingThing(String _name, int _hitPoint, int _attack){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    /**
     * LivingThingへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if (this.dead == false){
            String eName = opponent.getName();
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, eName, damage);
            opponent.wounded(damage);
        } 
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    /**
     * 自身が死んでいるか確認するメソッド。
     * @return　自身の生死状態。
     */
    public boolean isDead(){
        return this.dead;
    }

    /**
     * 自身の名前を確認するメソッド
     * @return　自身の名前
     */
    public String getName(){
        return this.name;
    }

    /**
     * 自身のHPを確認するメソッド
     * @return　自身のHP
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * 自身の攻撃力を確認するメソッド
     * @return　自身の攻撃力
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * 自身の生死状態を設定するメソッド
     * @param _dead　設定後の生死状態
     */
    public void setDead(boolean _dead){
        this.dead = _dead;
    }

    /**
     * 自身の名前を設定するメソッド
     * @param _name　設定後の名前
     */
    public void setName(String _name){
        this.name = _name;
    }

    /**
     * 自身のHPを設定するメソッド
     * @param _hitPoint　設定後のHP
     */
    public void setHitPoint(int _hitPoint){
        this.hitPoint = _hitPoint;
    }

    /**
     * 自身の攻撃力を設定するメソッド
     * @param _attack　設定後の攻撃力
     */
    public void setAttack(int _attack){
        this.attack = _attack;
    }
}
