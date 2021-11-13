package facadePattern.tv;

import facadePattern.Device;

public interface TvStick extends Device {
    String getName();

    void openApp(TvApp tvApp);

    void closeApp(TvApp tvApp);
}
