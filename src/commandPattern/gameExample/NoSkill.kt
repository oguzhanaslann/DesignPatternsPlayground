package commandPattern.gameExample

object NoSkill : Command {
    override fun execute() {
        println("No skilled assigned yet ")
    }
}