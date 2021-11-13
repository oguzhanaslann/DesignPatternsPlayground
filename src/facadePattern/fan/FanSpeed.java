package facadePattern.fan;

public enum FanSpeed {

    FirstLevel(1),
    SecondLevel(2),
    ThirdLevel(3),
    FourthLevel(4),
    FifthLevel(5);

    private int level;

    FanSpeed(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
