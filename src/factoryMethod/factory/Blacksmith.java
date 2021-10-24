package factoryMethod.factory;

import factoryMethod.weapon.Weapon;
import factoryMethod.weapon.WeaponTypes;

public abstract class Blacksmith {
    public abstract Weapon create(WeaponTypes weaponType);
}
