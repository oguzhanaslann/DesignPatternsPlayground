package observerPattern.radioExample

import observerPattern.Observer

interface Subject<T> {
    fun addObserver(observer: Observer<T>)
    fun removeObserver(observer: Observer<T>)
    fun notifyObservers()
}