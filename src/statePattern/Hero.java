package statePattern;

import statePattern.heroContext.HeroState;

public class Hero {

    public static final int MAX_HP = 100;

    private int hp = MAX_HP;

    private HeroState heroState;

    public void attack() {
        heroState.attack();
    }

    public void attacked(int damage) {
        int realDamage = Math.min(damage, MAX_HP);
        heroState.attacked(realDamage);
    }

    public void silenced() {
        heroState.silenced();
    }

    public void disappear() {
        heroState.disappear();
    }

    public void revive() {
        heroState.revive();
    }

    public void recover() {
        heroState.recover();
    }

    public void appear() {
        heroState.appear();
    }

    public void setHeroState(HeroState heroState) {
        this.heroState = heroState;
        printContext();
    }

    private void printContext() {
        System.out.println();
        System.out.println("------------------");
        System.out.println("-- Hero context --");
        System.out.println("-- Hero hp : " + hp+" --");
        System.out.println("-- Hero is " + heroState.getName());
        System.out.println("------------------");
        System.out.println();
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
