package singletonPattern;

public class Playground {
    public static void main(String[] args) {
        /** You can check others as well */

        LazyInitCoinCalculator coinCalculator1 = LazyInitCoinCalculator.getInstance();
        LazyInitCoinCalculator coinCalculator2 = LazyInitCoinCalculator.getInstance();

        coinCalculator1.addCoins();

        System.out.println("coinCalculator1.getCoinCount() = " + coinCalculator1.getCoinCount());
        System.out.println("coinCalculator2.getCoinCount() = " + coinCalculator2.getCoinCount());

        coinCalculator2.removeCoin();

        System.out.println("coinCalculator1.getCoinCount() = " + coinCalculator1.getCoinCount());
        System.out.println("coinCalculator2.getCoinCount() = " + coinCalculator2.getCoinCount());


        System.out.println("coinCalculator1 :" + coinCalculator1);
        System.out.println("coinCalculator2 :" + coinCalculator2);


    }
}
