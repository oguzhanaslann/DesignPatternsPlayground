package observerPattern

interface Observer<T> {
    fun observe(t: State<T>)
}