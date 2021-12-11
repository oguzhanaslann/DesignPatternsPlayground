package iteratorPattern.playerExample

data class Song(
    val name : String
) {
    fun start() {
        println("$name started")
    }

    fun stop() {
        println("$name stopped")
    }

}
