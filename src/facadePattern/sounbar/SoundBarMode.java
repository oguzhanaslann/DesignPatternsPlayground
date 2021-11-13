package facadePattern.sounbar;

public enum SoundBarMode {
    DolbyAtmos("Dolby Atmos");

    private String name;
    SoundBarMode(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
