package commandPattern.robotMazeExample

typealias MazeSize = Pair<Int, Int> // x - y
typealias YAxis = Array<XAxis>
typealias XAxis = Array<Cell>
typealias IndexPosition = Pair<Int, Int> // x - y

class Maze(val size: MazeSize = 8 to 8) {

    private val mazeArray = YAxis(
        size = size.second,
        init = { yIndex ->

            XAxis(
                size = size.first,
                init = { xIndex ->
                    when {
                        yIndex == 0 || yIndex == size.second - 1 -> {
                            Wall.HorizontalWall(x = xIndex, y = yIndex)
                        }
                        xIndex == 0 || xIndex == size.first - 1 -> {
                            Wall.VerticalWall(x = xIndex, y = yIndex)
                        }
                        else -> {
                            EmptyCell(x = xIndex, y = yIndex)
                        }
                    }
                }
            )
        }
    )


    fun placeSymbolical(symbolical: Symbolical, indexPosition: IndexPosition) {

        if (indexPosition.first < 0 || indexPosition.first >= size.first) return

        if (indexPosition.second < 0 || indexPosition.second >= size.second) return

        val cellAtPosition = mazeArray[indexPosition.second][indexPosition.first]

        if (cellAtPosition.isPlaceable()) {
            mazeArray[indexPosition.second][indexPosition.first] =
                NonEmptyCell(symbolical, indexPosition.second, indexPosition.first)
        }

    }

    fun swapCellsAt(firstCellPosition: IndexPosition, secondCellPosition: IndexPosition): Boolean {

        val isValidPositions = getIsValidPositions(firstCellPosition, secondCellPosition)

        var isSwapped = isValidPositions

        if (isValidPositions) {

            val firstCell = getCellAt(firstCellPosition)
            val secondCell = getCellAt(secondCellPosition)

            val canCellsBeSwapped = firstCell != null && secondCell != null  && firstCell.isNotWall() && secondCell.isNotWall()

            if (canCellsBeSwapped) {
                swapCells(firstCell!! to firstCellPosition, secondCell!! to secondCellPosition)
            } else {
                System.err.println("Wall cannot be replaced")
            }

            isSwapped =  canCellsBeSwapped

        }

        return isSwapped
    }

    private fun swapCells(firstCellPair: Pair<Cell, IndexPosition>, secondCellPair: Pair<Cell, IndexPosition>) {
        val firstCellPosition = firstCellPair.second
        val firstCell = firstCellPair.first

        val secondCellPosition = secondCellPair.second
        val secondCell = secondCellPair.first

        mazeArray[firstCellPosition.second][firstCellPosition.first] = secondCell
        mazeArray[secondCellPosition.second][secondCellPosition.first] = firstCell
    }

    private fun getIsValidPositions(firstCellPosition: Pair<Int, Int>, secondCellPosition: Pair<Int, Int>): Boolean {
        if (firstCellPosition.first == secondCellPosition.first && firstCellPosition.second == secondCellPosition.second) {
            System.err.println("Maze cannot swap same cell with itself ")
            return false
        }

        if (firstCellPosition.first < 0 || firstCellPosition.first >= size.first) {
            System.err.println("First position x-axis is out of range")
            return false
        }
        if (firstCellPosition.second < 0 || firstCellPosition.second >= size.second) {
            System.err.println("First position y-axis is out of range")
            return false
        }

        if (secondCellPosition.first < 0 || secondCellPosition.first >= size.first) {
            System.err.println("Second position  x-axis is out of range")
            return false
        }
        if (secondCellPosition.second < 0 || secondCellPosition.second >= size.second) {
            System.err.println("Second position  y-axis is out of range")
            return false
        }
        return true
    }

    fun getCellAt(indexPosition: IndexPosition): Cell? {
        return mazeArray.getOrNull(indexPosition.second)?.getOrNull(indexPosition.first)
    }

    override fun toString(): String {
        val mazeBuilder = StringBuilder()
        mazeArray.forEach {

            it.forEach { mazeChar ->
                mazeBuilder.append(mazeChar.symbol).append("\t")
            }

            mazeBuilder.append("\n")
        }

        return mazeBuilder.toString()
    }
}

abstract class Cell(val symbol: Char, val x: Int, val y: Int) {
    fun isWall(): Boolean = this is Wall
    fun isNotWall(): Boolean = this !is Wall
    fun isEmpty(): Boolean = isWall().not() && this is EmptyCell
    fun isNotEmpty(): Boolean = isWall().not() && this is NonEmptyCell
    fun isPlaceable(): Boolean = isWall().not() && isEmpty()
}

class EmptyCell(x: Int, y: Int) : Cell(' ', x, y)

class NonEmptyCell(symbolical: Symbolical, x: Int, y: Int) : Cell(symbolical.symbol, x, y)

sealed class Wall(symbol: Char, x: Int, y: Int) : Cell(symbol, x, y) {
    class VerticalWall(x: Int, y: Int) : Wall('|', x, y)
    class HorizontalWall(x: Int, y: Int) : Wall('—', x, y)
}
