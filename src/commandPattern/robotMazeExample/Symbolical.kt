package commandPattern.robotMazeExample

interface Symbolical {
    fun getSymbol(): Char
}

val Symbolical.symbol: Char
    get() = this.getSymbol()