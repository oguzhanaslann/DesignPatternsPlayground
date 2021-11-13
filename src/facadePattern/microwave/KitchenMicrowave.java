package facadePattern.microwave;

import facadePattern.meal.Meal;

public class KitchenMicrowave implements Microwave{
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public String getName() {
        return "KitchenMicrowave";
    }

    @Override
    public void setUpProgram(Program preHeat, Temperature cecilius, int minutes) {

    }

    @Override
    public void turnOnGrill() {

    }

    @Override
    public void bake(Meal meal, Temperature cecilius, int minutes) {
    }
}
