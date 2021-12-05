package commandPattern.gameExample

import kotlin.math.min

data class Character(
    val name: String,
) : Invoker {
    private var health: Int = MAX_HEALTH

    private var movementSpeed: Int = DEFAULT_SPEED

    private var armor: Int = DEFAULT_ARMOR

    private var magicResist: Int = DEFAULT_MR

    var skills: Array<Command> = Array(size = 4, init = { NoSkill })
        set(value) {
            value.getOrNull(Q)?.let {
                skills[Q] = it
            }

            value.getOrNull(W)?.let {
                skills[W] = it
            }

            value.getOrNull(E)?.let {
                skills[E] = it
            }

            value.getOrNull(R)?.let {
                skills[R] = it
            }
            field = field
        }



    fun increaseHealth(increaseAmount: Int) {
        val increasedHealth = (health + increaseAmount)
        println("increaseMovementSpeed current health : $health")
        health = min(increasedHealth, MAX_HEALTH)
        println("increaseMovementSpeed updated health : $health")

    }

    fun increaseMovementSpeed(increaseAmount: Int) {
        val increasedSpeed = (movementSpeed + increaseAmount)
        println("increaseMovementSpeed current speed : $movementSpeed")
        movementSpeed = min(increasedSpeed, MAX_CHARACTER_SPEED)
        println("increaseMovementSpeed updated speed : $movementSpeed")
    }

    fun increaseArmor(increaseAmount: Int) {
        val increasedSpeed = (armor + increaseAmount)
        println("increaseMovementSpeed current armor : $armor")
        armor = min(increasedSpeed, MAX_ARMOR)
        println("increaseMovementSpeed updated armor : $armor")

    }

    fun increaseMagicResist(increaseAmount: Int) {
        val increasedSpeed = (magicResist + increaseAmount)
        println("increaseMovementSpeed current magicResist : $magicResist")
        magicResist = min(increasedSpeed, MAX_MR)
        println("increaseMovementSpeed updated magicResist : $magicResist")

    }



    override fun onQPressed() {
        skills[Q].execute()
    }

    override fun onWPressed() {
        skills[W].execute()
    }

    override fun onEPressed() {
        skills[E].execute()
    }

    override fun onRPressed() {
        skills[R].execute()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Character

        if (name != other.name) return false
        if (!skills.contentEquals(other.skills)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + skills.contentHashCode()
        return result
    }




    companion object {
        const val Q = 0
        const val W = 1
        const val E = 2
        const val R = 3
        const val MAX_HEALTH = 100
        const val DEFAULT_SPEED = 350
        const val DEFAULT_ARMOR = 80
        const val MAX_ARMOR = 500
        const val DEFAULT_MR = 80
        const val MAX_MR = 500
        const val MAX_CHARACTER_SPEED = 1000
    }

}

