package facadePattern.microwave;

public enum Program {
    PreHeat("Pre-Heat");

    private String name ;

    Program(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
