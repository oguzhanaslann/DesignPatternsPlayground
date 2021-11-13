package facadePattern;

import facadePattern.cofeemaker.CoffeeMaker;
import facadePattern.cofeemaker.KitchenCoffeeMaker;
import facadePattern.fan.Fan;
import facadePattern.fan.LivingRoomFan;
import facadePattern.grill.ElectricGrill;
import facadePattern.grill.Grill;
import facadePattern.light.KitchenLight;
import facadePattern.light.Light;
import facadePattern.light.LivingRoomLight;
import facadePattern.meal.Meal;
import facadePattern.microwave.KitchenMicrowave;
import facadePattern.microwave.Microwave;
import facadePattern.refrigerator.KitchenRefrigerator;
import facadePattern.refrigerator.Refrigerator;
import facadePattern.sounbar.LivingRoomSoundBar;
import facadePattern.sounbar.Soundbar;
import facadePattern.tv.*;

import java.util.ArrayList;

public class Playground {
    public static void main(String[] args) {

        Fan livingRoomFan = new LivingRoomFan();
        Light livingRoomLight = new LivingRoomLight();
        Television livingRoomTelevision = new LivingRoomTv();
        TvStick tvStick = new LivingRoomFireTv4kStick();
        Soundbar livingRoomSoundbar = new LivingRoomSoundBar();
        Light kitchenLight = new KitchenLight();
        Refrigerator refrigerator = new KitchenRefrigerator();
        Microwave microwave = new KitchenMicrowave();
        Grill grill = new ElectricGrill();
        CoffeeMaker coffeeMaker = new KitchenCoffeeMaker();

        PartyFacade partyFacade = new PartyFacade(livingRoomFan,
                livingRoomLight,
                livingRoomTelevision,
                tvStick,
                livingRoomSoundbar,
                kitchenLight,
                refrigerator,
                microwave,
                grill,
                coffeeMaker
        );


        System.out.println("Weekend : Enjoying with friends and family at home...");
        System.out.println("--------------------------------------------------------------");
        partyFacade.setUpMovie("Spider-Man: Far From Home", new TvApp("Netflix"));
        System.out.println("--------------------------------------------------------------");
        ArrayList<Meal> partyMeals = new ArrayList<>();
        partyMeals.add(Meal.NapoletanaPizza);
        partyMeals.add(Meal.MargheritaPizza);
        partyMeals.add(Meal.MarinaraPizza);
        partyMeals.add(Meal.ChicagoStylePizza);
        partyFacade.preparePartyMeals(partyMeals);
        System.out.println("--------------------------------------------------------------");

        System.out.println("Enjoy Movie with Meal and Drink");
        System.out.println("Movie Completed");
        System.out.println("--------------------------------------------------------------");
        partyFacade.stopMovie();
        System.out.println("--------------------------------------------------------------");
        partyFacade.closeKitchen();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Done!");
    }
}
