package commandPattern.robotMazeExample

class RobotMazeTranslator(
    private val maze: Maze
) {
    fun moveRobotToPosition(mazeRobot: MazeRobot, position: IndexPosition)  : Boolean {
        val isSwapped = maze.swapCellsAt(
            firstCellPosition = mazeRobot.currentPosition,
            secondCellPosition = position
        )

        return isSwapped
    }

    fun placeRobotTo(robot: MazeRobot, currentPosition: IndexPosition) {
        maze.placeSymbolical(robot, currentPosition)
    }

}