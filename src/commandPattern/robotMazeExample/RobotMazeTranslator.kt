package commandPattern.robotMazeExample

class RobotMazeTranslator(
    private val maze: Maze
) {
    fun moveRobotToPosition(mazeRobot: MazeRobot, position: IndexPosition) {
        maze.swapCellsAt(
            firstCellPosition = mazeRobot.currentPosition,
            secondCellPosition = position
        )
    }

}