package factoryMethod.abstractFactory.factory

import factoryMethod.abstractFactory.weapon.Axe
import factoryMethod.abstractFactory.weapon.ShortSword
import factoryMethod.abstractFactory.weapon.Spear
import factoryMethod.abstractFactory.weapon.Sword

class ElvenWeaponFactory  : WeaponFactory{
    override fun createSword(): Sword {
        return Sword("Elven Sword")
    }

    override fun createSpear(): Spear {
        return  Spear("Elven Spear")
    }

    override fun createShortSword(): ShortSword {
        return  ShortSword("Elven ShortSword")
    }

    override fun createAxe(): Axe {
        return  Axe("Elven Axe")
    }

}