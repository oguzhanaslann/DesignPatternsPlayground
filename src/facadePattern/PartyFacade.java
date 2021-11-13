package facadePattern;

import facadePattern.cofeemaker.CoffeeMaker;
import facadePattern.fan.Fan;
import facadePattern.fan.FanSpeed;
import facadePattern.grill.Grill;
import facadePattern.light.Light;
import facadePattern.meal.Meal;
import facadePattern.microwave.Cecilius;
import facadePattern.microwave.Microwave;
import facadePattern.microwave.Program;
import facadePattern.refrigerator.Cooling;
import facadePattern.refrigerator.Refrigerator;
import facadePattern.sounbar.SoundBarMode;
import facadePattern.sounbar.Soundbar;
import facadePattern.tv.Television;
import facadePattern.tv.TelevisionSource;
import facadePattern.tv.TvApp;
import facadePattern.tv.TvStick;

import java.util.List;

public class PartyFacade {
    private Fan fan;
    private Light roomLight;
    private Television television;
    private TvApp tvApp;
    private TvStick tvStick;
    private Soundbar soundbar;

    private Light kitchenLight;


    private Refrigerator refrigerator;
    private Microwave microwave;
    private Grill grill;
    private CoffeeMaker coffeeMaker;


    public PartyFacade(Fan fan,
                       Light roomLight,
                       Television television,
                       TvStick tvStick,
                       Soundbar soundbar,
                       Light kitchenLight,
                       Refrigerator refrigerator,
                       Microwave microwave,
                       Grill grill,
                       CoffeeMaker coffeeMaker) {
        this.fan = fan;
        this.roomLight = roomLight;
        this.television = television;
        this.tvStick = tvStick;
        this.soundbar = soundbar;
        this.kitchenLight = kitchenLight;
        this.refrigerator = refrigerator;
        this.microwave = microwave;
        this.grill = grill;
        this.coffeeMaker = coffeeMaker;
    }

    public void setUpMovie(String movieName, TvApp tvApp) {

        System.out.println("Setting up  movie..");
        System.out.println("Turning on '" + fan.getName() + "'");
        fan.turnOn();
        System.out.println("Encreasing speed of '" + fan.getName() + "' to '" + FanSpeed.SecondLevel.getLevel() + "'");
        fan.setSpeed(FanSpeed.SecondLevel);

        System.out.println("Turning on '" + roomLight.getName() + "'");
        roomLight.turnOn();

        System.out.println("Turning on '" + television.getName() + "'");
        television.turnOn();
        System.out.println("Setting source of '" + television.getName() + "' to '" + TelevisionSource.HDMI_ARC.getName() + "'");
        television.setSource(TelevisionSource.HDMI_ARC);

        System.out.println("Turning on '" + tvStick.getName() + "'");
        tvStick.turnOn();

        System.out.println("Turning on '" + soundbar.getName() + "'");
        soundbar.turnOn();
        System.out.println("Setting Sound-Mode of '" + soundbar.getName() + "' to '" + SoundBarMode.DolbyAtmos.getName() + "'");
        soundbar.setSoundMode(SoundBarMode.DolbyAtmos);

        System.out.println("Opening '" + tvApp.getName() + "' on '" + tvStick.getName() + "'");
        tvStick.openApp(tvApp);
        this.tvApp = tvApp;

        System.out.println("Searching '" + movieName + "' on '" + tvApp.getName() + "'");
        tvApp.search(movieName);

        System.out.println("Dimming '" + roomLight.getName() + "'");
        roomLight.dim();

        System.out.println("Setting volume of '" + soundbar.getName() + "' to '20'");
        soundbar.setSoundLevel(20);

        System.out.println("Playing '" + movieName + "' on '" + tvApp.getName()+"'");
        television.play(movieName, tvApp);
    }


    public void stopMovie() {
        System.out.println("Stopping Movie...");

        System.out.println("Closing '" + tvApp.getName() + "' on '" + tvStick.getName() + "'");
        tvStick.closeApp(tvApp);

        System.out.println("Turning off '" + tvStick.getName() + "'");
        tvStick.turnOff();

        System.out.println("Turning off '" + soundbar.getName() + "'");
        soundbar.turnOff();

        System.out.println("Turning off '" + television.getName() + "'");
        television.turnOff();

        System.out.println("Setting brightness of '" + roomLight.getName() + "' to '100'");
        roomLight.bright();
    }


    public void preparePartyMeals(List<Meal> mealsForParty) {
        System.out.println("Preparing food...");
        System.out.println("Turning on '" + kitchenLight.getName() + "'");
        kitchenLight.turnOn();

        System.out.println("Turning on '" + refrigerator.getName() + "'");
        refrigerator.turnOn();
        System.out.println("Setting '" + refrigerator.getName() + "' Cooling to '" + Cooling.Party.getName() + "'");
        refrigerator.setCooling(Cooling.Party);

        System.out.println("Turning on '" + microwave.getName() + "'");
        microwave.turnOn();
        System.out.println("Setting '" + microwave.getName() + "' on to '" + Program.PreHeat.getName() + "', temperature '200' , time '5' minutes");
        microwave.setUpProgram(Program.PreHeat, new Cecilius(200), 5);
        System.out.println("Turning on  grill of '" + microwave.getName() + "'");
        microwave.turnOnGrill();

        System.out.println("Turning on '" + grill.getName() + "'");
        grill.turnOn();

        System.out.println("Turning on '" + coffeeMaker.getName() + "'");
        coffeeMaker.turnOn();

        mealsForParty.forEach(
                (meal -> {
                    System.out.println("Baking '" + meal.getName() + "' in '" + microwave.getName() + "' for temperature '400' time '10' minutes");
                    microwave.bake(meal, new Cecilius(400), 10);
                })
        );

    }


    public void closeKitchen() {
        System.out.println("Setting '" + refrigerator.getName() + "' Cooling to '" + Cooling.Normal.getName() + "'");
        refrigerator.setCooling(Cooling.Normal);

        System.out.println("Turning on '" + grill.getName() + "'");
        grill.turnOff();

        System.out.println("Turning on '" + coffeeMaker.getName() + "'");
        coffeeMaker.turnOff();

        System.out.println("Turning on '" + microwave.getName() + "'");
        microwave.turnOff();
    }


}
