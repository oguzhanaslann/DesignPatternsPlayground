package commandPattern.robotMazeExample

import commandPattern.robotMazeExample.commands.MoveDownCommand
import commandPattern.robotMazeExample.commands.MoveLeftCommand
import commandPattern.robotMazeExample.commands.MoveRightCommand
import commandPattern.robotMazeExample.commands.MoveUpCommand


fun main() {
    val controller = ProgrammableRobotController()
    val maze = Maze()
    val robotMazeTranslator = RobotMazeTranslator(maze)
    val robot = MazeRobot(
        currentPosition = 2 to 3,
        robotMazeTranslator = robotMazeTranslator,
        robotSymbol = '*'
    )
    controller.program = listOf(
        MoveUpCommand(robot),
        MoveDownCommand(robot),
        MoveLeftCommand(robot),
        MoveRightCommand(robot),
    )


    println(maze)

    controller.start {
        println(maze)
    }
}