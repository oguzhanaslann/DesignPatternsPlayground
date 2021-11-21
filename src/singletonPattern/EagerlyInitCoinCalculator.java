package singletonPattern;

public class EagerlyInitCoinCalculator {

    private static final EagerlyInitCoinCalculator instance = new EagerlyInitCoinCalculator();

    private int coins;


    private EagerlyInitCoinCalculator() {

    }

    public static EagerlyInitCoinCalculator getInstance() {
        return instance;
    }

    public void addCoins() {
        coins += 10;
    }

    public void removeCoin() {
        coins -= 1;
    }

    public int getCoinCount() {
        return coins;
    }
}
