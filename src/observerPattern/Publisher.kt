package observerPattern

interface Publisher<T> {
    fun subscribe(observer: Observer<T>)
    fun unsubscribe(observer: Observer<T>)
    fun publish(data: T)
}