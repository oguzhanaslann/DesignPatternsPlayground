package statePattern.heroContext;

import statePattern.Hero;

public abstract class HeroState {

    protected Hero hero;

    public HeroState(Hero hero) {
        this.hero = hero;
    }

    abstract public void attack();

    abstract public void attacked(int damage);

    abstract public void silenced();

    abstract public void disappear();

    abstract public void revive();

    abstract public void recover();

    abstract public void appear();

    abstract public String getName();


}
