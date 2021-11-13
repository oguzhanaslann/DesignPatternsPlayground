package facadePattern.tv;

public enum TelevisionSource {
    HDMI_ARC("HDMI Arc");

    private String name;

    TelevisionSource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
