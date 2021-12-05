package commandPattern.gameExample.skills

import commandPattern.gameExample.Character
import commandPattern.gameExample.Command

class ArmorBoost(
    private val character: Character,
    private val increaseAmount: Int
) : Command {
    override fun execute() {
        character.increaseArmor(increaseAmount)
    }
}