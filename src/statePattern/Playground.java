package statePattern;

import statePattern.heroContext.AliveState;

public class Playground {

    public static void main(String[] args) {

        Hero hero = new Hero();
        AliveState aliveState = AliveState.getInstance(hero) ;
        hero.setHeroState(aliveState);
        hero.attacked(5);
        hero.attack();
        hero.appear();
        hero.recover();
        hero.revive();
        hero.disappear();
        hero.disappear();
        hero.attacked(5);
        hero.silenced();
        hero.recover();
        hero.revive();
        hero.attack();
        hero.appear();
        hero.attacked(95);
        hero.appear();
        hero.disappear();
        hero.attack();
        hero.attacked(5);
        hero.recover();
        hero.silenced();
        hero.revive();
        hero.silenced();
        hero.appear();
        hero.attack();
        hero.silenced();
        hero.revive();
        hero.disappear();
        hero.appear();
        hero.attacked(5);
        hero.recover();
        hero.silenced();
        hero.attacked(100);
        hero.revive();
    }
}
