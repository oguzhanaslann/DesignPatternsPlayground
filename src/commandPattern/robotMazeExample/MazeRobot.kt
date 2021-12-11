package commandPattern.robotMazeExample

class MazeRobot(
    var currentPosition: IndexPosition,
    val robotMazeTranslator: RobotMazeTranslator,
    private val robotSymbol: Char
) : Symbolical {

    override fun getSymbol(): Char = robotSymbol


    init {
        robotMazeTranslator.placeRobotTo(this,currentPosition)
    }

    fun moveUp() {
        val upperPosition = currentPosition.first to (currentPosition.second - 1)
        val isSwapped  = robotMazeTranslator.moveRobotToPosition(this, upperPosition)
        takeActionIfMoved(isSwapped,upperPosition)
    }

    private fun takeActionIfMoved(swapped: Boolean, position: Pair<Int, Int>) {
        if (swapped){
            onSwapped(position)
        }
    }

    private fun onSwapped(position: Pair<Int, Int>) {
        currentPosition = position
    }

    fun moveDown() {
        val bottomPosition = currentPosition.first to (currentPosition.second + 1)
        val isSwapped  = robotMazeTranslator.moveRobotToPosition(this, bottomPosition)
        takeActionIfMoved(isSwapped,bottomPosition)
    }

    fun moveLeft() {
        val leftPosition = (currentPosition.first - 1 ) to currentPosition.second
        val isSwapped  = robotMazeTranslator.moveRobotToPosition(this, leftPosition)
        takeActionIfMoved(isSwapped,leftPosition)
    }

    fun moveRight() {
        val rightPosition = (currentPosition.first + 1 ) to currentPosition.second
        val isSwapped  = robotMazeTranslator.moveRobotToPosition(this, rightPosition)
        takeActionIfMoved(isSwapped,rightPosition)
    }

}