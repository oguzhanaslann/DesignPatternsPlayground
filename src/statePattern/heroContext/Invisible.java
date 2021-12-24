package statePattern.heroContext;

import statePattern.Hero;

public class Invisible extends HeroState {
    public static Invisible instance;

    private Invisible(Hero hero) {
        super(hero);
    }

    public static Invisible getInstance(Hero hero) {
        if (instance == null) {
            instance = new Invisible(hero);
        }

        return instance;
    }

    @Override
    public void attack() {
        System.out.println("...Hero  is attacking others");
        hero.setHeroState(this);
    }

    @Override
    public void attacked(int damage) {
        System.out.println("...Hero is invisible, and cannot be attacked  ");
    }

    @Override
    public void silenced() {
        System.out.println("...Hero is invisible, and cannot be silenced  ");
    }

    @Override
    public void disappear() {
        System.out.println("...Hero is already invisible , and cannot disappear   ");
    }


    @Override
    public void revive() {
        System.out.println("...Hero is already alive , and cannot be revived   ");
    }

    @Override
    public void recover() {
        System.out.println("...Hero is already recovered, and cannot be recovered  ");
    }

    @Override
    public void appear() {
        System.out.println("..Hero appears");
        hero.setHeroState(AliveState.getInstance(hero));
    }

    @Override
    public String getName() {
        return "invisible";
    }
}
