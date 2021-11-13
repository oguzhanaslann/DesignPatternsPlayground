package facadePattern.sounbar;

import facadePattern.Device;

public interface Soundbar  extends Device {
    String getName();

    void setSoundMode(SoundBarMode dolbyAtmos);

    void setSoundLevel(int i);
}

