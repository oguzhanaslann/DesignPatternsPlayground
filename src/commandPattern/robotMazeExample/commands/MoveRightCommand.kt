package commandPattern.robotMazeExample.commands

import commandPattern.robotMazeExample.MazeRobot

class MoveRightCommand(private val mazeRobot: MazeRobot) :Command  {
    override fun execute() {
        mazeRobot.moveRight()
    }
}