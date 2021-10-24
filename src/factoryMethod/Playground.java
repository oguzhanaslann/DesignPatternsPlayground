package factoryMethod;

import factoryMethod.factory.Blacksmith;
import factoryMethod.factory.elve.ElvenBlacksmith;
import factoryMethod.factory.orc.OrcishBlacksmith;
import factoryMethod.weapon.WeaponTypes;

public class Playground {
    public static void main(String[] args) {

        Blacksmith elveBlacksmith  = new ElvenBlacksmith();
        Blacksmith orcishBlacksmith  = new OrcishBlacksmith();

        WeaponTypes spear = WeaponTypes.Spear;
        System.out.println(elveBlacksmith.create(spear).getName());
        System.out.println(orcishBlacksmith.create(spear).getName());

        System.out.println();

        WeaponTypes sword = WeaponTypes.Sword;
        System.out.println(elveBlacksmith.create(sword).getName());
        System.out.println(orcishBlacksmith.create(sword).getName());

    }
}
