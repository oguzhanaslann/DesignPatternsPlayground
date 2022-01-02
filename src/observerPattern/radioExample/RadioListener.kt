package observerPattern.radioExample

import observerPattern.Observer
import observerPattern.State

class RadioListener(
    private val name : String,
    private var radioStation: RadioStation
) : Observer<String> {

    init {
        radioStation.addObserver(this)
    }

    override fun observe(t: State<String>) {
        println("$name started listening ${t.stateData}")
    }


}