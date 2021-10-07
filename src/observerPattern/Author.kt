package observerPattern

abstract class Author(
    val id : String,
    val name: String
) {
    abstract fun writeBlog()
    abstract fun publishBlog()
}