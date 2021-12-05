package commandPattern.robotMazeExample.commands

import commandPattern.robotMazeExample.MazeRobot

class MoveLeftCommand(private val mazeRobot: MazeRobot) :Command  {
    override fun execute() {
        mazeRobot.moveLeft()
    }
}