package statePattern.heroContext;

import statePattern.Hero;

public class DeadState extends HeroState {

    public static DeadState instance ;

    public static DeadState getInstance(Hero hero) {
        if (instance == null) {
            instance = new DeadState(hero);
        }

        return instance;
    }

    private DeadState(Hero hero) {
        super(hero);
    }

    @Override
    public void attack() {
        System.out.println("...Hero is already dead, and cannot attack  ");
    }

    @Override
    public void attacked(int damage) {
        System.out.println("...Hero is already dead, and cannot be attacked ");
    }

    @Override
    public void silenced() {
        System.out.println("...Hero is already dead, and cannot be silenced  ");

    }

    @Override
    public void disappear() {
        System.out.println("...Hero is already dead, and cannot disappear  ");
    }

    @Override
    public void revive() {
        System.out.println("...Hero is being recovered  ");
        hero.setHp(Hero.MAX_HP);
        hero.setHeroState(AliveState.getInstance(hero));
    }

    @Override
    public void recover() {
        System.out.println("...Hero is already dead, and cannot be recovered  ");

    }

    @Override
    public void appear() {
        System.out.println("...Hero is already dead, and cannot appear  ");
    }

    @Override
    public String getName() {
        return "dead";
    }
}
