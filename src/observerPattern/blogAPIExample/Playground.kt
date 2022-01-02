package observerPattern.blogAPIExample

import observerPattern.Observer
import observerPattern.State
import java.util.*


fun main() {

    val service = BlogAPIService()

    val oguzhan = NormalAuthor(
        id = UUID.randomUUID().toString(),
        "Oğuzhan",
        service
    )

    val burc =  NormalAuthor(
        id = UUID.randomUUID().toString(),
        "Burç",
        service
    )

    val okan = object : Observer<List<Blog>> {
        override fun observe(t: State<List<Blog>>) {
            println("New Blogs recieved")
        }
    }


    service.subscribe(okan)

    oguzhan.writeBlog()
    oguzhan.publishBlog()



    burc.writeBlog()
    burc.publishBlog()

    service.unsubscribe(okan)


    burc.writeBlog()
    burc.publishBlog()

}