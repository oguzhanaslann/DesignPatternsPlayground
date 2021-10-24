package factoryMethod.factory.elve;

import factoryMethod.factory.Blacksmith;
import factoryMethod.weapon.Weapon;
import factoryMethod.weapon.WeaponTypes;
import factoryMethod.weapon.elve.ElvenAxe;
import factoryMethod.weapon.elve.ElvenShortSword;
import factoryMethod.weapon.elve.ElvenSpear;
import factoryMethod.weapon.elve.ElvenSword;

public class ElvenBlacksmith extends Blacksmith {

    @Override
    public Weapon create(WeaponTypes weaponType) {
        switch (weaponType) {

            case Sword -> {
                return new ElvenSword();
            }
            case Spear -> {
                return new ElvenSpear();

            }
            case Axe -> {
                return new ElvenAxe();

            }
            case ShortSword -> {
                return new ElvenShortSword();
            }
            default -> {
                return null ;
            }
        }
    }
}
