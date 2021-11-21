package singletonPattern;

public class LazyInitCoinCalculator {

    private static LazyInitCoinCalculator instance = null;

    private int coins;

    private LazyInitCoinCalculator() {

    }

    public static LazyInitCoinCalculator getInstance() {
        if (instance == null) {
            instance = new LazyInitCoinCalculator();
        }

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
