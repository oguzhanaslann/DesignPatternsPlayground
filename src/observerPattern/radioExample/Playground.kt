package observerPattern.radioExample

fun main() {
    val station = RadioStation("FM radio")
    val listenerX  = RadioListener("X",station)
    val listenerY  = RadioListener("Y",station)
    val listenerZ  = RadioListener("Z",station)

    station.playSong("BLABLABLA")
    station.removeObserver(listenerY)
    station.playSong("BLABxxxxxxxxxLABLA")

}