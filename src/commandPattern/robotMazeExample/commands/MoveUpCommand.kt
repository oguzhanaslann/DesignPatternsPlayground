package commandPattern.robotMazeExample.commands

import commandPattern.robotMazeExample.MazeRobot

class MoveUpCommand(private val mazeRobot: MazeRobot) :Command  {
    override fun execute() {
        mazeRobot.moveUp()
    }
}