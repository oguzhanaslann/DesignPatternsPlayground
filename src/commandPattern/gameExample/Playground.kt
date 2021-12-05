package commandPattern.gameExample

import commandPattern.gameExample.skills.ArmorBoost
import commandPattern.gameExample.skills.Healing
import commandPattern.gameExample.skills.MagicResistBoost
import commandPattern.gameExample.skills.MovementSpeedBoost

fun main() {

    var moriverSkills = mutableListOf<Command>()

    val moriver = Character(
        name = "Moriver"
    )

    moriverSkills.add(Healing(moriver,10))
    moriverSkills.add(ArmorBoost(moriver,10))
    moriverSkills.add(MagicResistBoost(moriver,10))
    moriverSkills.add(MovementSpeedBoost(moriver,10))

    moriver.skills = moriverSkills.toTypedArray()

    moriver.onQPressed()
    moriver.onWPressed()
    moriver.onEPressed()
    moriver.onRPressed()

}