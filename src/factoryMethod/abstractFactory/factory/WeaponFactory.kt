package factoryMethod.abstractFactory.factory

import factoryMethod.abstractFactory.weapon.Axe
import factoryMethod.abstractFactory.weapon.ShortSword
import factoryMethod.abstractFactory.weapon.Spear
import factoryMethod.abstractFactory.weapon.Sword

interface WeaponFactory {
    fun createSword() : Sword
    fun createSpear() : Spear
    fun createShortSword() : ShortSword
    fun createAxe() : Axe
}