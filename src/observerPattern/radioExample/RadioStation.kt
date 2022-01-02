package observerPattern.radioExample

import observerPattern.Observer
import observerPattern.State
import utils.notContains

class RadioStation(
    private val name: String
) : Subject<String> {

    private val listeners = mutableListOf<Observer<String>>()

    private var song: State<String>? = null
        set(value) {
            if(value != field){
                field = value
                notifyObservers()
            }
        }

    override fun addObserver(observer: Observer<String>) {
        if (listeners.notContains(observer)) {
            println("$observer started listening $name")
            listeners.add(observer)
        }
    }

    override fun removeObserver(observer: Observer<String>) {
        if (listeners.contains(observer)) {
            println("$observer stopped listening $name")
            listeners.remove(observer)
        }
    }

    fun playSong(songName: String) {
        song = State(songName)
    }

    override fun notifyObservers() {
        song?.let {
            listeners.forEach { observer ->
                observer.observe(song!!)
            }
        }
    }
}