package facadePattern.tv;

import facadePattern.Device;

public interface Television extends Device {
    String getName();

    void setSource(TelevisionSource televisionSource);

    void play(String movieName, TvApp tvApp);

}
