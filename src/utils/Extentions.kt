package utils

fun <T> Collection<T>.removeIfExists(t: T)  : Collection<T>{
    if (this.contains(t)) {
        val list = this.toMutableList()
        list.remove(t)
        return list
    }
    return this
}


fun <T> Collection<T>.notContains(t:T) : Boolean = this.contains(t).not()