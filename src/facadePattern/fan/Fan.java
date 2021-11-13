package facadePattern.fan;

import facadePattern.Device;

public interface Fan extends Device {
    String getName();

    void setSpeed(FanSpeed secondLevel);
}
