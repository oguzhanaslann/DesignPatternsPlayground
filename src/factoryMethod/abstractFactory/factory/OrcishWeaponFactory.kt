package factoryMethod.abstractFactory.factory

import factoryMethod.abstractFactory.weapon.Axe
import factoryMethod.abstractFactory.weapon.ShortSword
import factoryMethod.abstractFactory.weapon.Spear
import factoryMethod.abstractFactory.weapon.Sword

class OrcishWeaponFactory : WeaponFactory {
    override fun createSword(): Sword {
        return Sword("orc Sword")
    }

    override fun createSpear(): Spear {
        return Spear("orc Spear")
    }

    override fun createShortSword(): ShortSword {
        return  ShortSword("orc ShortSword")
    }

    override fun createAxe(): Axe {
        return Axe("orc Axe")
    }

}