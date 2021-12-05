package commandPattern.robotMazeExample.commands

import commandPattern.robotMazeExample.MazeRobot

class MoveDownCommand(private val mazeRobot: MazeRobot) :Command {
    override fun execute() {
        mazeRobot.moveDown()
    }
}