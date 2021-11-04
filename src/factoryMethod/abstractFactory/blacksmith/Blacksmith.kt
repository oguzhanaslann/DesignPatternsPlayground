package factoryMethod.abstractFactory.blacksmith

import factoryMethod.abstractFactory.factory.WeaponFactory
import factoryMethod.abstractFactory.weapon.Weapon
import factoryMethod.abstractFactory.weapon.WeaponType

class Blacksmith(
    private val weaponFactory: WeaponFactory
) {

    fun createWeapon(weaponType: WeaponType) : Weapon {
        return when(weaponType){
            WeaponType.Sword -> weaponFactory.createSword()
            WeaponType.Spear -> weaponFactory.createSpear()
            WeaponType.Axe -> weaponFactory.createAxe()
            WeaponType.ShortSword -> weaponFactory.createShortSword()
        }
    }

}