package commandPattern.robotMazeExample

class MazeRobot(
    val currentPosition: IndexPosition,
    val robotMazeTranslator: RobotMazeTranslator,
    private val robotSymbol: Char
) : Symbolical {

    override fun getSymbol(): Char = robotSymbol

    fun moveUp() {
        val upperPosition = currentPosition.first to (currentPosition.second - 1)
        robotMazeTranslator.moveRobotToPosition(this, upperPosition)
    }

    fun moveDown() {
        val bottomPosition = currentPosition.first to (currentPosition.second + 1)
        robotMazeTranslator.moveRobotToPosition(this, bottomPosition)
    }

    fun moveLeft() {
        val leftPosition = (currentPosition.first - 1 ) to currentPosition.second
        robotMazeTranslator.moveRobotToPosition(this, leftPosition)
    }

    fun moveRight() {
        val rightPosition = (currentPosition.first + 1 ) to currentPosition.second
        robotMazeTranslator.moveRobotToPosition(this, rightPosition)
    }

}