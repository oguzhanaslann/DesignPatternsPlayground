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
    controller.submitProgram(
        listOf(
            MoveUpCommand(robot),
            MoveUpCommand(robot),
            MoveRightCommand(robot),
            MoveRightCommand(robot),
            MoveRightCommand(robot),
            MoveRightCommand(robot),
            MoveDownCommand(robot),
            MoveDownCommand(robot),
            MoveDownCommand(robot),
            MoveDownCommand(robot),
            MoveDownCommand(robot),
            MoveLeftCommand(robot),
            MoveLeftCommand(robot),
            MoveLeftCommand(robot),
            MoveLeftCommand(robot),
            MoveLeftCommand(robot),
            MoveUpCommand(robot),
            MoveUpCommand(robot),
            MoveUpCommand(robot),
            MoveUpCommand(robot),
            MoveUpCommand(robot),
        )
    )


    println(maze)

    controller.start {
        println(maze)
    }
}