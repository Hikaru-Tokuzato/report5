package jp.ac.uryukyu.ie.e195748;

/**
 * @author e195748
 */

/**
 *　LivingThingのメソッド
 */
public class LivingThing {

    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }
    /**
     * @param name ... test
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public int getAttack(){
        return attack;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public boolean getDead(){
        return dead;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }

    public void attack(LivingThing opponent) {
        if (!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}