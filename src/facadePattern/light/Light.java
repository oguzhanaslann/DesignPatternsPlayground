package facadePattern.light;

import facadePattern.Device;

public interface Light extends Device {
    String getName();

    void dim();

    void bright();
}
