package templatePattern;

public class Playground {
    public static void main(String[] args) {
        Computer gamer = new GamerComputer();
        gamer.build();

        Computer office = new OfficeComputer();
        office.build();
    }
}
