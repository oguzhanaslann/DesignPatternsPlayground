package singletonPattern;

public class ThreadSafeCoinCalculator {

    private static ThreadSafeCoinCalculator instance = null;

    private int coins;

    private ThreadSafeCoinCalculator() {

    }

    public static ThreadSafeCoinCalculator getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeCoinCalculator.class) {
                instance = new ThreadSafeCoinCalculator();
            }
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
