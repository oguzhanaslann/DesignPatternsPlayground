package facadePattern.refrigerator;

public enum Cooling {
    Party("Party"),
    Normal("Normal");
    private String name ;

    Cooling(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
