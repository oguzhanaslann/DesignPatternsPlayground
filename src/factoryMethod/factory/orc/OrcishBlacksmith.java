package factoryMethod.factory.orc;

import factoryMethod.factory.Blacksmith;
import factoryMethod.weapon.Weapon;
import factoryMethod.weapon.WeaponTypes;
import factoryMethod.weapon.orc.OrchishSword;
import factoryMethod.weapon.orc.OrcishAxe;
import factoryMethod.weapon.orc.OrcishShortSword;
import factoryMethod.weapon.orc.OrcishSpear;

public class OrcishBlacksmith extends Blacksmith {


    @Override
    public Weapon create(WeaponTypes weaponType) {
        switch (weaponType) {

            case Sword -> {
                return new OrchishSword();
            }
            case Spear -> {
                return new OrcishSpear();

            }
            case Axe -> {
                return new OrcishAxe();

            }
            case ShortSword -> {
                return new OrcishShortSword();
            }
            default -> {
                return null;
            }
        }
    }
}
