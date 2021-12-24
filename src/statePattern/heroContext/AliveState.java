package statePattern.heroContext;

import statePattern.Hero;

public class AliveState extends HeroState {
    public static AliveState instance;

    private AliveState(Hero hero) {
        super(hero);
    }

    public static AliveState getInstance(Hero hero) {
        if (instance == null) {
            instance = new AliveState(hero);
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
            hero.setHeroState(this);
        }


    }

    @Override
    public void silenced() {
        System.out.println("...Hero is silenced ");
        hero.setHeroState(Silenced.getInstance(hero));
    }

    @Override
    public void disappear() {
        System.out.println("...Hero disappears ");
        hero.setHeroState(Invisible.getInstance(hero));
    }

    @Override
    public void revive() {
        System.out.println("...Hero is already alive, and cannot be revived  ");
    }

    @Override
    public void recover() {
        System.out.println("...Hero is already recovered, and cannot be recovered  ");
    }

    @Override
    public void appear() {
        System.out.println("...Hero is already visible, and cannot appear");
    }

    @Override
    public String getName() {
        return "alive";
    }
}
