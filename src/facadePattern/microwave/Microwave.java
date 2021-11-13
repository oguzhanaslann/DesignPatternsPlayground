package facadePattern.microwave;

import facadePattern.Device;
import facadePattern.meal.Meal;

public interface Microwave extends Device {
    String getName();

    void setUpProgram(Program preHeat, Temperature cecilius, int minutes);

    void turnOnGrill();

    void bake(Meal meal, Temperature cecilius, int minutes);
}
