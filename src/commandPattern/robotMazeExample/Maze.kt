package commandPattern.robotMazeExample

import kotlin.math.abs

typealias MazeSize = Pair<Int, Int> // x - y
typealias YAxis = Array<XAxis>
typealias XAxis = Array<Cell>
typealias IndexPosition = Pair<Int,Int> // x - y
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


    fun placeSymbolical(symbolical: Symbolical,indexPosition: IndexPosition) {

        if (indexPosition.first < 0 ||indexPosition.first >= size.first) return

        if (indexPosition.second < 0 ||indexPosition.second >= size.second) return

        val cellAtPosition = mazeArray[indexPosition.second][indexPosition.first]

        if (cellAtPosition.isPlaceable()){
            mazeArray[indexPosition.second][indexPosition.first] = NonEmptyCell(symbolical,indexPosition.second,indexPosition.first)
        }

    }

    fun swapCellsAt(firstCellPosition: IndexPosition, secondCellPosition: IndexPosition) {

        if (abs((firstCellPosition.first - secondCellPosition.first)) > 1) return

        if (abs((firstCellPosition.second - secondCellPosition.second)) > 1) return

        if (firstCellPosition.first < 0 || firstCellPosition.first >= size.first) return
        if (firstCellPosition.second < 0 || firstCellPosition.second >= size.second) return

        if (secondCellPosition.first < 0 || secondCellPosition.first >= size.first) return
        if (secondCellPosition.second < 0 || secondCellPosition.second >= size.second) return

        val firstCell = mazeArray[firstCellPosition.second][firstCellPosition.first]
        val secondCell = mazeArray[secondCellPosition.second][secondCellPosition.first]

        if (firstCell.isWall() || secondCell.isWall()) return

        mazeArray[firstCellPosition.second][firstCellPosition.first] = secondCell
        mazeArray[secondCellPosition.second][secondCellPosition.first] = firstCell

    }

    fun getCellAt(indexPosition: IndexPosition ) :Cell? {
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
    fun isEmpty(): Boolean = isWall().not() && this is EmptyCell
    fun isNotEmpty(): Boolean = isWall().not() && this is NonEmptyCell
    fun isPlaceable() : Boolean = isWall().not() && isEmpty()
}

class EmptyCell(x: Int, y: Int) : Cell(' ', x, y)

class NonEmptyCell(symbolical: Symbolical, x: Int, y: Int) : Cell(symbolical.symbol, x, y)

sealed class Wall(symbol: Char, x: Int, y: Int) : Cell(symbol, x, y) {
    class VerticalWall(x: Int, y: Int) : Wall('|', x, y)
    class HorizontalWall(x: Int, y: Int) : Wall('—', x, y)
}
