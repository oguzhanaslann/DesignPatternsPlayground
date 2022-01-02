package observerPattern.blogAPIExample

class NormalAuthor(
    id:String,
    name:String,
    private val blogService: BlogService
) : Author(id, name) {

    private lateinit var blog : Blog

    override fun writeBlog() {
       blog = Blog(
           title = "Some Normal Title",
           body = "...",
           tags = "#tag#normal",
           author = this
       )
    }

    override fun publishBlog() {

        if (hasWroteBlog()){
            blogService.publishBlog(blog)
        } else {
            System.err.println()
        }

    }

    private fun hasWroteBlog() = this::blog.isInitialized
}