package statePattern.heroContext;

import statePattern.Hero;

public class Silenced extends HeroState {

    public static Silenced instance;

    private Silenced(Hero hero) {
        super(hero);
    }

    public static Silenced getInstance(Hero hero) {
        if (instance == null) {
            instance = new Silenced(hero);
        }

        return instance;
    }

    @Override
    public void attack() {
        System.out.println("...Hero is silenced, and cannot attack others");
    }

    @Override
    public void attacked(int damage) {
        System.out.println("...Hero being attacked damage : " + damage);
        if (damage > hero.getHp()) {
            hero.setHp(0);
            hero.setHeroState(
                    DeadState.getInstance(hero)
            );
        } else {
            hero.setHp(
                    hero.getHp() - damage
            );
        }
    }

    @Override
    public void silenced() {
        System.out.println("...Hero is already silenced, and cannot be silenced again");
    }

    @Override
    public void disappear() {
        System.out.println("...Hero disappears");
        hero.setHeroState(Invisible.getInstance(hero));
    }

    @Override
    public void revive() {
        System.out.println("...Hero is already alive but silenced, and cannot be revived  ");
    }

    @Override
    public void recover() {
        hero.setHeroState(AliveState.getInstance(hero));
    }

    @Override
    public void appear() {
        System.out.println("...Hero is already visible, and cannot appear");
    }

    @Override
    public String getName() {
        return "silenced";
    }
}
