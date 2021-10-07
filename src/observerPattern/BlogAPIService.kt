package observerPattern

import utils.notContains

typealias BlogList = List<Blog>

class BlogAPIService : BlogService, Publisher<BlogList> {

    private var blogsInService = mutableListOf<Blog>()
        set(value) {
            if (field != value) publish(value)
            field = value
        }

    private val serviceListeners = mutableListOf<Observer<BlogList>>()

    override fun publishBlog(blog: Blog) {
        blogsInService = blogsInService.toMutableList()
            .also {
                it.add(blog)
            }
    }

    override fun subscribe(observer: Observer<BlogList>) {
        if (serviceListeners.notContains(observer)) {
            serviceListeners.add(observer)
        }
    }

    override fun unsubscribe(observer: Observer<BlogList>) {
        if (serviceListeners.contains(observer)) {
            serviceListeners.remove(observer)
        }
    }

    override fun publish(data: BlogList) {
        serviceListeners.forEach { observer ->
            val copyData = data.toList()
            observer.observe(
                State(copyData)
            )
        }
    }
}