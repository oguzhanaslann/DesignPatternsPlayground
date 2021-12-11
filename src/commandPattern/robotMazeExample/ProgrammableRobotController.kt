package commandPattern.robotMazeExample

import commandPattern.robotMazeExample.commands.Command

class ProgrammableRobotController {
    private var program = emptyList<Command>()

    fun submitProgram(
        program : List<Command>
    ) {
        this.program = program
    }

    fun start(onEachIteration : () -> Unit ){
        if (program.isEmpty()) {
            println("Programm is empty ")
            return
        }

        program.forEach {
            it.execute()
            onEachIteration()
        }
    }

}