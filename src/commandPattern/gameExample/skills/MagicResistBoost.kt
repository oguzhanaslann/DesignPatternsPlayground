package commandPattern.gameExample.skills

import commandPattern.gameExample.Character
import commandPattern.gameExample.Command

class MagicResistBoost(
    private val character: Character,
    private val increaseAmount: Int
) : Command {

    override fun execute() {
        character.increaseMagicResist(increaseAmount)
    }
}