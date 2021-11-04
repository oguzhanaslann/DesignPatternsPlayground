package factoryMethod.abstractFactory

import factoryMethod.abstractFactory.blacksmith.Blacksmith
import factoryMethod.abstractFactory.factory.ElvenWeaponFactory
import factoryMethod.abstractFactory.factory.OrcishWeaponFactory
import factoryMethod.abstractFactory.weapon.WeaponType

fun main() {
    val elvenWeaponFactory = ElvenWeaponFactory()
    val orcishWeaponFactory = OrcishWeaponFactory()

    val orchBlacksmith = Blacksmith(orcishWeaponFactory)
    val elvenBlacksmith = Blacksmith(elvenWeaponFactory)

    println(orchBlacksmith.createWeapon(WeaponType.Sword).name)
    println(orchBlacksmith.createWeapon(WeaponType.Axe).name)
    println()
    println(elvenBlacksmith.createWeapon(WeaponType.Sword).name)
    println(elvenBlacksmith.createWeapon(WeaponType.Axe).name)
}