package facadePattern.refrigerator;

import facadePattern.Device;

public interface Refrigerator extends Device {
    String getName();

    void setCooling(Cooling party);
}
